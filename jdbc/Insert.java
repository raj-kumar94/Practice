import java.sql.*;
import java.util.Scanner;

class Insert
{
	public static void main(String... s)
	{
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rajkumar");
		
		String sqlQuery[]=new String[100];
		Scanner sc = new Scanner(System.in);
		
		String name,choice;
		int id,age;
		
		do{
		System.out.print("enter id: ");
		 id= sc.nextInt();
		System.out.print("enter Name: ");
		 name= sc.next();
		System.out.print("age: ");
		 age= sc.nextInt();
		
		String sql= "insert into guards(id, name, age) values(?, ?, ?)";
		PreparedStatement pstmt = c.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, age);
		
		int x= pstmt.executeUpdate();
		System.out.println("updated rows: "+x);
		System.out.println("Do you want to add some more entries (y/n)?");
		choice= sc.next();
		}while("y".equals(choice));
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}