package work.home1;

import java.util.ArrayList;

public class ArrayList03 {

	public static void main(String[] args) {
	
		ArrayList<String>cheeses=new ArrayList<String>();
		try {
		cheeses.add("swiss");
		cheeses.add("American");
		cheeses.add("Salted");
		cheeses.add("Mozirilla");
		System.out.println(cheeses);
		System.out.println(cheeses.get(0));
		System.out.println(cheeses.remove(2));
		System.out.println(cheeses.size());
		System.out.println(cheeses.set(2,"Spice"));
		
		for(int i=0;i<cheeses.size();i++) {
			System.out.println(cheeses.get(i));
		}
		}
		catch (Exception e) {
			System.out.println("wrong");
		}

	}

}
