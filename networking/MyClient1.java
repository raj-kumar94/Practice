import java.io.*;
import java.net.*;

//client class

public class MyClient1 {

	Socket s;
	DataInputStream din;
	DataOutputStream dout;
	
	public MyClient1()
	{
		try
		{
			s= new Socket("localhost",16);
			System.out.println(s);
			
			din= new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());
			
			ClientChat();
			
		} catch(Exception e){
			System.out.println(e);
		}
	}
		
		
		public void ClientChat() throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s2;
			
			do
			{
				s2 = br.readLine();
				dout.writeUTF(s2);
				dout.flush();
				System.out.println("Server message: "+ din.readUTF());
				
			} while(!s2.equals("stop"));
			
		}	
			
			public static void main(String args[])
			{
				new MyServer1();
			}
		
		
	}
	

