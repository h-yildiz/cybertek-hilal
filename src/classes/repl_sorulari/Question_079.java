package classes.repl_sorulari;

import java.util.Scanner;

public class Question_079 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	   if (word.startsWith("x")  || word.endsWith("x") || word.startsWith("X")  || word.endsWith("X")){
		   System.out.println(word.replace("x", "").replace("X", ""));		  
	   }else {
		   System.out.println(word);
	   }
	}

}
