package sample;

public class Admission {
	
	public static void main(String[]args)
	{
		Student s1=new Student();
		System.out.println(s1.hashCode());
		
		
		Student s2=s1;
		
		System.out.println(s1.hashCode());
	}

}
