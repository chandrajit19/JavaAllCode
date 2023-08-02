class HollowButterfly 
{
	public static void main(String[] args) 
	{
		int i,j;
		for(i=1; i<=10; i++)
		{
			for(j=1; j<=10; j++)
			{
				if(j==1||j==10||j==i||i+j==11)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
	System.out.println();	
	}
	}
	}

