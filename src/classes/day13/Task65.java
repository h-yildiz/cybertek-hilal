package classes.day13;

public class Task65 {
	public static void main(String[] args) {
		calculateGrade();
	}
public static void calculateGrade() {
	int grade1=100;
	int grade2=100;
	int grade3=100;
	
	double average=(grade1+grade2+grade3)/3;
	if(average>0 && average<59) {
		System.out.println("F");
	}else if(average>60 && average<69) {
		System.out.println("D");
	}else if(average>70 && average<79) {
		System.out.println("C");
	}else if(average>80 && average<89) {
		System.out.println("B");
	}else if(average>90 && average<=100) {
		System.out.println("A");
	}
}
}
