package classes.assignment5;

public class Question13 {
	
	public static void main(String[] args) {
		
		int row=8;
		int column=8;
		char white='W';
		char black='B';
		char temp=black;
		char color=white;
		char temp2=black;
		
		
		
		for(int i=1 ; i<=row; i++) {
			
			for(int a=1; a<=column; a++) {
				
				System.out.print(color + " ");
				
				temp=color;
				color=black;
				black=temp;
			
			}
			temp2=color;
			color=black;
			black=temp2;
			
			System.out.println();
				
		}

	}

}
