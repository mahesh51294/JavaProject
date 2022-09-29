package sample;

public class Laptop {
	String name;
	String operatingsystem;
	String brand;
	int price;
	public Laptop()
	{
		
	}
	public Laptop(String name,String operatingsystem,String brand,int price)
	{
		this(name,operatingsystem,brand);
		
		this.price=price;
	}
	public Laptop(String name,String operatingsystem,String brand)
	{
		this();
		this.name=name;
		this.operatingsystem=operatingsystem;
		this.brand=brand;
		
	}
	public void showDetails()
	{
		System.out.println("name of laptop is " +this.name);
		System.out.println("os of laptop is " +this.operatingsystem);
		System.out.println("brand of laptop is " +this.brand);
		System.out.println("Price of laptop is " +this.price);
		
	}
	
	

}
