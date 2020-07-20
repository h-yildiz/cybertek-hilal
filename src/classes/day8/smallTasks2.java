package classes.day8;

public class smallTasks2 {
public static void main(String[] args) {
	
	//int x= 200;
	//int y=10;
	
	//if(x>100) {
		//y=20;
	//}
   //else {
	//   y=0;
   //} 
	//System.out.println("y= " + y);
	
	int y=100;
	int x=15;
	
	if (y==100) {
		x=1;
	}else {
	x=0;
	}System.out.println("x = " + x);

	int a=20;
	int b=0;
	int c=0;
	
	if(a<10) {
		b=0;
		c=1;
	}else {
		b=-99;
		c=0;
	} System.out.println("b = " + b  + "  " + "c= " + c);
	
	int number1= 8;
	int number2= 3;
	
	if (number1>number2) {
		System.out.println(number1 + " number is greater than " + number2 +  " number");
	
	}else {
		System.out.println(number2 + " number is greater than " + number1 +  " number");
		
	}
	
	int num= 5;
	
	if (num%2==0 ) {
		System.out.println(num + " is an even number");
	}else {
		System.out.println(num + " is an odd number");
	}
	
	int angle1=80;
	int angle2=70;
	int angle3=30;
	
	if (angle1 + angle2 + angle3==180) {
		System.out.println("Triangle is valid.");
	}else {
		System.out.println("Triangle is not valid.");
	}
	
	
	}
	
}
