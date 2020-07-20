package classes.assignment4;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the day: ");
		int day=scan.nextInt();
		System.out.println("Enter the month:");
		int month=scan.nextInt();
		System.out.println("Enter a two digit-year:");
		int year=scan.nextInt();
		
		
		if(day*month==year) {
			System.out.println("Date is magic!");
		}else {
			System.out.println("Date is not magic.");
		}
		}
	}


