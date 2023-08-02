import java.util.*;
class Mixed 
{   
	static void dis(String n)
	{    String vowel="";
	     String cons="";
	 	for(int i=0; i<=n.length()-1; i++)
		{  if((n.charAt(i)>='a'&& n.charAt(i)<='z') || (n.charAt(i)>='A'&& n.charAt(i)<='Z'))
			{
	  	   if(n.charAt(i)=='a'||n.charAt(i)=='A' ||n.charAt(i)=='e' ||n.charAt(i)=='E' || n.charAt(i)=='i'||n.charAt(i)=='I' ||n.charAt(i)=='O' ||n.charAt(i)=='o' ||n.charAt(i)=='u' ||n.charAt(i)=='U')
			{
			    vowel=vowel+n.charAt(i);
		    }
			else
		        {
		        	cons=cons+n.charAt(i);
		        }
		    }
		
	    }
    System.out.println("vowel is = "+vowel);
	System.out.println("consonent is = "+cons);
	}
  				
	public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
		System.out.println("please enter the number= ");
		String n=s.nextLine();
        dis(n);
	}
}
