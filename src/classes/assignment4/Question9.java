package classes.assignment4;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Weight of package:");
		int weight=scan.nextInt();
		int numOf500Mile=scan.nextInt();
		
		if (weight<=2) {
			System.out.println("Shipping charge is " + (numOf500Mile* 1.10));
		}else if(weight>2 && weight<=6) {
			System.out.println("Shipping charge is " + (numOf500Mile* 2.20));
		}else if(weight>6 && weight<=10) {
			System.out.println("Shipping charge is " + (numOf500Mile* 3.70));
		}else if(weight>10) {
			System.out.println("Shipping charge is " + (numOf500Mile* 3.80));
		}
	}

}
