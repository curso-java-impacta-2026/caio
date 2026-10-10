package laboratorios.cap15Lab01;

import java.util.HashMap;


public class Cap15_Lab1 {
	
	public static void main(String [] args ) {
		
		 HashMap<String, Integer> pessoaMap = new HashMap<>();
		 
		 pessoaMap.put("Ana", 19);
	     pessoaMap.put("Janaclei", 1000);
	     pessoaMap.put("Prea", 600);
	     pessoaMap.put("Jorisvaldo" , 120);
	     
	     System.out.println("-- Pessoas --");
	     
//	     System.out.println("Ana" + ":" + pessoaMap.get("Ana"));
//	     System.out.println("Janaclei"  + ":" + pessoaMap.get("Janaclei"));
//	     System.out.println("Prea" + ":" + pessoaMap.get("Prea"));
//	     System.out.println("Jorisvaldo" + ":" + pessoaMap.get("Jorisvaldo"));
	     
	     pessoaMap.forEach((k,v) -> System.out.println(k + " - " + v ));
	     
	}
	

}
