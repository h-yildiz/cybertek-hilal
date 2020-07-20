package classes.assignment5;

public class Question9 {
	
	public static void main(String[] args) {
		
		int number=1;
		int end=11;
		while (number<=end) {
			if(number%2==1) {
				System.out.print(number);
				if(number!=end) {
					System.out.print(",");
				}
			}
		number++;			
		}
		}
	}


