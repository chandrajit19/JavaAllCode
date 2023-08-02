import java.util.*;
class SDemo 
{
	public static void main(String[] args) 
	{    Scanner s=new Scanner(System.in);
		System.out.println("Eneter the String = ");
		String n=s.nextLine();
		for (int i=n.length()-1; i>=0 ; i--)
		{ char ch =n.charAt(i);
           System.out.print(ch+" ");
		} 
	}
}
			