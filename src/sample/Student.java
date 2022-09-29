package sample;

public class Student {
	int rollNumber,physics,chemistry,maths;
    String name;
   


    public void displayRecord()
    {
          System.out.println("rollNumber" +rollNumber + "with Name" + name + "followed marks");
          System.out.println("physics" + physics);
          System.out.println("chemistry" + chemistry); 
          System.out.println("maths" + maths);  
        

    }
public void acceptDetails(int roll,int p,int c, int m,String n)
{
    rollNumber=roll;
     physics=p;
    chemistry=c;
     maths=m;
     name=n;
System.out.println("Student details");


}
public void calculatePercentage()
{
float total=physics+chemistry+maths;
double percentage=(total/300)*100;
System.out.println("percentage of candidate is " + percentage);
}













}

