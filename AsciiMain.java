class AsciiMain
{
	public static void main(String[] args)
	{
		//scanner class object creation
		Scanner sc=new Scanner(System.in);
		
		//input from user
		System.out.print("Enter a Character: ");
		char c=sc.next().charAt(0);	
		
		//typecasting from character type to integer type
		int i = c;
		
		//printing ASCII value of the character
		System.out.println("ASCII value of "+c+" is "+i);
		
	
	}
}
