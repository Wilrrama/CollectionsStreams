package map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class exemploTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap <String, String> treeCapitais = new TreeMap<>();
		
		treeCapitais.put("RS", "Porto Alegre");
		treeCapitais.put("SC", "Floripa");
		treeCapitais.put("PR", "Curitiba");
		treeCapitais.put("SP", "Sao Paulo");
		treeCapitais.put("RJ", "Rio de Janeiro");
		treeCapitais.put("MG", "Belo Horizonte");
		
		System.out.print("Impress?o do Mapa (Chave+Valor):");
		System.out.println(treeCapitais);
		
		System.out.print("Impress?o 1 chave:");
		System.out.println(treeCapitais.firstKey());
		
		System.out.print("Impress?o ultima chave:");
		System.out.println(treeCapitais.lastKey());
		
		System.out.print("Impress?o da chave abaixo de SC passada como Parametro:");
		System.out.println(treeCapitais.lowerKey("SC"));
		
		System.out.print("Impress?o da chave acima de SC passada como Parametro:");
		System.out.println(treeCapitais.higherKey("SC"));
		
		System.out.println();
		
		System.out.println(treeCapitais.firstEntry());
		
		System.out.println();
		
		System.out.print("Impress?o da chave e valor primeiro entrada:");
		System.out.println(treeCapitais.firstEntry().getKey()+"--"+ treeCapitais.firstEntry().getValue());
		
		System.out.print("Impress?o da chave e valor ultima entrada:");
		System.out.println(treeCapitais.lastEntry().getKey()+"--"+ treeCapitais.lastEntry().getValue());
		
		System.out.print("Impress?o da chave e valor acima de SC passada como Parametro:");
		System.out.println(treeCapitais.lowerEntry("SC").getKey()+"--"+ treeCapitais.lowerEntry("SC").getValue());
		
		System.out.print("Impress?o da chave e valor abaixo de SC passada como Parametro:");
		System.out.println(treeCapitais.higherEntry("SC").getKey()+"--"+ treeCapitais.higherEntry("SC").getValue());
		
		Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
		
		Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();
		
		System.out.println();
		
		System.out.print("Retorna e exclui primeira entrada (pollFirstEntry):");
		System.out.println(firstEntry.getKey()+"---"+firstEntry.getValue());
		
		
		System.out.print("Retorna e exclui ultima entrada (pollLastEntry):");
		System.out.println(lastEntry.getKey()+"---"+lastEntry.getValue());
		
		System.out.print("Impress?o do Mapa (mostrando as exclus?es):");
		
		System.out.println(treeCapitais);
		
		System.out.println();
		
		System.out.println("Percorrer o Mapa usando Iterator:");		
		Iterator <String> iterator = treeCapitais.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + "="+treeCapitais.get(key));
		}
		
		System.out.println();
		
		System.out.println("Percorrer o Mapa usando for:");
		for (String capital: treeCapitais.keySet()) {
			System.out.println(capital + "==" + treeCapitais.get(capital));
		}
		
		System.out.println();
		
		System.out.println("Percorrer o Mapa usando for + Map.Entry:");
		for (Map.Entry<String, String> capital: treeCapitais.entrySet()) {
			System.out.println(capital.getKey()+"==="+capital.getValue());
		}
		
		
	}

}
