package classes.day24;

import java.util.Scanner;

public class Task86 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String [] monthName = new String [12];
		
		monthName [0] = "January";
		monthName [1] = "February";
		monthName [2] = "March";
		monthName [3] = "April";
		monthName [4] = "May";
		monthName [5] = "June";
		monthName [6] = "July";
		monthName [7] = "August";
		monthName [8] = "Sepetmber";
		monthName [9] = "October";
		monthName [10] = "November";
		monthName [11] = "December";
		
		System.out.print("Enter your month index number:");
		int index = sc.nextInt ();
		
		System.out.println("The month is " + monthName [index]);
		
		System.out.println(monthName);
	}

}
