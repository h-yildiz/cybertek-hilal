package classes.day20;

public class Task81 {
	public static void main(String[] args) {
		timeStamp ("10/10/2019 14:59:00");

	}
	public static void timeStamp (String date) {
		
		String timeStamp = date.replace("/", "").replace(" ", "").replace(":", "");
		System.out.println(timeStamp);
		
	}
}
