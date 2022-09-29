package sample;
import java.util.Scanner;

public class HotelMenu 
	{
	  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);

	    System.out.println("Welcome to Taj Hotel ");
	    System.out.println("Enter 1 : To order Pav Bhaji");
	    System.out.println("Enter 2 : To order Pizza");
	    System.out.println("Enter 3 : To order Vada Paav");

	    System.out.println("Enter your choice of order::");
	    int choice = sc.nextInt();
	    System.out.println("Enter Quantity your choice of order::");
	    int quantity=sc.nextInt();
	    
	    int pay=choice*quantity;

	   switch(choice)
	   {
	     case 1:
	     System.out.println("You will get pav bhaji your, total cost is"+ pay);
	     
	     break;
	    
	     case 2:
	     System.out.println("You will get Pizza, your total cost is"+ pay);

	     break;
	    
	     case 3:
	     System.out.println("You will get Vada Paav, your total cost is"+ pay);

	     break;
	    
	     default:
	     System.out.println("Sorry,Your dish is not in our menu list");
	     break;
	    
	     
	   }
	  }
	 }


