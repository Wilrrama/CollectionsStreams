package set;

import java.util.LinkedHashSet;

public class exemploLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
		
		sequenciaNumerica.add(16);
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(1);
		
		System.out.println(sequenciaNumerica);
		
		sequenciaNumerica.remove(4);
		
		for ( Integer numero : sequenciaNumerica) {
			System.out.println(numero);
		}
		
		sequenciaNumerica.clear();
		
		System.out.println(sequenciaNumerica.isEmpty());
		
		
		
	}

}
