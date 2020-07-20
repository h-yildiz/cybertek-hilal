package classes.reviewWeek4;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {

//		int sum=0;
//		int counter=0;
//		
//		for(int i=10; i<=30; i++) {
//			
//			sum=sum+i;
//			counter++;
//		}
//			System.out.println(sum);
//			System.out.println(counter);

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the start point: ");
		int startPoint = scan.nextInt();
		System.out.println("Enter the end point: ");
		int endPoint = scan.nextInt();
		System.out.println("Your number should be divisible by:  ");
		int devisible = scan.nextInt();
		System.out.println("You want to see odd or even numbers - 0 for odd, 1 for even numbers: ");
		int oddOrEven = scan.nextInt();

		int sum = 0;

		for (int i = startPoint; i <= endPoint; i++) {

			if (i % devisible == 0) {
				if (oddOrEven == 0) {
					if (i % 2 == 1) {
						sum = sum + i;
//						System.out.print(i + " ");
					}
				}
				if (oddOrEven == 1) {
					if (i % 2 == 0) {
						sum = sum + i;
					//	System.out.print(i + " ");
					}
				}
			}
		}

		System.out.println();
		System.out.println("sum= " + sum);

	}
}
