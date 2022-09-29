package Aggregation;

public class Vitamin {
	String vitaminname;
	int proportion;
	String use;
	
	Vitamin()
	{
		
	}
	Vitamin(String vname,int prop,String uses)
	{
		vitaminname=vname;
		proportion=prop;
		use=uses;
		
	}
	public String toString()

	{
		return "vitamin name is" + vitaminname +"proprtion is" +proportion+ "used to"+ use;
	}

}
