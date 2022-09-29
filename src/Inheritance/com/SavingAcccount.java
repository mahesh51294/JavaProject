package Inheritance.com;

public class SavingAcccount extends Account {
	
	
	private float balance;
	public float interest;
	
	public void AcceptDetails(float b,float i)
	{
		balance=b;
		interest=i;
		
	}
	
	public void ShowDetails()
	{
		System.out.println("Balance is "+ balance);
		System.out.println("Interest is "+ interest);
		
	}
	
	
	

}
