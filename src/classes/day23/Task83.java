package classes.day23;

import java.util.*;

public class Task83 {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Random rn = new Random();
		int dice1;
		int dice2;
		String again = "y";

		while (again.equalsIgnoreCase("y")) {
			System.out.println("Rolling dice...");
			dice1 = rn.nextInt(6) + 1;
			dice2 = rn.nextInt(6) + 1;
			
			System.out.println("Their values are: ");
			System.out.println(dice1 + " " + dice2);
			
			System.out.println("Roll them again (y=yes)?");
			again = sc.nextLine();

		}
	}

}
