import java.util.*; 
 class  ArrayEvenOdd
{  static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{   
		System.out.print("Please Enter the Size of array = ");
		int size=s.nextInt();
		array(size);
	}
		
	static void array(int size)	
   { 	int[] a=new int[size];
		int osum=0,esum=0;
		System.out.print("please Enter the array = ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=s.nextInt();
		}
		System.out.print("Array is = ");
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i]);
			if(i%2==0)
			{ osum=osum+a[i];
			}
			else
			{
				esum=esum+a[i];
			}
		}
		System.out.println("\n sum of odd place = "+osum);
		System.out.println("sum of even place = "+esum);
		System.out.println("substraction of oddplace and even place = "+(osum-esum));
   }
}
