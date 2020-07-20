package classes.repl_sorulari;

import java.util.Scanner;

public class Question_064 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if (word.length() % 2 != 0) {
			if (word.length() == 1) {
				System.out.println(word + word + word);
			} else if (word.length() >= 3) {
				System.out.println(word.charAt((word.length() - 1) / 2));
			}
		}
		if (word.length() % 2 == 0) {
			if (word.length() == 2) {
				System.out.println(word + word);
			} else if (word.length() >= 4) {
				System.out.println(word.substring((word.length() / 2) - 1, (word.length() / 2)+1));
				}
			
		}
	}

}
