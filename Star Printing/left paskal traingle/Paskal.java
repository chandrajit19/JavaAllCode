class Paskal
{  
	public static void main(String[] args)
	{
		int i,j,k;
		for(i=1; i<=9; i++)
		{
			if(i>=1 && i<=5)
			{
				for(j=1; j<=5-i; j++)
				{
					System.out.print("  ");
				}
				for(k=1; k<=i; k++)
				{ 
					System.out.print("* ");
				}
				System.out.println();
			}
			else
			{
				for(j=1; j<=i-5; j++)
				{
					System.out.print("  ");
				}
				for(k=1; k<=10-i; k++)
				{ 
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}

}