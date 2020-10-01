package work.home1;

import java.util.HashMap;

public class HashMap01 {

	public static void main(String[] args) {
		//HashMap
		HashMap<Integer,String>PatientsIDAndName=new HashMap<Integer,String>() ;
		try {
			
			
		PatientsIDAndName.put(1,"Sam");
		PatientsIDAndName.put(3, "Paul");
		PatientsIDAndName.put(5, "Jhon");
		System.out.println(PatientsIDAndName);
		
		
			
		System.out.println(PatientsIDAndName.get(3));
		System.out.println(PatientsIDAndName.keySet());
		System.out.println(PatientsIDAndName.values());
		System.out.println(PatientsIDAndName.remove(5));
		
		Userloginfacebook fb=new Userloginfacebook ();
		fb.logout();
		for(Integer k:PatientsIDAndName.keySet()) {
			System.out.println(k);
		}
		for(String j :PatientsIDAndName.values()) {
			System.out.println(j);}
		
		}
		catch (Exception e) {
			System.out.println("something is wrong");
		}

		
		
		

	}

}
