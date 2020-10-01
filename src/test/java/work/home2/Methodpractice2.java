package work.home2;

public class Methodpractice2 {// public class can be accessible from any other packages or classes.
	// but if it is default then it only can accessible from the package it belongs, if we keep our class 
	//default then only the teams within the package can access our class other team who is in different
	//package can't access(execute or use our code not just see) our code.
	//attributes
	int a=45;
	String c="Dhaka";
final Double d=2.4;// nobody can't Access/use this code i make it final its not reusable.
	//method1
	public void method1 () {
		int e =23;
		String f="Dallas";
	}

void method2 ()  { // its a default method or default attribute if you can mention.
	double k=3.5;
	String city="Dubai";
	System.out.println(k);
	System.out.println(city);
}
private void methody () {
	int g=9;
	
}
// only can access from same class not even from the same package different classes because its private.
	public static void main(String[] args) {
		Methodpractice2 objj=new Methodpractice2 ();
System.out.println(objj.a);

//if you want to change your value.
objj.c="Austin";
System.out.println(objj.c);
objj.method2(); // you can only access the method not the inside on the message.




	}

}
