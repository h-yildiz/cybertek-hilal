package classes.day6;

public class taskOperatorPrecedence {
public static void main(String[] args) {
	
	int ApplesCount=20;
	int OrangesCount=30;
	int PearsCount =30;
	
	boolean comp = ApplesCount < OrangesCount || OrangesCount >= PearsCount;
	System.out.println(comp);
	
	String OutsideWeather;
	int Degree;
	OutsideWeather ="Shinny";
	Degree = 70 ;
	boolean comp2= (!(OutsideWeather=="Rainy"||Degree==70));
	
	System.out.println(comp2);

	int b= 2;
	boolean res = ++b == 2 || --b == 2 && --b ==2;
	
	//memory: 2->3->2->1 
	//res   :3 = 2 || 2 = 2 && 1 = 2
	
	System.out.println(res);
	
	boolean x= true, z=true;
	int y= 20;
	x =(y!=10)||(z=false);
	
	System.out.println(x);
	
	
	

	
	
	
	
}
}
