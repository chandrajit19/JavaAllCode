import java.util.*;
class Merg2 {
public static void main(String[] args)
{ 
		Scanner s=new Scanner(System.in);
		System.out.print("enter the size of first array = ");
		int size1=s.nextInt();
		System.out.print("Enter the array = ");
		int[] a1=new int[size1];
		for(int i=0; i<a1.length; i++)   //1,3
			{                            // 1,2,4,5,7
			   a1[i]=s.nextInt();
			}
		System.out.print("enter the size of second array = ");
		int size2=s.nextInt();
		System.out.print("Enter the array = ");
		int[] a2=new int[size2];
		for(int i=0; i<a2.length; i++)
			{
			   a2[i]=s.nextInt();
			}
		int i=0,k=0, j=0;
		int[] ns=new int[a1.length+a2.length];
		for(k=0; k<ns.length; k++)
		{   
			if(k%2==0&& i<a1.length)
			{ 
				ns[k]=a1[i];
				i++;
           
			}
			else if(k%2!=0&& j<a2.length)
			{
				ns[k]=a2[j];
				j++;
		    }
			else
			{
				if(i<a1.length)
				{   
					ns[k]=a1[i];
				    i++;
				}
				else
				{
					ns[k]=a2[j];
			       	j++;
				}
             }
}
		for(k=0; k<ns.length; k++)
		  {
			System.out.print(ns[k]+" ");
		  }
		}
	}

