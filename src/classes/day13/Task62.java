package classes.day13;

public class Task62 {
	
	public static void main(String[] args) {
		
		calculateGreatest(43,22,17);
		
	}
public static void calculateGreatest(int num1,int num2,int num3) {
	
	if (num1>num2 && num1>num3) {
		System.out.println(num1);
		if(num2>num1 && num2>num3) {
			System.out.println(num2);
			if(num3>num2 && num3>num1) {
				System.out.println(num3);
			}
		}
	}
}
}
