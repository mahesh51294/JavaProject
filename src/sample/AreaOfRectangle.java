package sample;

import java.util.Scanner;

public class AreaOfRectangle {
	public void areaOfRectangle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		int l=sc.nextInt();
		System.out.println("Enter width of rectangle");
		int w=sc.nextInt();
		float area;
		area=w*l;
		System.out.println("Area of Rectangle is " + area);
	}
	public static void main(String[]args)
	{
		System.out.println("main has started");
		AreaOfRectangle a=new AreaOfRectangle();
		a.areaOfRectangle();
		System.out.println("main has ended");
	}

}
