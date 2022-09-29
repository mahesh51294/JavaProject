package sample;
import java.util.Scanner;

public class NUmber {
	
	boolean isDigitPresent(int x, int d)
	
		{
		boolean flag=false;
		    
		    while (x > 0)
		    {
		        if (x % 10 == d)
		           
		        {
		        	flag=true;
		        	break;
		        }
		        x = x / 10;
		    }
		    if(flag==true)
		    	return true;
		    else
		    	return false;
		  
		}
		 
	     
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int number=sc.nextInt();
	System.out.println("Enter the digit to be find out");
	int digit=sc.nextInt();
	NUmber n=new NUmber();
	boolean b=n.isDigitPresent(1234,1);
	System.out.println(b);
	
	
}
}

