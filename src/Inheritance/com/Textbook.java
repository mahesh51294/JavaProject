package Inheritance.com;

public class Textbook extends Book 
{
	private String subject;
	private int noOfPages;
	
	Textbook(){
		
		
	}
	
	Textbook(String s,int p)
	{
		super(123,456);
		subject=s;
		noOfPages=p;
	}
	
	public void showTextbookDetails()
	{
		showBookDetails();
		System.out.println("subject is "+ subject);
		System.out.println("number of pages is  "+ noOfPages);
	}
	
	
	
	
	
	
	

}
