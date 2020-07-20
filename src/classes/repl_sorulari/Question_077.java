package classes.repl_sorulari;

import java.util.Scanner;

public class Question_077 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String email = scan.next();
		
		String name = email.substring(0, email.indexOf("_"));
	    String surname = email.substring(email.indexOf("_")+1, email.indexOf("@")); 
	    String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
	    String top_level_domain = email.substring(email.indexOf(".")+1);
	    
	    System.out.println("First name: " + name.substring(0,1).toUpperCase()+name.substring(1));
	    System.out.println("Last name: " + surname.substring(0,1).toUpperCase()+surname.substring(1));
	    System.out.println("Domain: " + domain);
	    System.out.println("Top-level Domain: " + top_level_domain);

	}

}
/* Write a program that will print out information about user based on email. Print first and last name from the upper case.

Example:
Input: craig_federighi@apple.com
Output: 
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com */