package Inheritance.com;

public class Account {
	
	private int id;
	 private String name;
	 
	 protected void AcceptDetails(int id,String name)
	 {
		 this.id=id;
		 this.name=name;
	 }
	 
	  void Display()
	 {
		 System.out.println("Account id is "+id);
		 System.out.println("Account name is "+name);
		 
	 }
	

}
