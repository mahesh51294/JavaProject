package sample;
import java.util.Scanner;



public class ShoppingClothes {
	


	   public static void main(String[] args)
	   {
	      int quantity,price,totalCost, costToPaid=0, discount;
	      Scanner sc = new Scanner(System.in);
	       
	      
	      System.out.println("Enter Quantity of clothes: ");
	      System.out.println("Enter Price of clothes: ");
	      
	      quantity = sc.nextInt();
	      price=sc.nextInt();
	      
	      totalCost=quantity*price;
	      
	      if(totalCost<=10000)
	      {
	    	  discount = (totalCost*10)/100;
		        totalCost = totalCost - discount;
	      }
	      else if(totalCost<=5000)
	      {
	         discount = (totalCost*5)/100;
	         totalCost -=discount;
	      }

	      else
	      {
	         System.out.println("No discount at all");
	        
	      }
	      System.out.println("\nThe cost to be Paid is: " + totalCost);
	   }
	}

