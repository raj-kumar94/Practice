import java.sql.*;
import java.util.*;

class TestRetrieve
{
public static void main(String... st)
{
	try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rajkumar");
			
			Statement s = c.createStatement();
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