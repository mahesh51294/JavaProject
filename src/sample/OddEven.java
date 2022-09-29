package sample;
import java.util.Scanner;
public class OddEven {
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int number=sc.nextInt();

		switch(number%2){
		case 0:
		    System.out.println(number+" is an Even number");
		    break;
		case 1:
		    System.out.println(number+" is an Odd number");
		}
		}
}


