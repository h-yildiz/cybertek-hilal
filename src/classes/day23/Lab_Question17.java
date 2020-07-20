package classes.day23;

public class Lab_Question17 {
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("racecar"));
		System.out.println(isPalindrome("top spot"));
		System.out.println(isPalindrome("racer"));
		
	}
	public static boolean isPalindrome (String str) {
		String dummy = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			dummy = dummy + str.charAt(i);
		}
		if (str.replace(" ", "").equalsIgnoreCase(dummy.replace(" ", ""))) {
			return true;
		}else {
			return false;
		}

		

	}
}
