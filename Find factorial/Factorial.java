import java.util.*;
class Factorial 
{    static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Plese enetr the no = ");
		int n=s.nextInt();
		int fact=1;
		for(int i=n; i>=1; i--)
		{ 
            fact*=i;
		}
		System.out.println("Fact ="+fact);


	}
}
