package javabasics;
class SuperClass1
{
	void method1()
	{
		System.out.println(" this is from method1 of super class");
	}
	
	 void method2()
	{
		System.out.println(" this is a static method from superclass");
	}
}

class SubClass2 extends SuperClass1
{
	void method1()
	{
		System.out.println(" this is method 3 from subclass");
		
	}
	static void method4()
	{
		System.out.println("this is a static method4 from subclass");
	}
}

public class IsAExample2 
{

	public static void main(String args[])
	{
		SubClass2 sub = new SubClass2();
		sub.method1();
		sub.method1();
		SubClass2.method4();
		
	}
}
