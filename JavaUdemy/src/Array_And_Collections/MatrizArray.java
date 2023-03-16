package Array_And_Collections;

import java.util.Scanner;

public class MatrizArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos? ");
		int qtdAlunos = sc.nextInt();

		System.out.println("Quantas notas por aluno? ");
		int qtdNotas = sc.nextInt();

		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];
		double total = 0;
		// percorrendo as notas da turma
		// o for mais externo percorrerá todas as notas da turma
		for (int i = 0; i < notasDaTurma.length; i++) {
			// a variavel j vai percorrer a nota e a variavel i representa o aluno
			for (int j = 0; j < notasDaTurma[i].length; j++) {

				// contador sempre irá receber mais um para que a iteração seja adicionada
				System.out.printf("Informe a nota %d do aluno %d", j + 1, i + 1);
				notasDaTurma[i][j] = sc.nextDouble();
				// soma todas as notas de acordo com cada aluno
				total += notasDaTurma[i][j];

			}

		}

		// calcula a média
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("A média da turma é: " + media);
	}

}
