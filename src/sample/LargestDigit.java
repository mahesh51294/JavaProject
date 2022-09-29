package sample;
import java.util.Scanner;

public class LargestDigit {
	

	 public static void main(String[] args) {
	  Scanner cs = new Scanner (System.in);
	       System.out.println ("Enter the number");//6745
	     int num = cs.nextInt ();
	     int reminder, Largest= 0;
	    while (num > 0)//6745>0,674>0,67>0
	    {
	        reminder = num % 10;//6745%10=5,674%10=4,67%10=7
	        if (Largest< reminder) //0<5true,5<4false,5<7true
	        {
	            Largest= reminder;  //5,7
	        }
	        num = num / 10; //6745/10=674,674/10=67,67/10=6
	    }
	    System.out.println("\nThe Largest Digit is "+Largest);

	       cs.close();
	 }
	}

