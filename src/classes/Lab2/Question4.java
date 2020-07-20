package classes.Lab2;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("How many males are in your class? ");
	int males = scan.nextInt();
	System.out.println("How many females are in your class? ");
	int females = scan.nextInt();
	
	percentage(males, females);
}
public static void percentage(int males, int females) {
	int students = males + females; //20
	double malesPercentage = ((double)males / (double)students) * 100;
	double femalesPercentage = ((double)females / (double)students) * 100;
	
	System.out.println("Males percentage is " +malesPercentage);
	System.out.println("Females percentage is " + femalesPercentage);
}

}
