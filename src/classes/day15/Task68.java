package classes.day15;

public class Task68 {
	public static void main(String[] args) {

		yearsUntilRetirement("Mike", 1990);

	}

	public static void yearsUntilRetirement(String name, int year) {
		int retirementAge = 65;
		int yearsUntilRetirement = retirementAge - calculateAge(year);
		System.out.println(name + " retires in " + yearsUntilRetirement + " years");

	}

	public static int calculateAge(int yearBirth) {
		int calculateAge = 2020 - yearBirth;
		return calculateAge;
	}
}
