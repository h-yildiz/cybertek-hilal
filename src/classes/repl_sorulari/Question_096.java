package classes.repl_sorulari;

import java.util.Scanner;

public class Question_096 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String separator = scan.next();
		int count = scan.nextInt();

		if (count == 1) {
			System.out.println(word);
		} else {
			System.out.println(word.concat(separator).repeat(count - 1) + word);
		}

		for (int i = 1; i <= count; i++) {
			if (0 < i && i < count) {
				System.out.print(word.concat(separator));
			} else if (i == count) {
				System.out.print(word);

			}

		}
	}

}
