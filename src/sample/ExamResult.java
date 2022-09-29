package sample;

public class ExamResult {

	public static void main(String[] args) {
		Semester sem1=new Semester();
		sem1.acceptMarks(87,87,98);
		
		Semester sem2=new Semester();
		sem2.acceptMarks(98,77,88);
		
		ExamResult e=new ExamResult();
		e.calculateAnnualResult(sem1,sem2);
		
	}
		

	
	
	public void calculateAnnualResult(Semester sem1,Semester sem2)
	{
		float physicsTotal=sem1.phy+sem2.phy;
		System.out.println("total marks of physics is"+physicsTotal);
		
		float chemistryTotal=sem1.chem+sem2.chem;
		System.out.println("total marks of chemistry is"+chemistryTotal);
		
		float mathematicsTotal=sem1.maths+sem2.maths;
		System.out.println("total marks of mathematics is"+mathematicsTotal);
		
		
	}

}
