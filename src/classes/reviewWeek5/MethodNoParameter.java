package classes.reviewWeek5;

import java.util.Scanner;

public class MethodNoParameter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();

		sign(n);
	}

	public static void sign(int n) {
		if (n < 0) {
			System.out.println("-1");
		} else if (n == 0) {
			System.out.println("0");
		} else if (n > 0) {
			System.out.println("1");
		}
	}// end sign

}
