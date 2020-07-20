package classes.reviewWeek4;

public class PrintNumberDevisibleBy7 {
	
	public static void main(String[] args) {
		
		int start=3;
		int end=245;
		
		//print all the numbers between these range divisible by 7
		
		for (int i = start; i<=end; i++) {
			
			if(i%7==0) {
				
				System.out.println(i);
			}
		}
	}

}
