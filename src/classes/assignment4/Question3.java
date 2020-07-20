package classes.assignment4;

import java.util.Locale;
import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the year: ");
     	int year=scan.nextInt();
		
		if(year%100==0){
			if(year%400==0) {
			System.out.println(year + " Leap Year");
			}
			else {
				System.out.println(year + " NOT a Leap Year");
			}
		}
		else if(year%4==0){
			System.out.println(year + " Leap Year");
		}
		else {
			System.out.println(year + " NOT a Leap Year");
		}

	}
		
	}

