package sample;

public class RecurringAccount {
	int acNo;
    float balance;
	String accHolder;
	
public 	RecurringAccount() {}

	public RecurringAccount(int acNo,float balance,String accHolder)
	{
		this.acNo=acNo;
		this.balance=balance;
		this.accHolder=accHolder;
		

}
	
	public void showAccDetails()
	{
		System.out.println("account number is"+ acNo);
		System.out.println("account number is"+ balance);
		System.out.println("account number is"+ accHolder);
		
	}
}



