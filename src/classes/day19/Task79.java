package classes.day19;

public class Task79 {
	public static void main(String[] args) {

		String word = "CybertekSchool"; // Print only vowel in given string

		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (letter == 'a' || letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u') {
				System.out.print(letter);
				if (i != word.length() - 2) {
					System.out.print(",");
				}
			}
		}

	}

}
