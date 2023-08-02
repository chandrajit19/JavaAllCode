import java.util.*;
class  Shorting
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
		System.out.println("Enetr the string = ");
		String n1=s.next();
		char[] s1=display(n1);
		System.out.println(Arrays.toString(s1));
	}
	
		
}
