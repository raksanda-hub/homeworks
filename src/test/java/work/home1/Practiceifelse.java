package work.home1;

public class Practiceifelse {

	public static void main(String[] args) {
		// tests result
		
		int testscore=75;
		char grade;
		if(testscore>=90) {
			grade='A';
			
		}
		else if(testscore>=80) {
			grade='B';
		}
		else if(testscore>=70) {
			grade='C';
			
		}
		else if(testscore>=60) {
			grade='D';
		}
		else {
			grade='F';
		}
		
		System.out.println("Grade=" +grade);
		
		//if else statement
		int user=44;
		if(user<=18) {
			System.out.println("user is 18 or younger");
		}
		else if(user>18 && user<40) {
			System.out.println("user is between 19 and 39");
		}
		else {
			System.out.println("user is older than 40");
		}
		
		
		

	}

}
