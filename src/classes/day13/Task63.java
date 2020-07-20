package classes.day13;

public class Task63 {
	public static void main(String[] args) {
		
		calculateCelcius(32);
		calculateCelcius(50);
	}
public static void calculateCelcius(double fahrenheit) {
 	double celcius=(fahrenheit-32)*5/9;
	
	System.out.println(celcius);
	
}
}
