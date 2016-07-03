class StringMethods
{
public static void main(String... s)
{
	String s1= "Hello";
	String s2 = "India is a Good Country";
	
	//1. toCharArray[]
	char ch[] = s1.toCharArray();
	System.out.println(ch[4]);
	
	//2. getBytes()  --> converts into array of ASCII characters
	byte b[] = s1.getBytes();
	System.out.println(b[3]);
	
	//3.charAt();
	// 4. toUpperCase();
	//5. trim();
	//6. subString();
	System.out.println("Substring: "+s2.substring(10));
	System.out.println("Substring: "+s2.substring(3,6));
	
	//7. indexOf('i') or	indexOf('i',2) or indexOf('india',2)
	//8. lastIndexOf()
	//9. valueOf()
	
	System.out.println("valueOf: "+Integer.valueOf('a'));  // a= 97
	


}




}