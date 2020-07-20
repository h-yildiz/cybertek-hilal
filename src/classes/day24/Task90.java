package classes.day24;

public class Task90 {
	public static void main(String[] args) {

		String[] cars = { "BMW", "Ferrari", "Nissan", "Mercedes", "Opel", "Honda" };

		boolean flag = false;

		for (int i = 0; i < cars.length; i++) {

			if (cars[i].equals("Honda")) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Found it");
		} else {
			System.out.println("Not found it");
		}
	}

}
