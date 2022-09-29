package sample;

public class FDAccount {
	int acNo;
	float balance;
	String accHolder;
	
	FDAccount() {}
	
	
	static  {
		System.out.println("static bolock gets initialized");
	}
	
	static{
		System.out.println("another static bolock");
	}
	
	public FDAccount(int acNo,float balance,String accHolder)
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
public static void main(String[]args)
{
	System.out.println("main method");
}
}

