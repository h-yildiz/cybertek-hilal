package classes.day17;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a byte value: ");
		
		byte b1= sc.nextByte();
		
		System.out.println(b1);
		System.out.println(b1*4);
		System.out.println(b1%3);

	}

}
