package classes.day22;

public class Lab_Question8 {
	public static void main(String[] args) {
		
		System.out.println(left2("Hello"));
		System.out.println(left2("java"));
		System.out.println(left2("hi"));
	}
	public static String left2 (String str) {
		if (str.length()<2) {
			return str;
		}else {
			return str.substring(2).concat(str.substring(0,2));	
		}
	}
}
