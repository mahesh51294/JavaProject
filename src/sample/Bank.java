package sample;

public class Bank {
	String AccName;
	int salary;
	public Bank()
	{
		AccName="mahesh mane";
		salary=35000;
		
	}
	public Bank(String AccName,int salary)
	{
		this.AccName=AccName;
		this.salary=salary;
	}
	void showDetails()
	{
		System.out.println("Account name is "+AccName);
		System.out.println("Account salary is "+salary);
		
	}
}
