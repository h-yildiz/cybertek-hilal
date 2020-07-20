package classes.reviewWeek5;

public class VotingCheck {
	public static void main(String[] args) {

		checkIfCanVote(30);
		int age2 = 2020 - 1985;
		checkIfCanVote(age2);
		printAge(1985);
	}

	public static void checkIfCanVote(int age) {
		if (age >= 18) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("You are not eligible to vote");
		}
	}

	public static void printAge(int birthday) {
		int age = 2020 - birthday;

		System.out.println("Birth year is: " + birthday + " Age is " + age);
	}

	{

	}
}
