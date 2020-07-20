package classes.repl_sorulari;

import java.util.Scanner;

public class Question_099 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();
		System.out.println(prefixAgain(str,n));
	}

	public static boolean prefixAgain(String str, int n) {

		int len = str.length();

		String prefix = str.substring(0, n);

		for (int i = n; i < len; i++) {

			if (n + i <= len) {

				if (prefix.equals(str.substring(i, n + i)))

					return true;

			}

		}

		return false;
	}

}

//Given a string, consider the prefix string made of the first n chars of the string. Does that prefix string appear somewhere else in the string? 
//Assume that the string is not empty and that n is in the range from 1 till str.length().