package Aggregation;

public class Department {
	
	private int id;
	private String name;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return "Department name is" + name +"\n"+ "Department id is" + id; 
	}

}
