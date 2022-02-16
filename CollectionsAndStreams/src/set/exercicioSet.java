package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class exercicioSet {

	public static void main(String[] args) {
		
		Set <Integer> numbers = new HashSet<>();
		
		numbers.add(3);
		numbers.add(88);
		numbers.add(20);
		numbers.add(44);
		numbers.add(3);
		
		for (Integer number : numbers) {
			System.out.println(number);
		}
		
		numbers.remove(0);
		
		numbers.add(23);
		
		System.out.println(numbers.size());
		
		System.out.println(numbers.isEmpty());
	}

}
