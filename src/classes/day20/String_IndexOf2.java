package classes.day20;

public class String_IndexOf2 {
	public static void main(String[] args) {

		
		String list = "html-selenium-angular-jenkins-grid";

		int firstDash = list.indexOf("-");
		System.out.println(firstDash);
		int secondDash = list.indexOf("-", 5);
		System.out.println(secondDash);

		int thirdDash = list.indexOf("-", secondDash + 1);
		System.out.println(thirdDash);
		int lastDash = list.lastIndexOf("-");
		System.out.println(lastDash);

		int x = list.lastIndexOf("-", 28);
		System.out.println(list.charAt(x));
	}

}
