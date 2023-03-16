package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		// do while é usada pelo menos uma vez na sentença
		Scanner sc = new Scanner(System.in);
		String valor = "";

		// o código irá entrar no bloco, contudo, caso a flag de saida seja ativada, o
		// mesmo irá parar.
		do {

			System.out.println("Você precisa falar as palavras " + "mágicas");
			System.out.println("Quer sair?");
			valor = sc.nextLine();
		} while (!valor.equalsIgnoreCase("por favor"));

		sc.close();
	}

}
