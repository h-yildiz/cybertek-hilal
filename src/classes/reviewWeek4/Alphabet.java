package classes.reviewWeek4;

public class Alphabet {
	
	public static void main(String[] args) {
		
		char letter='a';
		
	//	letter++;
		
	//	System.out.println(letter);
		
		while(letter<='z') {
			
			System.out.print(letter +" ");
			
			letter++;
		}
		System.out.println();
		
		char letter2='o';
		
		while(letter2>='a') {
			
			System.out.print(letter2 + " ");
			
			letter2--;
			
			System.out.println();
			String letters = "";
			char l = 'A';
			letters += l;  //concat  letters = letters + l = > "" + A  = > A
			l = 'B';
			letters += l;  // letters = letters + l = > A + B = > AB
			System.out.println(letters);
			
			char myLetter = 'A';
			String alphabet = "";
			
			while(myLetter <='Z') {
				
				//attach/concat myLetter to alphabet
				alphabet += myLetter;
				
				//print 
				System.out.println(alphabet);  
				//A
				//AB
				//ABC
				
				
				myLetter++;  //C
			}
			}

	}

		}

