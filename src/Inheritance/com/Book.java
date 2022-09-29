package Inheritance.com;

public class Book {
	
	private int id;
	private int publicationId;
	
	Book(){}
	
	Book(int i,int pubid)
	{
		id=i;
		publicationId=pubid;
	}
	
	public void showBookDetails()
	{
		System.out.println("Id of the book is "+id);
		System.out.println("Publication Id of the book is "+publicationId);
	}
	

}
