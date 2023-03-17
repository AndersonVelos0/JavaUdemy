package Collections;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		// criando uma lista usando o arraylist, usando a classe usuario de colecctions
		ArrayList<User> lista = new ArrayList<>();

		User u1 = new User("Ana");
		lista.add(u1);

		// objeto já foi criado e adicionado na lista
		lista.add(new User("Anderson"));
		lista.add(new User("Beatriz"));
		lista.add(new User("Roberta"));
		lista.add(new User("Elizangela"));

		// metodo de impressao por index
		System.out.println(lista.get(3).name);

		// removendo

		//pelo indice, ele retorna o usuario removido
		lista.remove(3);
		lista.remove(new User("Anderson"));
		
		//verificar se contem
		
		System.out.println("Tem?" + lista.contains(new User("Elizangela")));
		

		for (User u : lista) {
			// A ordem de inserção será mantida
			System.out.println(u);
		}
	}
}
