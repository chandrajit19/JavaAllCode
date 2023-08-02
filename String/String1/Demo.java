class  Demo
{
	public static void main(String[] args) 
	{
		String s1="Hello world";
		String s2="hello world";
		String s3=new String("hello world");
		String s4=new String("hello world");
		System.out.println(s1==s2);  // "==" it compare the reference value 
	    System.out.println(s3==s4);

		System.out.println(s2.equals(s3));   // equals copmare to ascii value of char
		System.out.println(s3.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));

	}
}
