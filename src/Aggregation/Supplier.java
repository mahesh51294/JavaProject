package Aggregation;

public class Supplier {
	
	int supid;
	String supName;
	int supMobile;
	
	public int getSupId()
	{
		return supid;
	}
	public void setSupId(int supid)
	{
		this.supid=supid;
	}
	public String getSupName()
	{
		return supName;
	}
	public void setSupName(String supName)
	{
		this.supName=supName;
	}
	public int getSupMobile()
	{
		return supMobile;
	}
	public void setSupMobile(int supMobile)
	{
		this.supMobile=supMobile;
	}
	
	public String toString()
	{
		return "The suppliers id is" + supid +"\n"+ "The suppliers name is " +supName +"\n"+ "The suppliers mobile number is " +supMobile;
	

}
}
