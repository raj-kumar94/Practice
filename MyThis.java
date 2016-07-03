class MyThis
{
int x= 10;

void get(MyThis this, int x)  //or void get(int x)
{
System.out.println(this + "get");
System.out.println(this.x);
System.out.println(x);

}

public static void main(String... s)
{
MyThis m = new MyThis();
System.out.println(m+ "main");
m.get(20);
}
}