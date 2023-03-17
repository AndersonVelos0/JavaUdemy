package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas notas você deseja adicionar? ");

		int qtdNotas = sc.nextInt();

		// adicionando o numero informado pelo usuario ao tamanho que será o array
		double[] notas = new double[qtdNotas];

		for (int i = 0; i < notas.length; i++) {
			// concatenando e somando com o contador
			System.out.println("Informe as notas:" + (i + 1) + ": ");
			notas[i] = sc.nextDouble();
		}

		System.out.println(Arrays.toString(notas));

		// criando a variavel para somar as notas
		double total = 0;
		// criando um for each para percorrer todo o array
		for (double nota : notas) {
			total += nota;
		}

		System.out.println("A média é: " + (total / notas.length));
		sc.close();
	}
}
