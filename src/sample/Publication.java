package sample;

public class Publication {
	public static void main(String[]args)
	{
		Book b=new Book();
		{
			b.setId(1);
			b.setName("wings of fire");
			b.setPrice(500);
			b.setAuthor("Dr.Apj Abdul Kalam");
			
			System.out.println("id of Book is " +b.getId());
			System.out.println("name of Book is  " +b.getName());
			System.out.println("price of book is  " +b.getPrice());
			System.out.println("Author of Book is  " +b.getAuthor());
			
			
		}
				
	}

}
