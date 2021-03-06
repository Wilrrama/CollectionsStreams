package set;

import java.util.Iterator;
import java.util.TreeSet;

public class exemploTreeSet {

	public static void main(String[] args) {
		
		TreeSet <String> treeCapitais = new TreeSet<>();
		
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florianopolis");
		treeCapitais.add("Curitiba");
		treeCapitais.add("S?o Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Belo Horizonte");
		
		System.out.println("Impress?o da TreeSet:");
		System.out.println(treeCapitais);
		
		System.out.println();
		System.out.println("Primeiro Elemento da Arvore:");
		System.out.println(treeCapitais.first());
		
		System.out.println();
		System.out.println("Ultimo Elemento da Arvore:");
		System.out.println(treeCapitais.last());
		
		System.out.println();
		System.out.println("Antes de Floripa:");
		System.out.println(treeCapitais.lower("Florianopolis"));
	
		System.out.println();
		System.out.println("Depois de Floripa:");
		System.out.println(treeCapitais.higher("Florianopolis"));
		
		System.out.println();
		System.out.println("Vizualizar e revomer o primeiro Elemento da Arvore:");
		System.out.println(treeCapitais.pollFirst());
		
		System.out.println();
		System.out.println("Vizualizar e revomer o ultimo Elemento da Arvore:");
		System.out.println(treeCapitais.pollLast());
		
		System.out.println();
		System.out.println("Impress?o da TreeSet com os removidos:");
		System.out.println(treeCapitais);
		
		System.out.println();
		System.out.println("Percorrer Arvore:");
		Iterator <String> cidade = treeCapitais.iterator();
		
		while(cidade.hasNext()) {
			System.out.println(cidade.next());
		}
		
	}

}
