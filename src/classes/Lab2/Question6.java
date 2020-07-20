package classes.Lab2;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {

		salesTax(55);

	}

	public static void salesTax(double stateCounty) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount of purchase:");
		int purchase = scan.nextInt();

		double stateSalesTax = (purchase * 0.04);
		double countySalesTax = (purchase * 0.02);
		
		System.out.println("----------------------------------------------");
		System.out.println("The amount of purchase is: " + purchase);
		System.out.println("The state sales tax is: " + stateSalesTax);
		System.out.println("The county sales tax is: " + countySalesTax);
		System.out.println("The total sales tax is: " + (stateSalesTax + countySalesTax));
		System.out.println("The total of the sale is: " + (purchase + countySalesTax +  stateSalesTax));
		System.out.println("----------------------------------------------");
	}
		
}
/*
 * Write a program that will ask the user to enter the amount of a purchase. The
 * program should then compute the state and county tax sales tax. Assume the
 * state sales tax is 4 percent and the county sales tax is 2 percent. The
 * program should display the amount of the purchase , the state sales tax, the
 * county sales tax, the total sales tax, and the total of the sale (which is
 * the sum of the amount of purchase plus the total sales tax)
 */

/*
 * 1. scanner 2. compute sales taxes for state and county. if statements - if
 * state tax %4, if county %2. console: amount of purchase, state sales tax,
 * county sales tax, total sales tax, total of the sale (sum=purchase+total
 * sales taxes)
 */
