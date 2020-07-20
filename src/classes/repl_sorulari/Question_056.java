package classes.repl_sorulari;

import java.util.Scanner;

public class Question_056 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Select screen size:");
		double screenSize = scan.nextDouble();
		
		double laptopPrice = 0;

		if (screenSize == 13.3) {
			laptopPrice = laptopPrice + 200;
		} else if (screenSize == 15.0) {
			laptopPrice = laptopPrice + 300;
		} else if (screenSize == 17.3) {
			laptopPrice = laptopPrice + 400;
		}
		
		System.out.println("Select CPU type:");
		String CPU = scan.nextLine();
		
		if (CPU.equals("i3")) {
			laptopPrice = laptopPrice + 150;
		} else if (CPU.equals("i5")) {
			laptopPrice = laptopPrice + 250;
		} else if (CPU.equals("i7")) {
			laptopPrice = laptopPrice + 350;
		}
		
		scan.nextLine();
		
		System.out.println("Select RAM size:");
		int RamSize = scan.nextInt();
		
		laptopPrice = laptopPrice + (RamSize/4)*50;
		
		System.out.println("Enter memory size:");
		int MemorySize = scan.nextInt();
		
		System.out.println("Select storage type:");
		String storageType = scan.nextLine();
		
		if (storageType.equals("HDD")) {
			laptopPrice = laptopPrice + (MemorySize/500)*50;
		}else if (storageType.equals("SSD")) {
			laptopPrice = laptopPrice + (MemorySize/500)*100;
		}
		
		scan.nextLine();
		
		System.out.println("Enter screen resolution:");
		String ScreenResolution = scan.nextLine();
		
		if (ScreenResolution.equals("FULLHD")) {
			laptopPrice = laptopPrice + 100;
		}else if (ScreenResolution.equals("4K")) {
			laptopPrice = laptopPrice + 200;
		}
		
		System.out.println("Laptop price is: $" + laptopPrice);
}
}