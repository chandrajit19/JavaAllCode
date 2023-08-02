import java.util.*;
class Series 
{
	 static double display(int n)
	{
		 double sum=0;
		 double num=0;
		 double dum=1;
	
		 for(int i=1; i<=n; i++)
		{     
			
			 
			  num=num+(i);
			  dum=dum*(i);
			  double term=num/dum;
			  sum=sum+term;
			  System.out.print(num+"/"+dum+"  ");
		}
		return sum;
	}




	public static void main(String[] args) 
	{   Scanner s= new Scanner(System.in);
		System.out.println("enter a number = ");
	    int n=s.nextInt();
		System.out.println(display(n));
	}
}
