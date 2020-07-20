package classes.day14;

public class Task66 {
	
	public static void main(String[] args) {
		
		double d= distance(40,5);
		System.out.println(d);
		if (d>500) {
			System.out.println("You spent too much gas");
		}else {
			System.out.println("You spent ok gas");
		}
	}

	public static double distance (double speed, int time) {
		double distanceTraveled=speed*time;
		return distanceTraveled;
		
	}
}
