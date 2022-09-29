package sample;
import java.util.Scanner;

public class percentage {
	public void result()
	{
		int p;
		int c;
		int m;
	int	total=p+c+m;
		int perc=(total*100)/300;
	}
	public static void main(String[]args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter physics marks");
		int p=sc.nextInt();
		System.out.println("Enter chemstry marks");
		int c=sc.nextInt();
		System.out.println("Enter maths marks");
		int m=sc.nextInt();
		percentage pr=new percentage();
		pr.result();
		
		
	}
	

}
