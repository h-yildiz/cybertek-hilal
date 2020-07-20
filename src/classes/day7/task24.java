package classes.day7;

public class task24 {
public static void main(String[] args) {
	
	int age= 20;
	
	if (age==18 || age>=18) {
		System.out.println("You are eligible to vote");
	}

	int num1=4;
	int num2=8;
	int num3=1;
	
	if (num1>num2 && num1>num3) {
		System.out.println("The greatest number is Num1");
	}
	if (num2>num1 && num2>num3) {
		System.out.println("The greatest number is Num2");
	}
	if (num3>num1 && num3>num2)
	System.out.println("The greatest number is Num3");
	
	
	int number1=8;
	int number2=3;
	
	if(number1==number2) {
		System.out.println("Numbers are equal");
	}
	
	if (number1!=number2) {
		System.out.println("Numbers are not equal");
	}
}
}
