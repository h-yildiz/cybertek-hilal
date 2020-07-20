package classes.assignment4;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Number of packages purchased:");
		int quantity=scan.nextInt();
		double total=quantity*99;
		
		System.out.println("Quantity: " + quantity);
		 
		if (quantity>10 && quantity<19) {
			System.out.println("Amount of Discount: %20");
			System.out.println("Total amount of purchase after discount: $ " + (total - (total*0.2)));
		}else if(quantity>20 && quantity<49) {
			System.out.println("Amount of Discount: %30");
			System.out.println("Total amount of purchase after discount: $ " + (total - (total*0.3)));
		}else if(quantity>50 && quantity<99) {
			System.out.println("Amount of Discount: %40");
			System.out.println("Total amount of purchase after discount: $ " + (total - (total*0.4)));
		}else if(quantity>=100) {
			System.out.println("Amount of Discount: %50");
			System.out.println("Total amount of purchase after discount: $ " + (total - (total*0.5)));
	}

}
}