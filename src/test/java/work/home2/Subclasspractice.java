package work.home2;

public class Subclasspractice extends Superclasspractice {
	public void  FBlogin(String Email, String PW){
		
	}//method over riding
	public static void main(String[] args) {
		Subclasspractice inheritt=new Subclasspractice () ;
		inheritt.sum(8, 8);
		System.out.println(inheritt.fruits);
		System.out.println(inheritt.b);
		
	}

}
