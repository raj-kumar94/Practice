interface my
{
   default void show()
 {
 System.out.println("show rom interface");
 }
}

class Interf implements my
{
 
 /*public void show()
		{
			System.out.println("show from class");
		}   */
public static void main(String... s)
{
	my m = new Interf();
	m.show();
}


} 

