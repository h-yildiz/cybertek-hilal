package classes.day22;

public class Lab_Question4 {
	public static void main(String[] args) {
		
		System.out.println (firstTwo ("Hello"));
		System.out.println(firstTwo ("X"));
		System.out.println(firstTwo("ab"));
		
	}
	public static String firstTwo(String word) {
		if (word.length()<2) {
			return word;
		}else if (word == "") {
			return word;
		}else {
			return word.substring(0,2);
		}
	
		
		
	}
}
