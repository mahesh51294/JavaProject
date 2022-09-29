package sample;
import java.util.Scanner;

public class Divisible {
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value");
	int x=sc.nextInt();
	String  result=(x%5==0) ? "Number is divisible by 5" : "Number is not Divisible by 5";
	System.out.println(result);

}
}
