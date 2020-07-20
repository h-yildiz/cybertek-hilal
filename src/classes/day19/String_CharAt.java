package classes.day19;

public class String_CharAt {
	public static void main(String[] args) {

		String word = "Computer";

		System.out.println(word.length());

		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));

		System.out.println("---------------------------------------");
		String word2 = "Apple";

		// Check if first character is A
		if (word2.charAt(0) == 'A') {
			System.out.println("A is the first character");
		} else {
			System.out.println("A is not the first character");
		}
		System.out.println("---------------------------------------");
		// Check if first and last characters are the same 
		// char first word3.charAt(0)
		// and char last word3.charAt(4)
		String word3 = "civic";
		if (word3.charAt(0) == word3.charAt(4)) {
			System.out.println("First and the last characters are the same");
		} else {
			System.out.println("First and the last characters are not the same");
		}
		System.out.println("---------------------------------------");
		// last index not hard corded
		String word4 = "Java";

		char lastChar = word4.charAt(word4.length() - 1);
		System.out.println("Last char of " + word4 + " is " + lastChar);
	}

}
