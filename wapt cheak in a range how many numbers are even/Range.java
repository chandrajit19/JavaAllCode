import java.util.*;   
class Range 
{    static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the first number = ");
		int a=s.nextInt();
		System.out.println("Eneter the second number = ");
		int b=s.nextInt();
        int i;
		for(i=a; i<=b; i++)
		{
			if(i%2==0)
			{
		
				System.out.print(i+" ,");
			}
		}
	}
}
