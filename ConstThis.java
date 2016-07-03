class ConstThis
{
int salary;
void ConstThis()
{
System.out.println(this);
}

public static void main(String... s)
{
ConstThis e= new ConstThis();
System.out.println("hello");
System.out.println(e);
e.ConstThis();
}
}