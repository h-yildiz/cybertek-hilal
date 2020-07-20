package classes.day22;

public class Lab_Question2 {
	public static void main(String[] args) {
		System.out.println(makeAbba1("Hi", "Bye"));
		System.out.println(makeAbba1("Yo", "Alice"));
	}
	/*public static String makeAbba (String str1, String str2) {
		
		return str1 + str2 +str2 +str1;
	}*/
	
	public static String makeAbba1 (String str1, String str2) {
		return str1.concat(str2) + str2.concat(str1);
	}
}
