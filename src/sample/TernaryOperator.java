package sample;
import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[]args)
	{
		int max,num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		num1=sc.nextInt();
		System.out.println("Enter 2nd number");
		num2=sc.nextInt();
		System.out.println("Enter 3rd number");
		num3=sc.nextInt();
		
		if(num1>num2 && num1>num3)
			System.out.println("Number 1 is greater"+ num1);
		else if(num2>num1 && num2>num3)
			System.out.println("Number 2 is greater"+ num2);
		else
		System.out.println("Number 3 is greater"+ num3);
		
		//Using Ternary OPerator
		
		String result=num1>num2 && num1>num3 ?"Number 1 is greater" :num2>num1 && num2>num3 ? "Number 2 is greater": num3 ? "Number 3 is greater":
		System.out.println(result);
		
	}

}
