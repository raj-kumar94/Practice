import java.sql.*;
import java.util.*;

class TestInsert
{
public static void main(String... st)
{
	try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver()); //didnt use Class.forName() method for loading drivers
			
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rajkumar");
			
			int a= 2;
			String t[] = {"kumar","gaurav","jamia","delhi"};
			
			Statement s = c.createStatement();
			
			int x = s.executeUpdate("insert into Persons values("+a+",'"+t[0]+"','"+t[1]+"','"+t[2]+"','"+t[3]+"')");
			// "insert into employee values('" + id + "','" +  fName + "'...)"
			//sql = "insert into employee values(" + id + ",'" +  fName + "','" +  lName + "'," +  age + ")";
			
			System.out.println(x);
			
			ResultSet result1 =s.executeQuery("select * from Persons");
			
			while(result1.next())
			{
				System.out.println(result1.getString("FirstName")+"="+result1.getString(2));
		
			}
			
			
		} catch(SQLException e)
		{
		System.out.println(e);
		}
		catch(Exception i)
		{
		System.out.println(i);
		}
}

}