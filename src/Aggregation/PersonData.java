package Aggregation;

public class PersonData {

	public static void main(String[] args) {
		
		Person p=new Person("virat kohli","male",28,"New Delhi");
		Address a=new Address("Delhi","Utter Pradesh","India",p);
		
		System.out.println(a);
		
		
		

	}

}
