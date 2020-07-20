package classes.day22;

public class StringManipulationLab_isEmpty {
	public static void main(String[] args) {
		
		String userName = "";
		String password = "";
		
		if (userName.isEmpty()) {
			System.out.println("Username field can not be empty");
		}else {
			System.out.println("User name is not empty");
		}
		
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password can not be empty");
		}else {
			System.out.println("Username or password is not empty");
		}
	}

}
