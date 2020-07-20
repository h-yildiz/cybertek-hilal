package classes.assignment5;

import java.util.Scanner;

public class Question8 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an upper bound:");
		
		int upperBound=scan.nextInt();
		int i=1;
		int result=0;
		
		while(i<=upperBound) {
			System.out.print(i + " + ");
			result=result+i;
			i++;
		}
		System.out.println(" = " + result);
		
			}
			
			
			
		
	}


