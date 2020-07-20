package classes.day15;

public class Task69 {
	public static void main(String[] args) {

		//System.out.println(isPrime(23));
		
		int number=4;
		if(isPrime(number)) {
			System.out.println(number + " is a prime number");
		}else {
			System.out.println(number + " is not a prime number");
		}
		//2 is prime number
		//3 -->3/2?
		//4--> 4/3 4/2 ?
		//5 --> 5/4 5/3 5/2?
		// ....
		// 1. if statement
		// 2. if number 0 or 1
		// 1- loop from to num(excluded)
		// 2- break loop

	}

	public static boolean isPrime(int number) {
		boolean flag = true;
		if (number == 0 || number == 1) {
			flag = false;
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

}
