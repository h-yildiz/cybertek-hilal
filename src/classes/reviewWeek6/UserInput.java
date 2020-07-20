package classes.reviewWeek6;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter first number: ");
		int num1= sc.nextInt();
		
		System.out.println("Enter second number: ");
		int num2= sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		System.out.println(str);
		
	}

}
