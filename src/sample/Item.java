package sample;

public class Item {
	int id;
	String name;
	int cost;
	int quantity;
	public int setId()
	{
		return id;
	}
	public String setName()
	{
		return name;
	}
	public int setCost()
	{
		return cost;
	}
	public int setQuantity()
	{
		return quantity;
	}
	public void getId(int id)
	{
		this.id=id;
	}
	public void getName(String name)
	{
		this.name=name;
	}
	public void getCost(int cost)
	{
		this.cost=cost;
	}
	public void getQuantity(int quantity)
	{
		this.quantity=quantity;
	}

}
