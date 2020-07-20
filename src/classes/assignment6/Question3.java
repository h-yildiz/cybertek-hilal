package classes.assignment6;

public class Question3 {

	public static void main(String[] args) {

		int k = 8;
		for (int i = 7; i >= 1; i--) {
			k = k - i;
			switch (i) {
			case 6:
				System.out.print(" ");
				break;
			case 5:
				System.out.print("  ");
				break;
			case 4:
				System.out.print("   ");
				break;
			case 3:
				System.out.print("    ");
				break;
			case 2:
				System.out.print("     ");
				break;
			case 1:
				System.out.print("      ");
				break;
			}
			for (int j = 1; j <= i; j++) {

				System.out.print(k);
				k++;
			}
			System.out.println();
		}

		int m = 8;
		int space = 6;
		for (int i = 1; i < 7; i++) {
			m = m - i - 1;
			space--;
			switch (space) {
			case 6:
				System.out.print("      ");
				break;
			case 5:
				System.out.print("     ");
				break;
			case 4:
				System.out.print("    ");
				break;
			case 3:
				System.out.print("   ");
				break;
			case 2:
				System.out.print("  ");
				break;
			case 1:
				System.out.print(" ");
				break;
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(m);
				m++;

			}
			System.out.println();

		}

	}
}
