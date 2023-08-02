import java.util.*;      // Ram is man
class  Sentence
{   static String rev(String n)
	{  String newStr="";
	   
		for(int i=0; i<=n.length()-1; i++)
		{  String word="";
           while(i<=n.length()-1 && n.charAt(i)!=' ')
			{
			   word=word+n.charAt(i);
			   i++;
			}
           newStr=word+" "+newStr;   
		}
		
		return newStr;
	}

	public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
		System.out.print("Enter the string = ");
		String n=s.nextLine();
		System.out.println(rev(n));
	}
}
