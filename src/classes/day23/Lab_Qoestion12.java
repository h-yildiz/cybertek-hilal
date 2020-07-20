package classes.day23;

import java.util.Scanner;

public class Lab_Qoestion12 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter a word:");
		 String word = scan.next();

		int counterCat = 0;
		int counterDog = 0;
		
		for (int i = 0; i<word.length()-2; i++) {
			if(word.substring(i, i+3).equalsIgnoreCase("cat")) {
				counterCat++;
			}
			if (word.substring(i, i+3).equalsIgnoreCase("dog")) {
				counterDog++;
			}
			
		}
		if (counterCat == counterDog) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}
}
