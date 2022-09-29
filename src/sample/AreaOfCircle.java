package sample;
import java.util.Scanner;
public class AreaOfCircle {
	public void areaOfCircle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int r=sc.nextInt();
		float area;
		float pi=3.142f;
		area=pi*r*r;
		System.out.println("Area of circle is " + area);
	}
	public static void main(String[]args)
	{
		System.out.println("main has started");
		AreaOfCircle a=new AreaOfCircle();
		a.areaOfCircle();
		System.out.println("main has ended");
	}
	

}
