package co.edu.uptc.test;

import java.util.Iterator;

import co.edu.uptc.structures.MyList;

public class Test {
	public static void main(String[] args) {
		MyList<Integer> numbers = new MyList<Integer>();
		numbers.add(9);
		numbers.add(9);
		numbers.add(9);

		Iterator<Integer> iterador = numbers.iterator();
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}

		numbers.add(2, 8);
		Iterator<Integer> iterador1 = numbers.iterator();
		while (iterador1.hasNext()) {
			System.out.println(iterador1.next());
		}
	}

}
