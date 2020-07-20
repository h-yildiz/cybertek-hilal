package classes.day23;

public class Lab_Question13 {
	public static void main(String[] args) {

		String str = "Hi-There";
		String newString = "";

		for (int i = 0; i < str.length(); i++) {
			newString = newString + str.substring(i, i + 1).concat(str.substring(i, i + 1));
		}
		System.out.println(newString);
	}
}
