package classes.day13;

public class Task59 {
	
	public static void main(String[] args) {
		
		payment(30, 6.7);
	}

	public static void payment (double numberOfHours, double hourlyPay) {
	
		double payment=hourlyPay*numberOfHours;
		
		System.out.println("Your payment is: " + payment);
		
	}
	
}
