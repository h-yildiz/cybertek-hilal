package classes.day15;

public class Task71 {

	public static void main(String[] args) {
		calcFeetAndInchesToCentimeters(100);
	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if (feet < 0 || (inches < 0 || inches > 12)) {
			System.out.println("Invalid feet or inches");
			return -1;
		}
		double centimeters = (feet * 12) * 2.54;
		System.out.println(feet + "  feet, " + inches + " inches = " + centimeters + " centimeters");
		return centimeters;
	}

	public static double calcFeetAndInchesToCentimeters(double inches) {
		if (inches < 0) {
			return -1;
		}
		double feet = (int) inches / 12;
		double remainingInches = inches % 12;

		System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches");
		return calcFeetAndInchesToCentimeters(feet, remainingInches);

	}
}

/*
 * 1. parameters are valid or not 2. if it is valid then calculate centimeters
 * and return the value 3. create second method with he same name with one
 * parameter (inches) validate it <=0 return -1 if it is not true if it is valid
 * then calculate how many feet are in the inches 4. call the other overloaded
 * method passing the correct feet and inches calculated so that it can
 * calculate correctly
 * 
 * hint: use double as a datataype
 */