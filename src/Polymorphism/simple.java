package Polymorphism;
import java.util.Scanner;

public class simple {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,temp;
	   System.out.printf("Enter the range of number:");
	    n=sc.nextInt();
	    for(temp=0;temp<=n;temp++)
	    {
	    	System.out.print(temp+" ");
	        temp=(temp*2)+1;
	    	
	    }
	 
	}
}

	

