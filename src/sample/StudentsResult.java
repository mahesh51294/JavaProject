package sample;
import java.util.Scanner;

public class StudentsResult {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter physics marks");
		int p=sc.nextInt();
		System.out.println("Out Of");
		int o=sc.nextInt();
		System.out.println("Enter chemistry marks");
		int c=sc.nextInt();
		System.out.println("Out Of");
		int o2=sc.nextInt();
		System.out.println("Enter mathematics marks");
		int m=sc.nextInt();
		System.out.println("Out Of");
		int o3=sc.nextInt();
		float total=p+c+m;
		float percentage=((total)/300)*100;
		
		System.out.println("total of subjects is " +total);
		System.out.println("percentage of student is" +percentage);
		if(percentage>40)
		{
			System.out.println("Student is passed");
		
		}
		else
		{
			System.out.println("Student is Failed");
		}

	}

}
