import java.util.*;
class  Palandrom 
{
	public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
		System.out.println("please enetr the string");
		String n=s.nextLine();
		String rev="";
		for(int i=n.length()-1; i>=0; i--)
		{
			 rev=rev+n.charAt(i);
		}
		if(n.equalsIgnoreCase(rev))
		{
			System.out.println("this is palandrom");
		}
		else
		{  System.out.println("this is not palandrom");
		}

	}
}
