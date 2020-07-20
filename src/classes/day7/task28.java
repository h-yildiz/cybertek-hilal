package classes.day7;

public class task28 {
public static void main(String[] args) {
	
	
	double productPrice= 500;
	int quantity= 20;
	
	double revenue;
	double discount=0;
	
	revenue=productPrice * quantity;
			
if (revenue>5000) {
		discount=revenue*0.1;
		revenue=revenue-discount;
		
	}
System.out.println("discount = " + discount);
System.out.println("revenue = " + revenue);

}
}
