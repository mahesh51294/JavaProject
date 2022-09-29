package sample;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 number");
		int x=sc.nextInt();
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		if(x%2==0)
			System.out.println("Given number is even");
		else
			System.out.println("Given number is odd");
		

	
		if(x>0)
		{
			System.out.println("Given number is positive");
		}
		else 
		{
	
		
				System.out.println("Given number is negative");
		}		
	
	
		if (number1%number2==0)
		{
			System.out.println("Number is factors of another number");
		}
		else
		{
			System.out.println("number is not factor of another number");
		}
	}
}
		
	


