import java.util.*; 
 class  ArraySum
{  static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{   
		System.out.print("Please Enter the Size of array = ");
		int size=s.nextInt();
		array(size);
	}
		
	static void array(int size)	
   { 	int[] a=new int[size];
		int sum=0;
		System.out.print("please Enter the array = ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=s.nextInt();
		}
		System.out.print("Array is = ");
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i]);
			sum=sum+a[i];
		}
		System.out.println("\nsum is = "+sum);
   }
}
