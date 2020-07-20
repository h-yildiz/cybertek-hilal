package classes.day13;

import java.util.Scanner;

	public class Task57 {
	
		public static void main(String[] args) {
		
		sum();
	}

	public static void sum() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int num1=scan.nextInt();
		System.out.println("Enter the second number");
		int num2=scan.nextInt();
		System.out.println("Enter the third number");
		int num3=scan.nextInt();
		
		int result=(num1+num2+num3);
		System.out.println("Total is: " + result);
	}
}
