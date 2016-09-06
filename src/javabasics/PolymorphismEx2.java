package javabasics;

class SuperPoly
{
	void method1()
	{
		System.out.println(" this method1 is from SuperPoly ");
	}
}
class SubPoly extends SuperPoly
{
	void method1()
	{
		System.out.println(" this method1 is from SubPoly class");
	}
}

public class PolymorphismEx2 {
	
	public static void main(String args[])
	{
		SubPoly sup=new SubPoly();
		sup.method1();
		sup= new SubPoly();
		sup.method1();
		/*
		 * FIRST WE CREATED THE SUP OBJECT IN REFFERENCE TO THE SUPERPOLY
		 * SO WHEN WE CALL METHOD1 USING SUP OBJECT, THEN IT GOES TO SUPERPOLY CLASS
		 * AND THEN USING THE SAME SUP OBJECT, BUT WE CHANGED THE REFFERNCE TO THE SUBPOLY
		 * SO THE COMPILER WILL TRANSFER THE SUP ROUTE TO SUBPOLY
		 * NOW WHEN WE CALL METHOD1 , THE COMPILER REDIRECTS TO SUBPOLY METHOD1
		 */
	}

}
