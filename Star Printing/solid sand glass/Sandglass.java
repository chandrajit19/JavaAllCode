b   class Sandglass 
{
	public static void main(String[] args) 
	{
		int i,j;
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=5; j++)
			{
				if(i==1||i==5||j==i||i+j==6 )
				{
					System.out.print("* ");
				}
			else if(i==2&&j==3 || i==4&&j==3)
				{
					System.out.print("* ");
				} 
				else
				{
					System.out.print("  ");
				}
				
			}
	System.out.println();	
	}
	}
	}


