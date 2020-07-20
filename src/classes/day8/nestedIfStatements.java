package classes.day8;

public class nestedIfStatements {
public static void main(String[] args) {
	boolean isRushHour=true;
	int carType=1;
	double price=0.0;
	
	if (carType==1) {
		if(isRushHour) {
			price=30;
		}else {
			price=5.0;
		}
	}else if (carType==2) {
		if(isRushHour) {
			price=55.30;
		}else {
			price=15.99;
		}
	}
	System.out.println("Toll Cost: " + price);
}
}

