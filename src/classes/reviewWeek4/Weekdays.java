package classes.reviewWeek4;

public class Weekdays {
	
	public static void main(String[] args) {
		
		//Write a loop that will iterate from 1-7
		
		for (int i=1; i<=7; i++) {
			switch (i) {
			
			case 1: 
				System.out.println("Monday");
				break;
			case 2: 
				System.out.println("Tuesday");
				break;
			case 3: 
				System.out.println("Wednesday");
				break;
			case 4: 
				System.out.println("Thursday");
				break;
			case 5: 
				System.out.println("Friday");
				break;
			case 6: 
				System.out.println("Saturday");
				break;
			case 7: 
				System.out.println("Sunday");
				break;
			default:
				System.out.println("No such a day");
			}
		}
	}

}
