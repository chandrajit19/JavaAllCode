import java.util.*;
class Armstrong 
{   
	public static void main(String[] args) 
	{   Scanner s= new Scanner(System.in);
		System.out.println("Enetr the number");
		int n=s.nextInt();
		int org=n;
		int a=n;
		int count=0;
		int t=0;
	  	
		 while(n>=1)     // int v=(int)Math.log10(n)+1 ;
		{
		    n=n/10;
			 count++ ;
		}
		System.out.println("Number od didgit = "+count);
         
		 while(org>=1)
		{  int ld=org%10;
		    org=org/10;
			int sum=1;
			for(int i=1; i<=count; i++)
			{   
				sum=sum*ld;
			}
			 t=t+sum;
		}
		if(t==a)
		{
			System.out.println(a+ " is an amstrong number");
		}
			else
		{   System.out.println(a+ " is not an amstrong number");
		}
    }

}	

		

         
		