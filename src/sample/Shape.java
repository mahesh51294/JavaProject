package sample;

public class Shape {
	
	public void area(double r)
	{
		double x=3.142*r*r;
		System.out.println("Area of circle"+x);
	}
	public void area(float l,float w)
	{
		float y=l*w;
		System.out.println("Area of rectangle"+y);
	}
	public void area(int b,int h)
	{
		float z=(b*h)/2;
		System.out.println("Area of triangle"+z);
	}
	public static void main(String[]args)
	{
		Shape s=new Shape();
		s.area(3);
		s.area(3.5f,4.5f);
		s.area(4,2);
	}

}
