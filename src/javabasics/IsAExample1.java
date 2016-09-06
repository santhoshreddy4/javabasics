package javabasics;

class BookInfo
{
	String bname="java";
	String aname ="groslin";
	
			
}
class BookDetails extends BookInfo
{
	int bprice = 300;
	void printData()
	{
		System.out.println("the book is : " +bname+" of author  "+aname+ "  and price is " +bprice);
	}
	
	
}
public class IsAExample1 
{
	
	public static void main(String args[])
	{
		
		BookDetails bd=new BookDetails();
		bd.printData();
		
	}

}
