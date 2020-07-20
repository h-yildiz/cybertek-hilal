package classes.reviewWeek5;

import java.util.Scanner;

public class LeasingOffice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many rooms do you want?");
		int numberOfBedrooms = scan.nextInt();
		CalculateRent(numberOfBedrooms);
		int monthlyIncome = 3000;
		double net = monthlyIncome - (CalculateRent(numberOfBedrooms) + calculateExpense(numberOfBedrooms));
		
		if(net<1000) {
		System.out.println("Enroll Cybertek");
		}else  {
			System.out.println("Enjoy with the life");
		}
	}

	public static int CalculateRent(int numberOfBedrooms) {
		int rent = 0;
		if (numberOfBedrooms == 1) {
			rent = 1100;
		} else if (numberOfBedrooms == 2) {
			rent = 1850;
		} else if (numberOfBedrooms == 3) {
			rent = 2550;
		}
		return rent;
	}

	public static double calculateExpense(int numberOfBedrooms) {
		return CalculateRent(numberOfBedrooms) * 0.5;
	}
}
