package sample;
import java.util.Scanner;
public class Convert {

	public static void main(String[] args) {
		System.out.println("Enter character ");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z') {
			System.out.println((char)(ch+32));
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println((char)(ch-32));
		}
		else
		{
			System.out.println("Enter a valid character");
		}
	
			
		
		
		
		

	}

}
