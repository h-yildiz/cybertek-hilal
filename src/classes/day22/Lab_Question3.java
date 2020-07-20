package classes.day22;

public class Lab_Question3 {
	public static void main(String[] args) {
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("Java"));
		System.out.println(extraEnd("a"));
		
	}
	public static String extraEnd (String str1) {
		if (str1.length()<2) {
			return "Invalid String";
		}else {
			String dummy = "";
			dummy = str1.substring(str1.length()-2);
		return dummy+dummy+dummy;
	}
}
}