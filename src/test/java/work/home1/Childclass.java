package work.home1;

public class Childclass extends Parentsclass{

	public static void main(String[] args) {
		Childclass inherit=new Childclass ();
        System.out.println(inherit.b) ;
		System.out.println(inherit.city);
		System.out.println(inherit.a);
		inherit.mul(5, 5);
		inherit.sum(6, 5);
		inherit.method();
		System.out.println(inherit.city);
		
		
	}

}
