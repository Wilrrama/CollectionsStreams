package list;

import java.util.List;
import java.util.Vector;

public class exemploVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> esportes = new Vector<>();
		
		esportes.add("Futebol");
		esportes.add("Basquete");
		esportes.add("Tenis");
		esportes.add("Handebol");
		esportes.add("Nata??o");
		esportes.add("Volei");
		
		System.out.println(esportes);
		
		esportes.set(2, "Ping-Pong");
		
		esportes.remove(2);
		
		esportes.remove("Handebol");
		
		System.out.println(esportes.get(0));
		
		for (String esporte : esportes) {
			
			System.out.println(esporte);
		}
		
	}

}
