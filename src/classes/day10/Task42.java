package classes.day10;

public class Task42 {
	public static void main(String[] args) {
		
		int sumEven=0;
		int sumOdd=0;
		
		for(int i=2; i<=100; i++) {
			if(i%2==0) {
				sumEven=sumEven+i;
		}else {
			sumOdd=sumOdd+i;
			
		}
	}
System.out.println("Sum of even number " + sumEven);
System.out.println("Sum of odd number " + sumOdd);
}
}
