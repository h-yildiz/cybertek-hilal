package classes.day8;

public class task35FindGreatestNumberNested {
public static void main(String[] args) {
	int n1=1000;
	int n2=7000;
	int n3=5000;
	
	if(n1>n2 && n1>n3) {
		System.out.println("n1 is the greatest number");
		} else {
			if (n2>n3) {
			System.out.println("n2 is the greatest number");
		} else {
		System.out.println("n3 is the greatest number");
		}
	}
	}

}
