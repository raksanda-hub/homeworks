package work.home2;

public class Nestedforloops {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			System.out.println("Its is cold outside!");
		}
		String[] colors= {"Red", "Blue", "Green"};
		for(int i=0;i<3;i++) {
			System.out.println(colors[i]);
		}
		String[][] fancycolors= { {"Red", "Blue", "Green"},
		                          {"Cyan","Megenta","Turqiouse"}
		};
		for (int row=0;row<2;row++) {
			for (int coloum=0; coloum<3; coloum++) {
				System.out.println(fancycolors[row] [coloum]);
			}
			
		}

	}

}
