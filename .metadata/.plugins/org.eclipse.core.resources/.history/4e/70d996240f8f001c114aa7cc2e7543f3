package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class exemploList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> nomes = new ArrayList<>();
		nomes.add("Carlos");
		nomes.add("Pedro");
		nomes.add("Juliana");
		nomes.add("Fernando");
		nomes.add("Maria");
		nomes.add("Joao");
		
		System.out.println(nomes);
		
		Collections.sort(nomes);
				
		System.out.println(nomes);
		
		nomes.set(2, "Larissa");

		System.out.println(nomes);
		
		nomes.remove(2);
		
		nomes.remove("Pedro");
		
		System.out.println(nomes);
		
		String nome = nomes.get(2);
		
		System.out.println(nome);
		
		int posicao = nomes.indexOf("Carlos");
		
		System.out.println(posicao);
		
		int tamanho = nomes.size();
		
		System.out.println(tamanho);
		
		nomes.remove(3);
		
		tamanho = nomes.size();
		
		System.out.println(tamanho);
		
		boolean temAnderson = nomes.contains("Anderson");
		
		System.out.println(temAnderson);
		
		boolean temFernando = nomes.contains("Fernando");
		
		System.out.println(temFernando);
		
		boolean listaEstaVazia = nomes.isEmpty();
		
		System.out.println(listaEstaVazia);
		
		for (String nomeDoItem : nomes) {
			
			System.out.println(nomeDoItem);
		}
		
		Iterator <String> iterator = nomes.iterator();
		
		while (iterator.hasNext()) {
			
			System.out.println("--" + iterator.next());
			
		}
		
		
		nomes.clear();
		
		listaEstaVazia = nomes.isEmpty();
		
		System.out.println(listaEstaVazia);
		
				
		
	}

}
