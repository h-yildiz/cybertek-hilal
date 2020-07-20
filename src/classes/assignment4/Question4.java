package classes.assignment4;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the call: ");
		
		int numOfCall=scan.nextInt();
		double bill=200;
		
		  
	    if(numOfCall<=100) {
	    	 System.out.println("Your bill is: $" + bill);
	      
	    	}else if(numOfCall>100 && numOfCall<=150) {
	           bill=bill+(numOfCall-100)*0.60;
	           System.out.println("Your bill is: $" + bill);
	           
	        }else if(numOfCall>150 && numOfCall<=200) {
	    	bill=bill + (50*0.60) + (numOfCall-150)*0.50;
	    	System.out.println("Your bill is: $" + bill);
	    	
	        }else if(numOfCall>200) {
	    	bill=bill + (50*0.50) + (50*0.60) + (numOfCall-200)*0.40;
	    	System.out.println("Your bill is: $" + bill);
	    	} 
	}


		
				
		
	}

