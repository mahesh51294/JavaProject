package Inheritance.com;

public class English extends Textbook {

	private String author;
	private int cost;
	
	English(){
		
	}
	
	English(String a,int c)
	{
		super("Biology",750);
		author="XYZ";
		cost=2000;
	}
	
	
	
	private void showEnglishDetails()
	{
		System.out.println("Author of this book is "+ author);
		System.out.println("cost of this book is  "+ cost);
	}
		

	}


