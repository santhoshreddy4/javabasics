package javabasics;

interface IntA1
{
	public abstract void method1();
	
}
interface IntB1 extends IntA1
{
	public abstract void method2();

}

class SubB3 implements IntB1
{
	public void method1()
	{
		System.out.println("I'm method1 of interface IntA");
	}
	 public void method2()
	 {
		 System.out.println("I'm method2 of interface IntB");
	 }
}
public class MutlLevInterface
{
 public static void main(String args[])
 {
	 IntB1 intb = new SubB3();
	 intb.method1();
 }

}
