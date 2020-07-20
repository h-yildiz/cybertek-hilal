package classes.reviewWeek7;

public class String_IndexOf {
	public static void main(String[] args) {

		String word = "github";

		System.out.println(word.indexOf("g")); // 0
		System.out.println(word.indexOf("b")); // 5
		System.out.println(word.indexOf("th")); // 2
		System.out.println(word.indexOf("tb")); // -1

		String languages = "java,c++,js,tomcat,aws";

		// indexOf - >

		// lastIndexOf < -

		// how can i check if c++ is in the languages string
		if (languages.indexOf("c++") > -1) {
			System.out.println("c++ is there");
		} else {
			System.out.println("c++ is not there");
		}

		System.out.println(languages.indexOf("c++", 9)); // go to 9th character and look for c++ after that portion

		int firstComma = languages.indexOf(",");
		System.out.println("First Comma=" + firstComma);

		// find the last comma
		int lastComma = languages.lastIndexOf(",");
		System.out.println("Last Comma=" + lastComma);

		// how to find second comma?
		int secondComma = languages.indexOf(",", 5);
		System.out.println("Second Comma=" + secondComma);

		// how to find third comma?
		int thirdComma = languages.indexOf(",", secondComma + 1);
		System.out.println("Third Comma=" + thirdComma);

	}

}
