package classes.day15;

public class Task67 {
	public static void main(String[] args) {

		System.out.println(lastDigit(7, 17));
	}

	public static boolean lastDigit(int num1, int num2) {
		if (num1 % 10 ==  num2 % 10) {
			return true;
		}else {
			return false;
		}

	}
}
