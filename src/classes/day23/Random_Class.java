package classes.day23;

import java.util.Random;

public class Random_Class {
	public static void main(String[] args) {
		
		Random rn = new Random();
		System.out.println(rn.nextInt());
		System.out.println(rn.nextDouble());
		System.out.println(rn.nextFloat());
		System.out.println(rn.nextBoolean());
		//int random = rn.nextInt(10)+1; // range of 1 through 10. 1 baslangic, 10 birim ileri gidecek
		//int random2= rn.nextInt (100)-50; // range of -50 through 49. -50 baslangic, 100 birim ileri gidecek yani 49a kadar
		
		System.out.println(rn.nextInt(50)); //0-49
		System.out.println(rn.nextInt(10)+5); //5-14);
	}      

}
