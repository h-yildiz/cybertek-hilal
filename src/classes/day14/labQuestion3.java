package classes.day14;

public class labQuestion3 {
	
	public static void main(String[] args) {
		
		specialEleven(23);
		
	}

	public static void specialEleven(int num) {
		if (num%11==0 || (num-1)%11==0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
}
