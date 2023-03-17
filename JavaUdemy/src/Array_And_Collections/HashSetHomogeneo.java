package Array_And_Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetHomogeneo {

	public static void main(String[] args) {

		// criando a lista já tipada
		// Set<String> listaAprovados = new HashSet<String>();

		// criando a lista levando em consideração a ordem de inserção
		// O treeset faz parte do sorted set, para ordenação
		SortedSet<String> listaAprovados = new TreeSet<String>();

		listaAprovados.add("Anderson");
		listaAprovados.add("Bia");
		listaAprovados.add("Biazinha");
		listaAprovados.add("Roberta");

		for (String candidato : listaAprovados) {

			System.out.println(candidato);

		}

		Set<Integer> nums = new HashSet<Integer>();

		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);

		// utilizando o tipo int, pois fará o autobox
		for (int n : nums) {

			System.out.println(n);
		}

	}

}
