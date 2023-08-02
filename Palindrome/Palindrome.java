import java.util.*;
class Palindrome 
{
	public static void main(String[] args) 
	{    Scanner s=new Scanner(System.in);
		System.out.print("PLease enter a number = ");
	    int n=s.nextInt();
		int org=n;
		int rev=0;
		
		while(org>=1)
		{   
			rev=(rev*10)+ org%10;
			org=org/10;
			
		}
		System.out.println("Reverse no is = "+rev);

		if(n==rev)
		{
			System.out.println(n+" is a palindrome no");
		}
			else
		{   System.out.println(n+" is not a palindrome no");
		}



	}
}
