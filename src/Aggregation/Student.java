package Aggregation;

public class Student {
	
	private int roll;
	private String name;
	private Department d;
	
	public int getRoll()
	{
		return roll;
	}
	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public Department getd()
	{
		return d;
	}
	public void setd(Department d)
	{
		this.d=d;
	}
	
	public String toString()
	{
		return "Roll number is "+roll+"\n"+"name of student is "+name+"\n"+d;
	}
	

}
