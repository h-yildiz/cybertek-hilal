package classes.day23;

import java.util.*;

public class Task85 {
	public static void main(String[] args) {

		Random rn = new Random();

		int counterComp = 0;
		int counterUser = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Rolling dice...");
			int computerDice = rn.nextInt(6) + 1;
			int userDice = rn.nextInt(6) + 1;
			System.out.println("Their values are: ");
			System.out.println(computerDice + " " + userDice);

			if (computerDice > userDice) {
				counterComp++;
			} else if (userDice > computerDice) {
				counterUser++;
			}

		}
		System.out.println("Computer: " + counterComp);
		System.out.println("User: " + counterUser);
		if (counterComp > counterUser) {
			System.out.println("Winner is the Computer!");
		} else if (counterComp < counterUser) {
			System.out.println("Winner is the User!");
		} else {
			System.out.println("There is no winner!");
		}

	}

}
