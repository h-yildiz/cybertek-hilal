package classes.repl_sorulari;

import java.util.Scanner;

public class Question_069 {
	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		 
		    String dummy = word.substring(0,word.length()/2) + word.substring(0,word.length()/2);
		    System.out.println(dummy);
		    

}
}