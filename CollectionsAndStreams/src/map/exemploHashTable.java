package map;

import java.util.Hashtable;
import java.util.Map;

public class exemploHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Integer> estudantes = new Hashtable<>();
		
		estudantes.put("Carlos", 21);
		estudantes.put("Mariana", 33);
		estudantes.put("Rafaela", 18);
		estudantes.put("Pedro", 44);
		
		System.out.println(estudantes);
		
		estudantes.put("Pedro", 55);
		
		System.out.println(estudantes);
		
		estudantes.remove("Pedro");
		
		System.out.println(estudantes);
		
		int idadeEstudante = estudantes.get("Mariana");
		
		System.out.println(idadeEstudante);
		
		System.out.println(estudantes.size());
		
		for(Map.Entry<String, Integer> entrada : estudantes.entrySet()) {
			System.out.println(entrada.getKey()+"="+entrada.getValue());
		}
		
		System.out.println();
		
		for(String key : estudantes.keySet()) {
			System.out.println(key + "=="+estudantes.get(key));
		}
		
	}

}