package classes.day20;

import java.util.Scanner;

public class Task82 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your username: ");
		String username = sc.nextLine();
		System.out.println("Enter your password: ");
		String password = sc.nextLine();
		
		String userNameInSystem = "Mike";
		String passwordInSystem = "123";
		
		if (username.equals("") && password.equals("")) {
			System.out.println("Username and password fields can not be empty");
		}else if (username.equals("") && !password.equals("")) {
			System.out.println("Username can not be empty");
		}else if (!username.equals("") && password.equals("")) {
			System.out.println("Password can not be empty");	//boolean b1 = s1.equals(s2);
		}else if (!username.equals(userNameInSystem)   ||  !password.equals(passwordInSystem)) {
			System.out.println("Username or password is not valid. Please verify");
		}else if(username.equals(userNameInSystem) && password.equals(passwordInSystem)) {
			System.out.println("User Logged in succesfully");
		}
	}

}
