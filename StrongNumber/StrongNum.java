import java.util.*;
class StrongNum 
{
	public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
		System.out.println("Please enter the number = ");
		int num=s.nextInt();
		int org=num;
		int sum=0;
		while(org>=1)
		{
		int	ld=org%10;
			org=org/10;
			 int fact=1;
			 for(int i=ld; i>=1; i--)
			   {    
				 fact=fact*i;
			    }
              
              sum=sum+fact;
		}	
		System.out.println(sum);
		if(num==sum)
		{
			System.out.println(num+" is a strong number");
		}
		else
		{   
			System.out.println(num+" is not a strong number");
		}

	}
}
