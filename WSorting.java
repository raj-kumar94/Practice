class WSorting
{
public static void main(String... s)
{
int i,j,small,large;
int pos=0;
int[] a= {3,5,1,65,2,54};
small= a[0];
for(i=0;i<a.length;i++)
{
	if(small>a[i])
	small=a[i];
}
System.out.println("smallest element= "+ small);

		large=a[0];
		
	
		for(i=0;i<a.length;i++)
			{
				if(large<a[i])
				 {
				   large= a[i];
				    pos = i;
				   a[pos]= small;
				 }	
			}
			
		System.out.println("largest: "+ large);
		System.out.println("largest: "+ a[pos]);
			
	
	
}
}