package classes.Lab2;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the charge for the meal:");
		int charge=scan.nextInt();
	//	taxAmount(charge);
		double total= (int) (taxAmount(charge) + tipAmount(charge) + charge);
		
		System.out.println("----------------------------------------");
		System.out.println("Charge of the meal: " + charge);
		System.out.println("Tax amount is: " + taxAmount(charge));
		System.out.println("Tip amount is: " + tipAmount(charge));
		System.out.println("Your total bill is: " + total);
		System.out.println("----------------------------------------");
		
	}
	public static double taxAmount(int charge) {
		double tax = (int) (charge / 6.75);
			return tax;

}
	public static double tipAmount(int charge) {
		double tip= (int) (charge + (charge/6.75)) * 0.2;
			return tip;
	}
}

/*
 * Write a program that computes the tax and tip on a restaurant bill. The
 * program should ask the user to enter the charge for the meal. The tax should
 * be 6.75 percent of the meal charge. The tip should be 20 percent of the total
 * after adding tax. Display the meal charge, tax amount, tip amount, and total
 * bill on the screen.
 * 
 * charge
 * tax=charge/6.75
 * tip=(charge+tax) *0.20
 * total=charge+tip+tax
 */