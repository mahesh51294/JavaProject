package Aggregation;

public class College {

	public static void main(String[] args) {
		Department d=new Department();
		Student s=new Student();
		
		d.setId(5);
		d.setName("Virat Kohli");
		
		s.setRoll(42);
		s.setName("Hardik Pandya");
		s.setd(d);
		
	System.out.println(s);
		
		
		

	}

}
