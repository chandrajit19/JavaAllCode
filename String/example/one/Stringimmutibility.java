class Stringimmutibility 
{
	public static void main(String[] args) 
	{
		String s1="hello";
		System.out.println(s1.hashCode());
		s1.concat("world");
		System.out.println(s1.hashCode());
		System.out.println("-----------------------------");
		
		String s2="hello";
		System.out.println(s2.hashCode());
		s2=s2.concat("world");
		System.out.println(s2.hashCode());
		System.out.println("-------------------------------");
		StringBuilder s3=new StringBuilder("hello2");
		System.out.println(s3.hashCode());
		s3.append("world4");
		System.out.println(s3.hashCode());

	}
}
