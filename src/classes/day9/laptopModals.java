
package classes.day9;

public class laptopModals {
	public static void main(String[] args) {
		
		String computer="Apple";
		
		switch(computer) {
		case "Apple":
			System.out.println("No virus");
			break;
		case "Dell":
			System.out.println("Though one");
			break;
		case "Acer":
			System.out.println("Not recommended");
			break;
		default:
			System.out.println("Do not buy this one");
			break;
	}

}
}
