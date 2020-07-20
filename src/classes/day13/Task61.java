package classes.day13;

public class Task61 {
	
	public static void main(String[] args) {
		
		ageCalculator(2020,1985);
		
	}
public static void ageCalculator(int currentYear,int birthyear) {
	
	int age=currentYear - birthyear;
	
	System.out.println(age);
}
}
