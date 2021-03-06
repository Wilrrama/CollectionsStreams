package map;

import java.util.HashMap;
import java.util.Map;

public class exemploHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <String, Integer> campeoes = new HashMap<>();
		campeoes.put("Brasil", 5);
		campeoes.put("Alemanha", 4);
		campeoes.put("Italia", 3);
		campeoes.put("Uruguai", 2);
		campeoes.put("Argentina", 2);
		campeoes.put("Franca", 2);
		campeoes.put("Inglaterra", 1);
		campeoes.put("Espanha", 1);
		
		System.out.println(campeoes);
		
		campeoes.put("Brasil", 6);
		
		System.out.println(campeoes);
		
		System.out.println(campeoes.get("Argentina"));
		
		campeoes.remove("Franca");
		
		System.out.println(campeoes.containsKey("Franca"));
		
		System.out.println(campeoes.containsValue(6));
		
		System.out.println(campeoes.size());
		
		System.out.println(campeoes);
		
	//	for(Map.Entry<String, Integer> entry : campeoes.entrySet() ) {
	//		System.out.println(entry.getKey()+"-----"+ entry.getValue());
	//	}
		
		for(String key: campeoes.keySet()) {
			System.out.println(key + "--" + campeoes.get(key));
		}
		
		campeoes.clear();
		
		System.out.println(campeoes.size());
		
	}

}
