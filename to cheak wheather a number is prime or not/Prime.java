import java.util.*;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Please enter a number = ");
		int n=s.nextInt();
		int count=0;
		int i;
  		for(i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				count++; 
				//count+=1;
				//count=count+1;
			}
		}
		if(count==2)
		{
			System.out.println(n+" is a prime no");
		}
		else
		{
			System.out.println(n+ " is a cmposite number");
		}
		
	}
}
