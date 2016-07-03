import java.sql.*;
import java.util.*;

class TestUpdate
{
public static void main(String... st)
{
	try{
			Driver d = new oracle.jdbc.driver.OracleDriver();
			Properties dbProp = new Properties();
			
			dbProp.put("user","system");
			dbProp.put("password","rajkumar");
			
			
			Connection c = d.connect("jdbc:oracle:thin:@localhost:1521:xe",dbProp);
			
			
			String t= "Chachi";
			String t1 = "2";
			
			Statement s = c.createStatement();
			
			int x = s.executeUpdate("update Persons set FirstName='"+t+"' where PersonID ='"+2+"'");
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