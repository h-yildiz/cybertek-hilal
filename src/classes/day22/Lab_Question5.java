package classes.day22;

public class Lab_Question5 {
	public static void main(String[] args) {
		System.out.println(firstHalf("Woohoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
	}
	public static String firstHalf(String str) {
		
		int x = str.length()/2;
		return str.substring(0,x);
		
	}
}
