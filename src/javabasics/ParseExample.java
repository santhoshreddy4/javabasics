package javabasics;

public class ParseExample {

	public static void main(String args[])
	{
		try
		{
			int x= Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int z= x+y;
			System.out.println(" the sum of x and y is : "+z);
			
			
		}catch(NumberFormatException ne){
			System.out.println("you have to enter int values only");
			
		}
	}
}
