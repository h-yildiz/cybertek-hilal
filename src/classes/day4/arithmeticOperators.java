package classes.day4;

public class arithmeticOperators {

	public static void main(String[] args) {
		System.out.println(55+5);
		int chairs = 140;
		System.out.println(chairs+2);
		//chairs = chairs+2; if you dont assign a different value, just print it, the value remains the same. 
		
		int moreChairs = chairs+5;
		System.out.println(moreChairs);
		
		int tables=130;
		int total=tables+chairs;
		System.out.println(total);
		
		double balance=1200.50;
		double transaction=56.44;
		System.out.println(balance-transaction);
		balance= balance-transaction;
		System.out.println(balance);
		
		
		int linesOfCode=50;
		System.out.println("Lines of Code " + linesOfCode);
		
		linesOfCode= linesOfCode - 2;
		System.out.println("Lines of Code " + linesOfCode);
		
		
		
	}
	
}
