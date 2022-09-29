package sample;
import java.util.Scanner;

public class TwinPrime { 
	    static boolean checkPrimeNumber(int number)  
	    {  
	        int i;  
	        int m = 0;  
	        int flag = 0;        
	        m = number/2;        
	        if(number == 0 || number == 1){    
	            return false;        
	        }
	        else{    
	            for(i = 2; i <= m ;i++){        
	                if(number%i == 0){        
	                    flag=1;        
	                    return false;       
	                }        
	            }        
	            if(flag == 0)    
	            {   
	                return true;  
	            }    
	        }  
	        return false;  
	    }  
	   
	     
	    static boolean checkTwinPrimeNumber(int number1, int number2)  
	    {  
	        if(checkPrimeNumber(number1) && checkPrimeNumber(number2) && Math.abs(number1 - number2) == 2)  
	            return true;  
	        else  
	            return false;  
	    }  
	   
	 
	    public static void main(String[] args)  
	    {  
	         int number1, number2;  
	           
	        Scanner sc = new Scanner(System.in);  
	            
	        System.out.println("Enter first number");  
	           
	        number1 = sc.nextInt();  
	            
	        System.out.println("Enter second number");  
	            
	        number2 = sc.nextInt();  
	          
	        if (checkTwinPrimeNumber(number1, number2))   
	            System.out.println("("+number1 +", "+number2+ ") is a pair of twin primes");   
	        else  
	            System.out.println("("+number1 +", "+number2+ ") is not a pair of twin primes");   
	          
	    }  
	}  


