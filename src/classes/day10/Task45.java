package classes.day10;

public class Task45 {
	public static void main(String[] args) {
		
		int num1=50;
		int num2=10;
		int repeat=3;
		
		for (int i=1; i<=3; i++) {
			
			if(num1>num2) {
				System.out.println("Number1 is greater than Number2");
			}else if(num2>num1) {
				System.out.println("Number2 is greater than Number1");
			}else if(num1==num2) {
				System.out.println("Number1 is equal to Number2");
			}
			System.out.println();
		}
		
		
		
		
	}

}
