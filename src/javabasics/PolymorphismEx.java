package javabasics;

class SuperPolyEx
{
	void method1()
	{
		System.out.println("this is the method1 with no arguements (overloading)");
	}
	void method1(int x)
	{
		System.out.println("this method1 has int x arguement :" +x);
	}
}
public class PolymorphismEx {

	public static void main(String args[])
	{
		SuperPolyEx s=new SuperPolyEx();
		s.method1();
		s.method1(10);
		
	}
}
