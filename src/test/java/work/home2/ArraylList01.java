package work.home2;

import java.util.ArrayList;

public class ArraylList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>Beverages=new ArrayList ();
		Beverages.add("Coke");
		Beverages.add("Sprite");
		Beverages.add("genjarel");
		Beverages.add("Zero Coke");
		Beverages.add("Ice Tea");
		Beverages.add("Cold Coffee");
		System.out.println(Beverages);
		System.out.println(Beverages.get(1));
		System.out.println(Beverages.set(1,"Zero Coke"));
		System.out.println(Beverages.size());
		
		//for loop
		for (int b=0;b<Beverages.size();b++) {
			System.out.println(Beverages.get(b));
			
		}
		
		
		
		
		
		
		
		

	}

}
