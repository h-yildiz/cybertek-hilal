package classes.day23;

public class Lab_Question14 {
	public static void main(String[] args) {
		
		System.out.println(endsLy("oddly"));
		System.out.println(endsLy("y"));
		System.out.println(endsLy("oddy"));
	}
	public static boolean endsLy (String str) {
		if(str.length()<2) {
			return false;
		}else {
		return str.endsWith("ly");
	}
	
}
}

/* if(str.length()<2){
 * System.out.println(false);
 * return;
 * }
 * if (str.substring(str.length()-2).equals("ly"))
 * System.out.println(true);
 * }else{
 * System.out.println(false);
 * }
 *  */