package work.home2;

import java.util.HashMap;

public class HASHMAP2 {

	public static void main(String[] args) {
		
		HashMap<Integer,String>ClientsIDAndName=new HashMap<Integer,String>() ;
		try {
		ClientsIDAndName.put(1,"Renesa");
		ClientsIDAndName.put(2," Kuku");
		ClientsIDAndName.put(3, "Solida");
System.out.println(ClientsIDAndName);

System.out.println(ClientsIDAndName.keySet());
System.out.println(ClientsIDAndName.values());

for(Integer k:ClientsIDAndName.keySet()) {
	System.out.println(k);
}
for(String j:ClientsIDAndName.values()){
	System.out.println(j);
}
		}
		catch (Exception e) {
			System.out.println("something wrong ");
		}
}
}