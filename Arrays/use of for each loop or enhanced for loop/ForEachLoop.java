import java.util.*;
class  ForEachLoop
{
    
    	public static void main(String[] args) 
	  {   
		int[] a={3,4,6};
		for(int i=0; i<a.length; i++)
		  {	
			System.out.print(a[i]+" ");
		  }

		System.out.println("\n*************************");
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		
	  }
}
