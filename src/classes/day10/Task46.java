package classes.day10;

public class Task46 {
	public static void main(String[] args) {
		
		int num=7;
		
		System.out.println("Multiplication table for " + num);
		System.out.println("--------------------------");
		
		for(int i=1; i<=10; i++) {
			System.out.println(num + "*" + i + "=" + (num*i));
		}
	}

}
