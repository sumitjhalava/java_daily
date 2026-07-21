class Program12
{ 
	public static void main(String [] args)
	{
		double percentage = 10;
		if(percentage>85)
			{	
				System.out.println("Distiriction");
			}	
		else if(percentage<85 && percentage>=60)
			{	
				System.out.println("first grade");
			}
		else if(percentage>=50 && percentage<60)
			{ 
				System.out.println("second grade");
			}
		else if(percentage>=33 && percentage>50)
			{
				System.out.println("pass with third grade");
			}
		else
			{
				System.out.println("fail");
			}
	}
		
}