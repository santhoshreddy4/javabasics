package javabasics;

 interface IntA{
	 
	 void method1();
 }
 
 interface IntB
 {
	 void method2();
	 
 }
 
  class SubB2 implements IntA , IntB
  {
	  public void method1()
	  {
		  System.out.println(" I'm method1 of interface IntA");
	  }
	  public void method2()
	  {
		  System.out.println("I'm method2 of interface IntB");
	  }
  }
public class InterfaceEx {
	
	
	public static void main(String args[])
	{
	IntA inta=new SubB2();
	inta.method1();
	IntB intb = new SubB2();
	intb.method2();
	
	
	}

}
