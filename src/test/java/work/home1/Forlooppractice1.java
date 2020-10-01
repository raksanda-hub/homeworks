package work.home1;

import java.util.ArrayList;

public class Forlooppractice1 {

	public static void main(String[] args) {
		// For loop "print odd number up to 25"
		
		for(int i=1;i<=25;i=i+2) {
			System.out.println(i);
		}
		//ArrayList
		ArrayList<String>coffees = new ArrayList () ;
		coffees.add("cold coffees");
		coffees.add("hot choclate");
		coffees.add("latte");
		coffees.add("frachinno");
		coffees.add("cappachino");
		coffees.add("Caramel & Vanila");{
			System.out.println(coffees);
			System.out.println(coffees.get(2));
			System.out.println(coffees.size());
			System.out.println(coffees.remove(3));
		}
		for(int c=0;c<coffees.size();c++) {
			System.out.println(coffees.get(c));
			
		}
		
		

	}

}
