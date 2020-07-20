package classes.day19;

public class String_Concat {
	public static void main(String[] args) {

		String word = "Java";
		System.out.println(word.concat("selenium"));
		System.out.println(word.concat(" in Eclipse"));

		System.out.println(word);
		
		word = word.concat(" + Eclipse");
		System.out.println(word);
		
		word = word.concat(" Automation");
		System.out.println(word);
		
		//word = word.concat(123); this will not work because parameter is integer
		
		word = word + 123; // string + integer = string
		System.out.println(word);
		
		word = word + true;
		System.out.println(word);
		
		String word2 = "Hi";
		word2 = word2.concat("- Hey").concat(" - How are you").concat(" - Good");
		System.out.println(word2);
		
		
	}

}
