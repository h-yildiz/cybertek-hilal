package classes.assignment4;

import java.util.Locale;
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("What is your income?");
     	int income=scan.nextInt();
		double taxAmount;
		
		System.out.println("Your income: " + income);
		
		if (income <= 150000000) {
			taxAmount=0.25*income;
			System.out.println("The tax amount you have to pay : " + taxAmount);			
     	}if (income>150000000 && income<=300000000) {
     		taxAmount=0.25*150000000+(income-150000000)*0.30;
     		System.out.println("The tax amount you have to pay : " + taxAmount);
        }if (income>300000000 && income<=600000000) {
        	taxAmount=(0.30*300000000) +((income-300000000)*0.35);
			System.out.println("The tax amount you have to pay : " + taxAmount);
        }if (income>600000000 && income<=1200000000) {
        	taxAmount=(0.35*600000000) + ((income-600000000)*0.40);
			System.out.println("The tax amount you have to pay : " + taxAmount);
        }if (income>1200000000) {
        	taxAmount=(0.40*1200000000) + ((income-1200000000)*0.50);
        	System.out.println("The tax amount you have to pay : " + taxAmount);
         	
         	 
	}

}
}