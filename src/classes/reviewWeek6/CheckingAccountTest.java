package classes.reviewWeek6;

public class CheckingAccountTest {
	public static void main(String[] args) {
		
		checkingAccount ClientOne = new checkingAccount();
		
		ClientOne.accountNumber = 3545476587665l;
		ClientOne.accountHolder = "Mike";
		ClientOne.balance = 500.0;
		
		ClientOne.getAccountInfo();
		
		checkingAccount Client2 = new checkingAccount();
		Client2.setInfo(300.0, 4387265865675l, "Ozzy");
		
		ClientOne.deposit(300);
		ClientOne.getAccountInfo();
		
		ClientOne.withdraw(100);
		ClientOne.getAccountInfo();
		
		checkingAccount myAccount = new checkingAccount();
		myAccount.setInfo(200, 6576597553l, "Mike Smith");
		myAccount.purchase("Book", 120);
		
		System.out.println("Current balance: " + myAccount.balance);
		
		myAccount.purchase("Shoes", 100);
		myAccount.getAccountInfo();
		
		myAccount.deposit(10000);
		myAccount.getAccountInfo();
		
	}

}
