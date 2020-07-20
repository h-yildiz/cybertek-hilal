package classes.repl_sorulari;

import java.util.Scanner;

public class Question_097 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		System.out.println(countJava(word));
	}
		public static int countJava(String word){
		 
		 int len = word.length()-1;
		 	int times = 0;
		 	for(int i = 0; i < len; i++){
		 		if(word.charAt(i) == 'j' && word.charAt(i+1) == 'a' && word.charAt(i+2) == 'v' && word.charAt(i+3) == 'a') {
		 			times++;
		 	}
		 }
			return times;
		}
}