package Aggregation;

public class MyDate {
	
	private int month,year,date;
	
	public int getMonth()
	{
		return month;
	}
	public void setMonth(int month)
	{
		this.month=month;
	}
	public int getYear()
	{
		return year;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getDate()
	{
		return date;
	}
	public void setDate(int date)
	{
		this.date=date;
	}
	
	public String toString()
	{
		return "the month is" + month +"\n" + "the year is" + year +"\n"+ "the date is " + date; 
	}

}
