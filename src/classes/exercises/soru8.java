package classes.exercises;

public class soru8 {
	
	 public static void main(String[] args) {
		
//		 int k=0;
//		 int m=0;
//		 for(int i=0; i<=3; i++) {
//			 k++;
//			 if (i==2) {
//				 i=4;
//			 }
//			 m++;
//		 }
//			 System.out.println(k + "," + m);
			 
			 
			 int sum=0;
					 for(int i=0; i<10;  i++) {
						 if(i%3==0) {
						 sum=sum+i;
						 }
					 
					 }	 System.out.println("Sum= " + sum);
					 
					 do {
						 System.out.println("100");
						  }while(false) ;
					 System.out.println("Bye");
					 
					 int start=1;
					 int suma=0;
					 do {
						if(start%2==0) {
							start++;
							
						} sum+=start;
					 }while(++start<=10);
						 System.out.println(sum);
						 
//					int x=3;
//					int i=0;
//					while(i<3) {
//						x+=1;
//						i+=1;
//						
//					}System.out.println(x);
					
//					int x=20;
//					while(x>0) {
//						do {
//							x-=2;
//						}while(x>5);
//						}
//					x--;
//					System.out.println(x);
					
		 
//	 				int x=0;
//	 				while(x++<10) {}
//	 					if(x>10) {
//	 						System.out.println("Greater than " + "," + x);
//	 					}else {
//	 						System.out.println("Not Greater than " + "," + x);
//	 					}
						 
						 int x=1,y=15;
						 while (x<10) {
							 y--;
							 x++;
						 }
							 System.out.println(x + "," + y);
							 
							 int i1=1,i2=2,i3=4;i2=i3%3;
							 int i4=i1+(i2*i3)+i3;
							 System.out.println(i4);
							 
							 int c=0;
							 boolean flag=true;
							 for(int i=0;i<8; i++) {
								 while(flag) {
									 c++;
									 if(i>c || c>3) {
										 flag=false;
									 }
								 }
							 }
							 System.out.println(c);
							 
//							 label1:for(int i=0; i<10; i++) {
//								 for(int j=0; j<10; j++) {
//									 if(i+j-1>10) {
//										 break label1;
//										 
//									 }
//								 }
//								 System.out.println("Hello");
								 

								public static boolean PrimeNumber(int prime) {
									if (prime == 1)
										return false;

									if (prime == 2)
										return true;

									if (prime % 2 == 0)
										return false;

									for (int i = 2; i < prime; i++) {

										if (prime % i == 0)
											return false;

									}

									return true;

								}
							 
							 
							 }
						 }
	 				