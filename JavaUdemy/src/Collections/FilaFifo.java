package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class FilaFifo {

	public static void main(String[] args) {
		// criando uma fila
		Queue<String> fila = new LinkedList<>();

		// adicionando a uma fila
		// a diferença de comportamento ocorre quando a fila está cheia
		
		// método add lança uma exceção caso a fila esteja cheia
		fila.add("Ana");
		// método offer retorna false caso a fila esteja cheia
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Juliano");

		// Pegar os elementos da fila: Obtem o proximo elemento sem remover
		// a diferença de comportamento ocorre quando a fila está vazia
		// peek retorna null quando a fila está vazia, quando não tá, pega o primeiro
		// elemento
		System.out.println(fila.peek());
		// element retorna uma exceção que está faltando o elemento na lista
		System.out.println(fila.element());

		// método para retornar o primeiro elemento da fila já removendo-o
		// quando não há elementos, ele retorna nullo -> Poll
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		// o remove retorna uma exceção
		System.out.println(fila.remove());
		
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty(); //para saber se ta vazia
		// fila.contains();
		
	}

}
