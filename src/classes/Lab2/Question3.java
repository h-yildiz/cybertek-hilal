package classes.Lab2;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive nonzero number:");
		int number = scan.nextInt();
		int sum= 0;
		
		for (int i = 1; i<=number; i++) {
			 sum= sum+i;
		}
		System.out.println(sum);

	}

}
