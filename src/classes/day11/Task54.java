package classes.day11;

public class Task54 {
	
	public static void main(String[] args) {
		
		int start=1;
		int sum=0;
		
		do {
			if(start%2==0) {
				continue;
				}
			sum+=start;
		}while (++start<=10);
		System.out.println(sum);
	}

}
