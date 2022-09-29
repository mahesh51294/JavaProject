package Aggregation;

public class FrVi {

	public static void main(String[] args) {
		Vitamin v=new Vitamin("vitamin b12",45,"energy");
		Fruit f=new Fruit("mango",12,"yellow",v);
		System.out.println(f);

	}

}
