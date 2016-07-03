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
	public static void main(String... s)
	{
		my m = new Temp();
		
		String s1=m.toString();
		System.out.println(s1);	
	}
}
	
class child extends Temp implements my
{
	public String toString()
	{
		return "wow";
	}

	
	
}