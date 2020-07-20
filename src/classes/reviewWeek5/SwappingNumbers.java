package classes.reviewWeek5;

public class SwappingNumbers {
	public static void main(String[] args) {

		swapNumbers(10, 20);
	}

	public static void swapNumbers(int n1, int n2) { // 10 20
		n1 = n1 + n2; // 10+20=30
		n2 = n1 - n2; // 30-10=20
		n1 = n1 - n2; // 30-20=10
		
		System.out.println("number 1: " + n1);
		System.out.println("number 2: " + n2);

	}
}
