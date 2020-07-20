package classes.day5;

public class mixedInteger {
public static void main(String[] args) {
	
	int i1=5;
	int i2=10;
	float f1=15.5f;
	double d1=20.5;
	
	int res1= i1+i2;
	//float res2=i1+f1;
	double res3=i2+d1;
	
	short firstNumber=10;
	short secondNumber=20;
	short thirdNumber;
	
	thirdNumber= (short) (firstNumber + secondNumber);
	System.out.println(thirdNumber);
	
	//byte b1=20;
	//byte b2=2;
	//byte b3 = (byte) (b1*b2);
	
	int b1=126;
	int b2=1;
	
	byte res =(byte) (b1+b2); //Casting is required
	byte res2 = 126+1;
	
	int a= 25;
	System.out.println(++a);
	System.out.println(--a);
	
	int b=25;
	System.out.println(b++);
	System.out.println(b--);
			
			
	System.out.println();
	
	
	
}
}
