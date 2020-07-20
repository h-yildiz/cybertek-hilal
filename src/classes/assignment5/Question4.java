package classes.assignment5;

import java.util.Scanner;

public class Question4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
     	
     	
     	
     	for( int number=scan.nextInt();  number<100; number*=10) {
     		
     		System.out.print(number + " ");
     	}
	}

}
