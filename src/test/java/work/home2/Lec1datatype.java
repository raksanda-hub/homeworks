package work.home2;

public class Lec1datatype {

	public static void main(String[] args) {
		// data type and variable
		//string flower1="red rose";
		System.out.println("red rose is flower1");
		// addition
		int p1=4;
		double p2=3.4;
		double sum=p1+p2;
		System.out.println(p1);
		System.out.println(p2);// To see the result always print variable
		System.out.println("the total value is"+ sum);
		//subtraction
		double sub=p1-p2;
		System.out.println("the sub is"+sub);//declaring variable and value
		//multiplication
		double mul=p1*p2;
		System.out.println("the total product is"+mul);
		//Modulus
		double mud=p1%p2;
		System.out.println("the total reminder is"+mud);
		//division
		double div=p1/p2;
		System.out.println("the total breakup is"+div);
		//increment by 5
		int p3=100;
		p3+=5;
		System.out.println("increment by 5 is"+p3);
		//decrement by 2
		double p4=10.5;
		p4-=2;
		System.out.println("decrement by 2 is"+p4);
		//logical and"&&"
		double p5=30.5;
		System.out.println(p5<50&&p5>25);
		//logical or"||"
		double p6=75;
		System.out.println(p6<69||p6==69);
		/*exercise:
		 * 1.choose a number which is greater than 10 and smaller than 100
		 * choose a decimal number which is greater than10 or less than 100
		 * choose a number which is greater than or equal to 69
		 */
		//logical and "&&"
		int p7=20;
		System.out.println(p7>10&&p7<100);
		double p8=47.9;
		System.out.println(p8>10||p8<100);
		int p9=70;
		int p10=69;
		System.out.println(p9>69||p10==69);
		
		

		
	
		
		
		
		
		
	

	}

}
