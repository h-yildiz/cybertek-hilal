package classes.assignment5;

public class Question12 {
	
	public static void main(String[] args) {
		
		int row=10;
		int num=0;
		int num2=0;
		int num3=0;
		
		
		for(int i=1 ; i<=row; i++) {
			num=i;
			
			for(int a=1; a<=10; a++) {
				
				num3=num+num2;
				System.out.print(num3 + " ");
				num2=num3;
			
			}
			num3=0;
			num2=0;
			System.out.println();
				
		}

	}

}
