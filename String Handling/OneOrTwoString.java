class OneOrTwoString
{
public static void main(String... s)
{
//String(String s)  --> this constructor needs a string
String s1 = new String("Hello"); //two objects will be created.. one in heap and one in pool
String s2= s1.intern();  //searches or s1's content i.e., "Hello" in the pool. if not found, creates a new one
if(s1==s2)
 System.out.println("Same"); 
 else
  System.out.println("s1 and s2 are Different"); //hmm.. maybe intern has created a new "Hello" object in pool memory
  
String s3 = new String("Hello"); //created a new "Hello" in heap 
String s4= s3.intern();  //searches for s3 in heap ie, "Hello" and it is already there... now s4 has RID of Hello in pool

if(s1.equalsIgnoreCase(s3))  //s2 and s4 are in pool memory area
 System.out.println("Same"); 
 else
  System.out.println("s2 and s4 are Different");

}



}