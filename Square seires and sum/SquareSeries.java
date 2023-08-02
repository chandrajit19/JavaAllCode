import java.util.*;
class SquareSeries 
{   

    static  int series(int n)
	{
		int sum=0;
		int c;
		for(int i=1; i<=n; i++)
		{   
		    c=i*i;
			System.out.print(c+" ");
			sum=sum+c;
		}
		return sum;
	}

	public static void main(String[] args) 
	{  Scanner s=new Scanner(System.in);
	   System.out.println("enter a number= ");
	   int x=s.nextInt();
	   System.out.println("\n"+series(x));
	}
}
