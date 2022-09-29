package sample;

public class SavingAccount {
	String accHolder;
	float balance;
	static long cnt=1000;
	long acNo;
	public static double interestRate=4.2;
	
	
	
	public SavingAccount()
	{
		acNo=cnt++;
	}

	public  SavingAccount(int acNo,float balance,String accHolder)
	{
		this.acNo=acNo;
		this.balance=balance;
		this.accHolder=accHolder;
		
	}
	
	public static void changeInterestRate(double r)
	{
		interestRate =r;
	}
	public void showAccDetails()
	{
		System.out.println("account number is"+ acNo);
		System.out.println("account balance is"+ balance);
		System.out.println("account name is"+ accHolder);
		
	}

}
