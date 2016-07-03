public class Instance
	{
		String CName= "TCS";
		 String name;
		int salary;
		
		void get(String s1, int s2)
			{
				name= s1;
				salary= s2;
				
			}
		void show(){
			System.out.println(name+ " " + salary + " " + CName );
				
		}

		public static void main(String... s)

		{
			Instance I1 = new Instance();
			Instance I2 = new Instance();
			I1.get("Lalu", 101);
			I1.show();
			I2.get("Rawdi", 51);
			I2.show();

				
			System.out.println(I1);
		}

	}