package classes.assignment6;

public class Question5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 7; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print(1);
			}

			int rows = 1;
			for (int k = 1; k <= rows; k++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}
}
