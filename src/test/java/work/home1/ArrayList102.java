package work.home1;

import java.util.ArrayList;

public class ArrayList102 {

	public static void main(String[] args) {
		ArrayList<String>Vegetables=new ArrayList<String>();
		
		Vegetables.add("Brinjal");
		Vegetables.add("Okra");
		Vegetables.add("Coli Flower");
		Vegetables.add("Chilli");
		Vegetables.add("Tomato");
		Vegetables.add("Carrot");
		System.out.println(Vegetables);
		System.out.println(Vegetables.size());
		System.out.println(Vegetables.get(2));
		System.out.println(Vegetables.remove(4));
		System.out.println(Vegetables.set(3, "Spinach"));
		
		//Loop
		for(int v=0;v<Vegetables.size();v++) {
			System.out.println(Vegetables.get(v));
		}
		
		
	}

}

