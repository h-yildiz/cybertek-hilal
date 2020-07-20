package classes.day16;

public class Contact {
	String name;
	long phoneNumber;
	String email;
	
	public void call() {
		System.out.println("Calling " + name);
	}

	public void sendMessage() {
		System.out.println("Sending text message to " + phoneNumber + "  | name:   " + name);
	}
	public void sendEmail() {
		System.out.println("Sending an email to" + email);
	}
}

