package work.home1;

public class Methodpractice1 {
	// method(Code should be inside of method, we barely use main method we create our won method)
	
	//Attributes
	int a=10;
	String b= "Dallas";
	
void	method1 () {
	//body(what ever code i have i need to write here
	int d=15;
	System.out.println(d);
	
} 

void method2 () {
	
}


//we can't create any , method under the  main method,every method should be independent.
// we need main method to execute our code, all the sysout is under the main method.

	public static void main(String[] args) {
		
		Methodpractice1 obj=new Methodpractice1 ();
		System.out.println(obj.a);
		
		//i get this code by creating object of the class and using the object in same class.
		//not just typing. but when i use this object in other classes i don't need any main method.
		
		

	}

}
