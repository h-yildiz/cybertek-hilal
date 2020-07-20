package classes.reviewWeek5;

public class MethodNoParameter1 {
	public static void main(String[] args) {

		countFrom1to10();
		printAtoZ();
	}

	public static void countFrom1to10() {
		for (int k = 1; k <= 10; k++) {
			System.out.print(k + " ");
		}
		System.out.println();
	}

	public static void printAtoZ() {
		for (char letter = 'A'; letter <= 'Z'; letter++) {
			System.out.print(letter + " ");
		}
		System.out.println();
	}
}