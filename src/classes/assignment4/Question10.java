package classes.assignment4;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Number of calories in a food item:");
		int calories=scan.nextInt();
		System.out.println("Fat grams in a food item:");
		double fatgr=scan.nextDouble();
		
		double caloriesFromFat = fatgr * 9;
		double percentageOfCalories=caloriesFromFat/calories;
		
		System.out.println("Percentage of calories: % " + percentageOfCalories);
		
		if (percentageOfCalories<(calories*0.30)) {
			System.out.println("The food is low in fat");
		}
		if (caloriesFromFat>calories) {
			System.out.println("Error message: The input is invalid.");
		}
				
		
		
	}

}
