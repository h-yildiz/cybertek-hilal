package classes.day14;

public class labQuestion4 {
	
	public static void main(String[] args) {
		
		deerPlay(95, true);
		
	}

	public static void deerPlay(int degree, boolean summer) {
		
		if(summer)  {
			if(60<=degree && degree<=100) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}else  {
			if(60<=degree && degree<=90) {
					System.out.println("true");
			}else {
						System.out.println("false");
					}
		}
				
		}
	}

		