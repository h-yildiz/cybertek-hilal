package classes.day15;

public class assignment3_fibonacciNumbers {
	public static void main(String[] args) {
		int count = 8;
		int pre1 = 0, pre2 = 1;

		System.out.println("Fibonacci series of  " + count + " numbers");

		for (int i = 1; i <= count; i++) {

			System.out.print(pre2 + " ");

		// on each iteration we are assigning second number to the first number
		// assigning sum of last two numbers to the second number

		int sumOfPrevTwo = pre1 + pre2;
		pre1=pre2;
		pre2=sumOfPrevTwo;
		
	}
	}
}
