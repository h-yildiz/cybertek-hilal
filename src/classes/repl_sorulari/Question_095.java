package classes.repl_sorulari;

import java.util.Scanner;

public class Question_095 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char start = scan.next().charAt(0);
		char end = scan.next().charAt(0);
		
		for (char i = start; i<=end; i++) {
			System.out.print(i);
		}
	}

}
