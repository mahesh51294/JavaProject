package Aggregation;

public class Fruit {
	
	String name;
	int quantity;
	String color;
	Vitamin v1;
	
	Fruit(){}
	Fruit(String n,int q,String c,Vitamin v )
	{
		name=n;
		quantity=q;
		color=c;
		v1=v;
	
		
		
	}
	public String toString()
	{
		return name + "quantity of fruit"+ quantity + "color"+ color + "Vitamin in the fruit is + " +v1;

	}

}
