import java.util.*;
class  StringPro
{   static String display(String n)
	{ 
		String newStr="";
		for(int i=0; i<=n.length()-1; i++)
		{
			String word="";
			int count=0;
			while(i<=n.length()-1 && n.charAt(i) !=' ')
			{
				word=n.charAt(i)+word;
				i++;
				count++;
			}

			newStr=newStr+word+count+" ";
		}
		return newStr;
	}
       public static void main(String[] args) 
       	{  
		    Scanner s=new Scanner(System.in);
		    System.out.println("Enetr the string = ");
		    String n=s.nextLine();
		    System.out.println(display(n));
	    } 
}
