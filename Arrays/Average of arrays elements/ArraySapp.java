import java.util.*;
class  ArraySapp
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("plese enter the size of array = ");
		int size=s.nextInt();
		int[] arr=new int[size];
		int i=0, j=0;
		System.out.print("please enter the array elements = ");
		for( i=0; i<arr.length; i++)
		{
			arr[i]=s.nextInt();
		
		for(j=i+1; j<arr.length-1; j++)
		{
			int temp;
			 temp=arr[j];
			 arr[j]=arr[j+1];
			 arr[j+1]=temp;
			
		}
		}
		 for(j=0; j<arr.length; j++)
		{
			 System.out.print(arr[j]+" ");
		}
		


	}
}
