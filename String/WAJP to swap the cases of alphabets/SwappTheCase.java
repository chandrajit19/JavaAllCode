import java.util.*;
class  SwappTheCase
{
   static String swapp(String n)
	{   String newStr="";
	   for(int i=0; i<=n.length()-1; i++)
		{
		   if(n.charAt(i)>=65 && n.charAt(i)<=90)
			{
			   newStr=newStr+ (char)(n.charAt(i)+32);
			}
			else if(n.charAt(i)>=97 && n.charAt(i)<=122)
			{
				 newStr=newStr+ (char)(n.charAt(i)-32);
			}
			else
			{
				newStr=newStr+(n.charAt(i));
			}
			
		
		}
		return newStr;
	}

	public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
		System.out.println("enetr the string = ");
		String n=s.nextLine();
		System.out.println(swapp(n));

	}
}
