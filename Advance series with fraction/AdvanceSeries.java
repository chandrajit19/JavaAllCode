import java.util.*;
class AdvanceSeries 
{   
	static double series(int n, int x)
	{
      int i,a=1;
	  double sum=0;
	  double term;
		 
	  for (i=0; i<=n; i++ )
	  {
          term=Math.pow(x,i+1)*a/(2*i+1);
		  sum=sum+term;
		  a=a*(-1);
		  System.out.print(term+" ");

	  }
	  return sum;

	}
	public static void main(String[] args) 
	{  Scanner s=new Scanner(System.in);
		System.out.println("enter the value of x= ");
		int x=s.nextInt();
		System.out.println("enter the value of n= ");
		int n=s.nextInt();
		System.out.println(series(x, n));

	}
}
