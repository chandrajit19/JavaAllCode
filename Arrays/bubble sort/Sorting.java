import java.util.*;
class Sorting 
{
	public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array= ");
	    int size=s.nextInt();
		int i=0, j=0;
		int[] a=new int[size];
		System.out.print("Please enter the elements = ");
		for(i=0; i<a.length; i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0; i<(a.length-1); i++)
		{
			for(j=0; j<(a.length-i-1); j++)
			{  if(j<=a.length/2)
				{
				   if(a[j]>a[j+1])
				     {
					  int temp=a[j];
				      a[j]=a[j+1];
					  a[j+1]=temp;
				      }
				}

				else if(j>a.length/2)
				{
					if(a[j]<a[j+1])
				       {
				    	int temp=a[j];
					    a[j]=a[j+1];
				    	a[j+1]=temp;
				       }
			    }
			}
		}
		for(j=0; j<a.length; j++)
		{
			System.out.print(a[j]+" ");
		}

	}
}
