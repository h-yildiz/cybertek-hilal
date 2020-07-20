package classes.assignment4;

import java.util.Locale;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("What is your weight in pounds?");
     	int massPound=scan.nextInt();
		
     	
     	System.out.println("What is your height in feet?");
		int heightFeet=scan.nextInt();

		System.out.println("What is your height in inch");
		int heightInch=scan.nextInt();
		
		double mass = massPound * 0.453;
		double height =((heightFeet*12) + heightInch)*0.0254;
		
		double BMI=mass/(height*height);
		
		if(BMI<18.5) {
			System.out.println("Your weight in pounds: " + massPound);
			System.out.println("Your height in feet followed by a space then additional inches: " + heightFeet + " " + heightInch);
			System.out.println("BMI is " + BMI);
			System.out.println("Underweight");
		}else if(BMI>=18.5 && BMI<25) {
			System.out.println("Your weight in pounds: " + massPound);
			System.out.println("Your height in feet followed by a space then additional inches: " + heightFeet + " " + heightInch);System.out.println("Your BMI is " + BMI);
			System.out.println("Normal weight");
		}else if(BMI<=25 && BMI<30) {
			System.out.println("Your weight in pounds: " + massPound);
			System.out.println("Your height in feet followed by a space then additional inches: " + heightFeet + " " + heightInch);
			System.out.println("Your BMI is " + BMI);
			System.out.println("overweight");
		}else if(BMI>=30) {
			System.out.println("Your weight in pounds: " + massPound);
			System.out.println("Your height in feet followed by a space then additional inches: " + heightFeet + " " + heightInch);
			System.out.println("Your BMI is " + BMI);
			System.out.println("Obese");
		}
	}
}