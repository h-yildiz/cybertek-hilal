package classes.day14;

public class labQuestion6 {
	
	public static void main(String[] args) {
		
		cigarParty(30, false);
		cigarParty(50, false) ;
		cigarParty(70, true);
	}
	public static void cigarParty(int numberOfCigars, boolean weekend) {
		if(weekend) {
			if(numberOfCigars>=40) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
				if(numberOfCigars>=40 && numberOfCigars<=60) {
					System.out.println(true);
				}else {
					System.out.println(false);
				}
			}
		}
	}
