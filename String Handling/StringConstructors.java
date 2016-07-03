class StringConstructors
{
public static void main(String... s)
{
	/*
	1. new String() ---> unnecessary constructor
	2. String(String s) ---> se program "OneOrTwoString.java"
	3. String(char ch[]) ---> converts char array to a string
	4. String(char ch[], int pos, int noOfChar)
	5. String(byte b[])  ---->coverts ASCII code into a string
	6. String(byte b[], int pos, int noOfChar)
	*/

	char ch[] = {'i','n','d','i','a'};
	
	String s1 = new String(ch,1,3);
	System.out.println(s1);
	
	byte b[] = {65,66,67,68,69};
	String s2 = new String(b,1,3);
	System.out.println(s2);
	
	

}

}