package classes.assignment4;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the seconds: ");
		int seconds=scan.nextInt();

		if (seconds>60 && seconds<3600) {
			System.out.println("Number of minute(s): " + (seconds/60) + " in " + seconds + " seconds");
			}else if(seconds>3600 && seconds<86400) {
				System.out.println("Number of hour(s): " + (seconds/3060) + " in " + seconds + " seconds");
			}else if(seconds>86400) {
				System.out.println("Number of day(s): " + (seconds/86400) + " in " + seconds + " seconds");
			}
}
}