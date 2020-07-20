package classes.repl_sorulari;

import java.util.Scanner;

public class Question_076 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    String name = email.substring(0, email.indexOf("_"));
	    String surname = email.substring(email.indexOf("_")+1, email.indexOf("@"));
	    
	    if (email.contains("_")) {
	    	System.out.println(surname + "_" + name + "@gmail.com");
	    }else {
	    	System.out.println(email);
	    }
	}
	
}
