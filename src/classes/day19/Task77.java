package classes.day19;

public class Task77 {
	public static void main(String[] args) {

		String emoji = ":)";

		if (emoji.length() != 2) {
			System.out.println("Invalid Emoji");
			return;
		}
			// if code reaches this point, the emoji is 2 characters
			// get first and second characters and assign to the variables

			char first = emoji.charAt(0);
			char second = emoji.charAt(1);

			if (first == ':') {
				if (second == ')') {
					System.out.println("Smile");
				} else if (second == '(') {
					System.out.println("Sad");
				} else if (second == '/') {
					System.out.println("Upset");
				} else if (second == 'p') {
					System.out.println("playful");
				} else {
					System.out.println("Unknown emoji");
				}

			} else if (first == ';') {
				if (second == ')') {
					System.out.println("Wink");
				} else if (second == '0') {
					System.out.println("Surprised");
				} else {
					System.out.println("Unkown Emoji");
				}
			}

		}
	}
