class ConstEmp
{
int salary;
void ConstEmp(ConstEmp this)
{
this.salary =25000;
System.out.println("hello");
System.out.println(salary);
}
public static void main(String... s)
{
new ConstEmp().ConstEmp();
System.out.println("hello");
}

}