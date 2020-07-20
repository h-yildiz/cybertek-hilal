package classes.day22;

public class Lab_Question6 {
	public static void main(String[] args) {
		
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("java"));
		System.out.println(withoutEnd("coding"));
		
	}
	public static String withoutEnd (String word) {
		return word.substring(1, word.length()-1);
		
	}
}
