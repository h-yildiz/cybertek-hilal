package classes.reviewWeek5;

import java.util.Scanner;

public class BMIFinder {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("What is your weight in pounds?");
		int massPound = scan.nextInt();

		System.out.println("What is your height in feet?");
		int heightFeet = scan.nextInt();

		System.out.println("What is your height in inch");
		int heightInch = scan.nextInt();
		BMI(massPound, heightFeet, heightInch);
	}

	public static void BMI(int massPound, int heightFeet, int heightInch) {
		double weight = (massPound / 2.2);
		double heightMeters = ((heightFeet * 12) + heightInch) * 0.0254;
		double BMI = weight / (heightMeters * heightMeters);

		if (BMI < 18.5) {
			System.out.println("BMI is " + BMI);
			System.out.println("Your risk category is underweight");
		} else if (BMI >= 18.5 && BMI < 25) {
			System.out.println("BMI is " + BMI);
			System.out.println("Your risk category is normal weight");
		} else if (BMI <= 25 && BMI < 30) {
			System.out.println("BMI is " + BMI);
			System.out.println("Your risk category is overweight");
		} else if (BMI >= 30) {
			System.out.println("BMI is " + BMI);
			System.out.println("Your risk category is obese");
		}
	}
}