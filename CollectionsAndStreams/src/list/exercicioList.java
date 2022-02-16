package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exercicioList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> nomes = new ArrayList<>();
		
		nomes.add ("Juliana");
		nomes.add ("Pedro");
		nomes.add ("Carlos");
		nomes.add ("Larissa");
		nomes.add ("João");
		
		System.out.println(nomes);
		
		nomes.set(2, "Roberto");
		
		System.out.println(nomes);
		
		System.out.println(nomes.get(1));
		
		nomes.remove(3);
		
		nomes.remove("João");
		
		int quantidade = nomes.size();
		
		System.out.println(quantidade);
		
		System.out.println(nomes.contains("Juliano"));
		
		List<String> nomes2 = new ArrayList<>();
		
		nomes2.add("Ismael");
		nomes2.add("Rodrigo");
		
		nomes2.addAll(nomes);
		
		Collections.sort(nomes2);
		
		System.out.println(nomes2);
		
		System.out.println(nomes2.isEmpty());
		
	}

}
