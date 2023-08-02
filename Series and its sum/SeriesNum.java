import java.util.*;
class SeriesNum 
{   
   
    static int series(int n)
	{   int sum=0;
         for(int i=1; i<=n; i++)
		{
			 System.out.print(i+ " ");
			 sum=sum+i;
		}
		
     return sum;
	}


	public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
		System.out.println("Please enter a pisitive no= ");
		int x=s.nextInt();
		
		System.out.println("\n"+series(x)); 
	}
}
