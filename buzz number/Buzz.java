import java.util.*;
class Buzz 
{
	public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
		System.out.print("Enetr the number = ");
		int num=s.nextInt();
		if(num%7==0 || num%10==7)
		{
			System.out.println(num+" is a buzz number ");
		}
		else
		{   System.out.println(num+" is not a buzz number ");
		}

	}
}
