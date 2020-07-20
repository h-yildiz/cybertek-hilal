package classes.day22;

public class Lab_Question9 {
	public static void main(String[] args) {
		
		System.out.println(right2("Hello"));
	}
	public static String right2(String str) {
		String str1 = str.substring(str.length()-2).concat(str.substring(0, str.length()-2));
		return str1;
		
	}
}
