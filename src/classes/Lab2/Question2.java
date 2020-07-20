package classes.Lab2;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		
			int cookies = 40;
			int servings = 10;
			int caloriesPerServing = 300;
			
			int cookiesPerServing = cookies / servings; //4
			
			int caloriesPerCookie = caloriesPerServing / cookiesPerServing; //75
			
			System.out.println("How many cookies did you eat?");
			Scanner scan = new Scanner(System.in);
			int cookiesWeAte = scan.nextInt();
			System.out.println("We ate "+(cookiesWeAte * caloriesPerCookie)+" calories!");
			System.out.println("We ate "+(cookiesWeAte * 75)+" calories!");
		}

	}


