package classes.day13;

public class Task64 {
	public static void main(String[] args) {
		
		printPattern(5);
		
	}
public static void printPattern (int number) {
	int rows=number;
	for(int i=0; i<=rows; i++ ) {
		for(int j=1; j<=i; j++) {
					
				System.out.print("*");
		}
	System.out.println();
	}
	
}
}
