package classes.day19;

public class Task78 {
	public static void main(String[] args) {

		String str = "abcabqcabc";
		char myChar = 'a';
		int counter = 0;
		// Number of a in this string is: 3

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == myChar) {
				counter++;
			}
		}
		System.out.println("Number of " + myChar + " in this string is " + counter);
	}

}
