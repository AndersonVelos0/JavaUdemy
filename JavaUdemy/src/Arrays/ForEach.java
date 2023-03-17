package Arrays;

public class ForEach {

	public static void main(String[] args) {

		double[] notas = { 2.0, 4.6, 9.9, 8.7 };

		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i] + " ");
		}
		
		System.out.println();
		// percorrendo o array utilizando o for each quando quiser percorrer o array
		// inteiro passando por todos os elementos
		
		//cria-se uma variavel do mesmo tipo para ir armazenando os dados do array notas
		for (double nota: notas) {
			System.out.println(nota + " ");
		}
	}

}