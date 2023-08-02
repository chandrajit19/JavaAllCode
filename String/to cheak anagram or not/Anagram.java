import java.util.*;
class  Anagram
{
	static char[] display(String n)
	{   char ch[]=n.toCharArray();
	    char temp;
		int i,j;
		for(i=0; i<=ch.length-1; i++)
		{
			for(j=i+1; j<=ch.length-1; j++)
			{
				if(ch[i]>ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		return ch;
	}
        public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
		System.out.println("Enetr the string first = ");
		String n1=s.next();
		System.out.println("Enetr the string second = ");
		String n2=s.next();
		if(n1.length()==n2.length())
		{
            char[] s1=display(n1);
		    char[] s2=display(n2);
		    System.out.println(s1);
		    System.out.println(s2);
		    if (Arrays.equals(s1,s2))
		      {
			     System.out.println("this is an anagrams number");
		      }
			else
		      {
			     System.out.println("this is not an anagram number");
		       }
		}
		
		else
		{
			System.out.println("this is not an anagram number");
		}
	}
}
