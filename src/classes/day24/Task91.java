package classes.day24;

import java.util.Random;

public class Task91 {
	public static void main(String[] args) {
		
		int [] elements = new int [10];
		Random rn = new Random();


		for (int i = 0; i<elements.length; i++) {
			System.out.println(elements[i] = rn.nextInt(100));
		}
		
	//	for(int el : elements) {
	//	System.out.println(el);
	//	}

	}

}
