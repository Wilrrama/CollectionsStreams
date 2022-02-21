package map;

import java.util.HashMap;
import java.util.Map;

public class exercicioMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <String, String> capitais = new HashMap<>();
		capitais.put("AC","Acre");
		capitais.put("AL","Alagoas");
		capitais.put("AP","Amap�");
		capitais.put("AM","Amazonas");
		capitais.put("BA","Bahia");
		capitais.put("CE","Cear�");
		capitais.put("ES","Esp�rito Santo");
		capitais.put("GO","Goias");
		capitais.put("MA","Maranhao");
		capitais.put("MT","Mato Grosso");
		capitais.put("MS","Mato Grosso Sul");
		capitais.put("MG","Minas Gerais");
		capitais.put("PA","Par�");
		capitais.put("PB","Para�ba");
		capitais.put("PR","Paran�");
		capitais.put("PE","Pernambuco");
		capitais.put("PI","Piau�");
		capitais.put("RJ","Rio de Janeiro");
		capitais.put("RN","Rio Grande Norte");
		capitais.put("RS","Rio Grande Sul");
		capitais.put("RO","Rondonia");
		capitais.put("RR","Roraima");
		capitais.put("SC","Santa Catarina");
		capitais.put("SP","S�o Paulo");
		capitais.put("SE","Sergipe");
		capitais.put("TO","Tocantins");
		
		System.out.println(capitais);
		
		capitais.remove("MG");
		
		capitais.put("DF","Distrito Federal");
		
		System.out.print("Tamanho do mapa: "+capitais.size());
		
		capitais.remove("MS", "Mato Grosso Sul");
		
		System.out.println();
		
		for (String nome: capitais.keySet()) {
			System.out.println(capitais.get(nome)+"--("+nome+")");			
		}
			
		System.out.println(capitais.containsKey("SC"));
		
		System.out.println(capitais.containsValue("Maranhao"));
		
 }

}
