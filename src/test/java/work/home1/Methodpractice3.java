package work.home1;

public class Methodpractice3 {
	//attributes
			int a=50;
			double b=33.5;
			final String city="Dubai";
			public void method1 () {
				 int g= 3;
				 int o=4;
				 System.out.println(g);
				 System.out.println(o);
			 }
			private void method2 () {
				int k=9;
			}

	public static void main(String[] args) {
		Methodpractice3 objk=new Methodpractice3 ();
		System.out.println(objk.a);
		System.out.println(objk.b);
		objk.method1();
		objk.a= 40;
		System.out.println(objk.a);
	}

}
