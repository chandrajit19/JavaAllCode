import java.util.*;
class  Swap
{
	public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
		System.out.print("Enter a number in a= ");
		int a=s.nextInt();
        System.out.print ("Enter a number in b= ");
        int b=s.nextInt();
        int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a);
		System.out.println("b="+b);


	}
}
