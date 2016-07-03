interface my
{
   void show();
}

class Temp implements my
{
	public void show()
	{
		System.out.println("show");
	}
	
}
	
class child extends Temp implements my
{
	public String toString()
	{
		return "wow";
	}

	public static void main(String... s)
	{
		my m = new child();
		
		String s1=m.toString();
		System.out.println(s1);	
	}
	
}