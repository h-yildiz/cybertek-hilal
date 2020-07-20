package classes.day23;

public class Lab_Question15 {
	public static void main(String[] args) {
		
		System.out.println(hasBad("ba"));
		System.out.println(hasBad("xbadxx"));
		System.out.println(hasBad("xxbadxx"));
	}
	public static boolean hasBad(String str) {
		if(str.length()<3){
			  return false;
		if(str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")) {
			return true;
		}else {
			return false;
		}
		
	}
}
