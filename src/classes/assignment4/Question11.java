package classes.assignment4;

public class Question11 {
	public static void main(String[] args) {
		
		int i,c;
		double d,f;
		i=4;
		f=4.3;
		d=1.8;
		c=0;
		
		if(i!=c) {
			c++;
			if((f+d)==(c+=2)) {
				System.out.println(c);
			}
		}
		System.out.println(c);
		
		boolean flag=true;
		
		if(flag) {
			if(flag) {
			System.out.println("True false");
			}else {
				System.out.println("True true");
			}
		}else {
				System.out.println("False false");
			}
		}
	}


