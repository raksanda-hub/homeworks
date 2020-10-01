package work.home1;

import java.util.ArrayList;

public class ArrayLIST101 {

	public static void main(String[] args) {
		ArrayList<String>teas=new ArrayList<String> ();
		
		teas.add("Green Tea");
		teas.add("Herbal Tea");
		teas.add("Sliming Tea");
		teas.add("Lemon Tea");
		teas.add("Ginjer Tea");{
			System.out.println(teas.size());
			System.out.println(teas.get(3));
			System.out.println(teas.remove(2));
			System.out.println(teas.set(1, "Milk Tea"));
			System.out.println(teas.get(1));
		}
		
		//for loop through ArrayList
		
		for(int t=0;t<teas.size();t++) {
			System.out.println(teas.get(t));
		}
		// print the value of index of 
		for(int t=1;t<teas.size();t=t+2) {
			System.out.println(teas.get(t));
		}
		// print the value of  2
		for(int t=4;t<teas.size();t=t+2) {
			System.out.println(teas.get(t));
		
				

	}

	}
}
