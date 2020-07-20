package classes.day25;

import java.util.Scanner;

public class PayArray {
	public static void main(String[] args) {
		
		final int EMPLOYEES = 5;
		double payRate;
		double grossPay;
		int [] payment = new int [5];
		
		Scanner sc = new Scanner (System.in);
		
		int [] hours = new int[EMPLOYEES];
		
		System.out.println("Enter the hours worked by " + EMPLOYEES + " employees who all earn the same hourly wage");
		
		for (int i =0; i<EMPLOYEES; i++) {
			hours [i] = sc.nextInt();
		}
		
		System.out.print("Enter the hourly rate for each employee:");
		payRate = sc.nextDouble();
		
		for (int i = 0; i<EMPLOYEES; i++) {
			grossPay = hours [i]*payRate;
			
			System.out.println("Employee #" + (i+1) + ": $ " + grossPay);
		}
	}

}
