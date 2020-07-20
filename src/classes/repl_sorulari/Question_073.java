package classes.repl_sorulari;

import java.util.Scanner;

public class Question_073 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int firstChar = (word.length()/2)-1;
		int lastChar = (word.length()/2)+2;
		
		if (word.length()<5 || word.length()%2==0) {
			System.out.println("Invalid");
		}else if (word.length()>=5 && word.length()%2 != 0) {
			System.out.println(word.substring(firstChar,lastChar));
		}
	}

}
