package Inheritance.com;

public class Exam {
	
	private String type;
	private String subject;
	
	Exam(){}
	
	Exam(String t,String s)
	{
		type=t;
		subject=s;
	}
	protected void showCaseExamDetails()
	{
		System.out.println("Exam type is "+type +"\n"+ "Subject is "+subject);
	}
	

}
