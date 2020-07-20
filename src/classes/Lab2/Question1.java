package classes.Lab2;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean another = true;
		
		System.out.println("Enter your first number:");
		int num1 = scan.nextInt();
		int number;
		int min = num1;
		int max = num1;
		do {
			System.out.println("Enter your next number:");
			int num2 = scan.nextInt();
			if(min > num2) {
				min = num2;
			} else if(max < num2) {
				max = num2;
			}
			System.out.println("Do you want to enter another number: 0-No, 1-Yes");
			number = scan.nextInt();
			if(number == 0) {
				another = false;
			}
		} while(another == true);
		System.out.println("Smallest Number is: " + min);
		System.out.println("Largest Number is: "+ max);
	}

	}

	/*
	 * Write a program with a loop that lets the user enter a series of integer
	 * numbers. After all the numbers have been entered, the program should display
	 * the largest and smallest numbers entered
	 */


