package classes.reviewWeek4;

public class NestedForLoop {
	
	public static void main(String[] args) {
		
//		for(int outer=1; outer<=5; outer++) {
//			
//			System.out.println("Outer: " + outer);
//			
//			for(int inner=0; inner<=9; inner++) {
//
//				System.out.print(inner + " ");
//			}
//			System.out.println();
//		}
		
		// outer for rows, inner for columns!!
		
		for(int i=0; i<=9; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=8; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
