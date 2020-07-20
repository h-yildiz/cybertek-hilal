package classes.reviewWeek5;

public class Change {
	public static void main(String[] args) {
		changeConverter(45);
		changeConverter(65);

	}

	public static void changeConverter(int PriceInCentes) {

		int change = 100 - PriceInCentes;
		int quarter = change / 25;
		int dimes = (change % 25) / 10;
		int nickels = ((change % 25) % 10) / 5;

		System.out.println("Your change is " + quarter + " quarters, " + dimes + " dimes, " + nickels + " nickels");
	}
}

/*
 * Algorithm:
 * 
 */