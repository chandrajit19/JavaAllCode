import java.util.*;
class Factrorial 
{
	public static void main(String[] args) 
	{   Scanner s= new Scanner(System.in);
	     System.out.println("Enetr the no");
		 int n=s.nextInt();
		int c=facto(n);
		System.out.println(c);
		
	}
       
	static int facto(int n)
	{    int fact=1;  
		while(n>1)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
}
