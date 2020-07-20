package classes.day3;

public class primitiveVariables {

	public static void main(String[] args){
	
		byte b1 = 25;
		byte b2 = -25;
		//byte b3 = 128;
		
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		
		short s1 = -32768;
		short s2 = 32767;
		short s3 = 500;
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		
		int i1 = -214768;
		int i2 = 20;
		int i3 = 100_000;
		int i4 = 100000;
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		System.out.println("i4 = " + i4);
		
		long l1 = 5000; //Suffix L is optional. Literal 5000 is of int type
		long l2 = -2147483649L; //Suffix L is mandatory,this number is out of int range
		
		System.out.println("l1 = " + l1);
		System.out.println("l2 = " + l2);
		
		long creditCardNumber = 5876_1234_3453_9832l;
		
		System.out.println("Credit Card Number = " + creditCardNumber);
		
		//floating numbers : default is double
		
		float f1 = 2.1f;
		double d1 = 3.1416523879028789132676;
		
		System.out.println("f1 = " + f1);
		System.out.println("d1 = " + d1);
		
		char c1 = 'A';
		char c2 = 65; //decimal value corresponding to charachter A
		
		System.out.println(c2);
		
		char c3 = '\u0041';
		
		System.out.println(c3);

		char c4 = 8658;
		
		System.out.println(c4);
		
		boolean status = true;
		boolean status2 = false;
		
		System.out.println("Eligible to take the exam: " + status);
		System.out.println("He is 16, can he take the driver licence: " + status2);
		
		
		String name = "Hilal";
		System.out.println("My name is " + name);
		
		String age = "12";
		
		final String birthday = "12/12/2012";
		
		System.out.println(birthday);
		
	}
}