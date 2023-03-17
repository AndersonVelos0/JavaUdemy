package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetHeterogeneo {

	public static void main(String[] args) {

		// criando um hashset
		HashSet conjunto = new HashSet();

		// Método adicionar, o método converte os primitivos para classes Wrapper

		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');

		// método para exibir a quantidade do conjunto

		System.out.println("Tamanho é: " + conjunto.size());

		// Método para remover elementos do conjunto, retorna true se remover e false
		// quando não consegue

		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));

		// mostrando quandos ficaram
		System.out.println(conjunto.size());

		// método para verificar se contem o elemento no conjunto

		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1.2));

		// Criando outro objeto

		// variavel Set do lado esquerdo e hashset do lado direito
		Set nums = new HashSet();

		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);

		System.out.println(nums);
		System.out.println(conjunto);

		// fazendo a uniao entre os conjuntos

		conjunto.addAll(nums);
		System.out.println(conjunto);

		// fazendo a intersecção dos conjuntos

		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		//limpando o conjunto
		
		conjunto.clear();
		System.out.println(conjunto);

	}

}
