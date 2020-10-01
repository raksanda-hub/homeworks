package work.home1;

public class Ifelsestatement2 {

	public static void main(String[] args) {
		double glucostestscore=15.5;
		
		if(glucostestscore>=20){
			System.out.println("Sugar level in red zone");
		}
		else if(glucostestscore<=16) {
		
			System.out.println("sugar level is in yellow zone");
		}
		 else {
			System.out.println("sugar level is in safe zone");
		}


	}

}
