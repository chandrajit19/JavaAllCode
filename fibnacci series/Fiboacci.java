import java.util.*;
class Fibonacci 
{
	public static void main(String[] args) 
	{     
		Scanner s= new Scanner(System.in);
	    System.out.println("Enetr a number");
		int n=s.nextInt();
		int x=0;
		int y=1;
		int z=0;
		for(int i=1; i<=n; i++)
		{
           System.out.print(z+" ,");
		   x=y;
		   y=z;
		   z=x+y;
		 

		}
   }
}
