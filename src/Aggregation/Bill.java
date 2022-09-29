package Aggregation;

public class Bill {
	
	private int billNumber;
	private float billAmount;
	MyDate m;
	
	public int getBillNumber()
	{
		return billNumber; 
	}
	public void setBillNumber(int billNumber)
	{
		this.billNumber=billNumber;
	}
	public float getBillAmount()
	{
		return billAmount; 
	}
	public void setBillAmouint(int billAmount)
	{
		this.billAmount=billAmount;
	}
	public MyDate getM()
	{
		return m;
	}
	public void setM(MyDate m)
	{
		this.m=m;
	}
	
	public String toString()
	{
		return "The bill number is" + billNumber+ "\n"+ "The bill amount is"+ billAmount + "\n" + "The MY date is " + m;
	}
	
	

}
