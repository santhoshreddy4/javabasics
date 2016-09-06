package javabasics;

class SuperA
{
	int x=10;
	int y=20;
	
}
class SubB
{
	int z=30;
	SuperA obja=new SuperA();
	
}

public class HasAExample {
	public static void main(String args[])
	{
		
		SubB objb = new SubB();
		System.out.println(" the value of z is : " +objb.z);
		System.out.println("the value of x is : "+objb.obja.x);
		System.out.println("the value of y is :" +objb.obja.y);
		
	}

}
