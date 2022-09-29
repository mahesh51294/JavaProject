package sample;
import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=2;
		int num=0;
		System.out.println("Enter the starting number");
		int start=sc.nextInt();
		System.out.println("Enter the ending number");
		int end=sc.nextInt();
		while(num<=end)
		{
			start++;
		}
		while(num%i==0)
		{
			if(num%i==0)
			{
				break;
			}
			i++
		}
		if(start==i)
			System.out.println("prime number is" +num);
	}
	
		

	}
-
