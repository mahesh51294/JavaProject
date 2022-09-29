package Aggregation;

public class Address {
	
	private String city;
	private String state;
	private String country;
	private Person p1;
	
	Address(){}
	Address(String ci,String st,String co,Person p)
	{
		city=ci;
		state=st;
		country=co;
		p1=p;
	}
	
	public String toString()
	{
		return "city is " + city +"\n" + "State is " + state + "\n" + "country is " + country + "\n" + p1;
	}
	
	
}


