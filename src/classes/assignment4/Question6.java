package classes.assignment4;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the mass: ");
		double mass=scan.nextInt();
		double weight=mass*9.8;
		
		if (weight>10 && weight<1000) {
			System.out.println("The object's weight is: " + weight);
		}else if (weight> 1000) {
			System.out.println("Object is too heavy!");
		}else if(weight<10){
			System.out.println("Object is too light!");
		}

	
	}

}
