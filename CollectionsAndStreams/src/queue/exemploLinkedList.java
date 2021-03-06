package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class exemploLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> filaBanco = new LinkedList<>();
		
		filaBanco.add("Patricia");
		filaBanco.add("Roberto");
		filaBanco.add("Flavio");
		filaBanco.add("Pamela");
		filaBanco.add("Anderson");
		
		System.out.println("Fila do Banco kkk: " + filaBanco);		
	
		String clienteASerAtendido = filaBanco.poll();
		
		System.out.println("Atendendo: " + clienteASerAtendido);
	
		System.out.println();
		System.out.println("Fila Atualizada: "+ filaBanco);
		
		//System.out.println("Proximo a ser atendido : "+ filaBanco.peek());
		System.out.println();
		System.out.println("Proximo a ser atendido : "+ filaBanco.element());
		
		System.out.println();
		System.out.println("Percorrer a lista de Espera: (FOR)");
		for ( String client : filaBanco) {
			System.out.println(client);
		}
		
		System.out.println();
		System.out.println("Percorrer a lista de Espera: (Iterator)");
		Iterator<String> iterator = filaBanco.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());			
		}
	
		System.out.println();
		System.out.println("Quantidade de Clientes na Fila: " + filaBanco.size());
		
		System.out.println();
		System.out.println("A Fila esta vazia: " + filaBanco.isEmpty());
		
	}

}
