import java.util.*;
class PrimeSeries  
{
	public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
		System.out.println("Enter the +ve number till where you wanna take prime no = ");
		int n=s.nextInt();
		System.out.println("please enter the duminator = ");
		double a=s.nextDouble();
		System.out.print("Series is = ");
		double dum=1;
		double sum=0;
		
		for(double i=1; i<=n; i++ )
		{    int count=0;
           for(int j=1; j<=i ; j++)
           {   
			   if(i%j==0)
			   {
				   count++;
			   }
           }
		   if(count==2)
			{ 
			   dum=dum*a;
			   System.out.print(i+ "/"+dum+", ");
			   sum=sum+ i/dum;
			}
	    }
		System.out.println("\nsum is = "+sum);
	}
}
