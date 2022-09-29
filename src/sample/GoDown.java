package sample;

public class GoDown {
	public static void main(String[]args)
	{
		Item i=new Item();
		i.getId(1);
		i.getName("Soap");
		i.getCost(30);
		i.getQuantity(12);
		System.out.println("ID of item is " + i.setId());
		System.out.println("name of item is " + i.setName());
		System.out.println("cost of item is " + i.setCost());
		System.out.println("quantity of item is " + i.setQuantity());
		
	}

}
