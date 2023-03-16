package controle;

public class ForAninhado {

	public static void main(String[] args) {

		//
		for (int i = 0; i < 10; i++) {
			// AO CHAMARMOS OUTRO FOR, ELE IRÁ REPETIR O LAÇO MAIS 10 vezes, resultando em
			// 100x repetidas
			// executando no modo debbug, clicando no inseto, podemos ver o laço de
			// repetição e sua entrada
			for (int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}

			System.out.println();
		}

	}

}
