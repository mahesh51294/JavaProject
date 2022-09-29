package sample;

public class BankAccount {
	
	public void accessAccount(FDAccount fd)
	{
		System.out.println("fixed deposite account details are");
		fd.showAccDetails();
	}
	public void accessAccount(SavingAccount sa)
	{
		System.out.println("saving account details are");
		sa.showAccDetails();	
	}
	public void acessAccount(RecurringAccount ra)
	{
		System.out.println("recurring account details are");
		ra.showAccDetails();	
		
	}
	
	public static void main(String[]args)
	{
		BankAccount b=new BankAccount();
		FDAccount fd=new FDAccount(123,5000f,"abc");
		SavingAccount sa=new SavingAccount(455,511f,"sadd");
		RecurringAccount ra=new RecurringAccount(456,858f,"asd");
		b.accessAccount(fd);
		b.accessAccount(sa);
		b.acessAccount(ra);
				
	}

}
