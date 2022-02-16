package queue;

import java.util.LinkedList;
import java.util.Queue;

public class exercicioQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> nomes = new LinkedList<>();
		
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");
		
		System.out.println("Navegar Lista");
		for ( String nome: nomes) {
			System.out.println(nome);
		}
		
		System.out.println();
		System.out.println("Primeiro item da Lista: "+nomes.element());
		
		System.out.println();
		System.out.println("Remover primeiro item da Lista: "+nomes.poll());
		
		System.out.println();
		System.out.println("Adicionar Daniel: ");
		nomes.add("Daniel");
		
		System.out.println(nomes);
		
		System.out.println();
		System.out.println("Tamanho da Lista: " + nomes.size());
		
		System.out.println("Lista está vazia: " + nomes.isEmpty());
		
		System.out.println("Carlos está na Lista: " + nomes.contains("Carlos"));
		
		
		
	}

}
