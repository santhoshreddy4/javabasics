package javabasics;
class SuperClass
{
	void print()
	{
		System.out.println("this is from super class of print() method");
	}
	
}
class SubClass
{
	SuperClass sup=new SuperClass();
	
}

public class HasAExample2 {

	
	public static void main(String args[])
	{
		SubClass sub=new SubClass();
		sub.sup.print();
	}
}
