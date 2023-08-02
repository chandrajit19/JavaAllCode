import java.util.*;
class  SDemo
{
	public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
		System.out.println("Enter the string = ");
		String n=s.nextLine();
		for(int i=0; i<n.length(); i++)
		{
			System.out.print(n.charAt(i)+"  ");
		}
	}
}
