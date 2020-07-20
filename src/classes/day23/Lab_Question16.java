package classes.day23;

public class Lab_Question16 {
	public static void main(String[] args) {

		System.out.println(atFirst("hello"));
		System.out.println(atFirst("hi"));
		System.out.println(atFirst("h"));

	}

	public static String atFirst(String str) {
		if (str.length() < 2) {
			return str.concat("@");

		} else {
			return str.substring(0, 2);

		}

	}

}
