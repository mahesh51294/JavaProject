package Inheritance.com;

public class PracticalExam extends Exam {
	
	private String topic;
	private int outofmarks;
	
	 public PracticalExam(){
		 super("abc","xyz");
		 topic="java";
		 outofmarks=98;
	 }
	
	public PracticalExam(String t,int o)
	{
		topic=t;
		outofmarks=o;
	}
	protected void ConductPracticals()
	{
		this.topic=topic;
		this.outofmarks=outofmarks;
	}
	
	protected void ShowPracticalDetails()
	{
		showCaseExamDetails();
		System.out.println("topic is "+ topic);
		System.out.println("outofmarks is "+ outofmarks);
	}

}
