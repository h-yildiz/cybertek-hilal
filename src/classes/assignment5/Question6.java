package classes.assignment5;

import java.util.Scanner;

public class Question6 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number=scan.nextInt();
		
		int num1=0;
		int num2=1;
		
		
		for(int i=1;i<=number;i++) {
			
			
			System.out.print(num1+", ");
			int sum=num1+num2;
			num1=num2;
			num2=sum;
			
		
		}
}
}