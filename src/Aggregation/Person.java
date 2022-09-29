package Aggregation;

public class Person {
	
	private String name;
	 private String gender; 
	 private int age; 
	 private String address;
	 
	 Person(){}
		Person(String n,String g,int ag,String ad )
		{
			name=n;
			gender=g;
			age=ag;
			address=ad;
		}
		public String toString()
		{
			return "name of person is "+ name+ "\n"+ "Gender of the person is " + gender +"\n" + "Age of that person is " + age +"\n" +"Address of person is " + address ;
		}

}
