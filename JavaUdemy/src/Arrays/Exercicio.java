package Arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		//criando um array unidimensional do tipo double
		double [] notasAlunoA = new double[4];
		//adicionando valores no array
		notasAlunoA [0] = 7.8;
		notasAlunoA [1] = 8.5;
		notasAlunoA [2] = 6.7;
		notasAlunoA [3] = 5.6;
		
		//imprimindo os valores do array usando o arrays
		System.out.println(Arrays.toString(notasAlunoA));
		
		
		//percorrendo os arrays
		
		double total = 0;
		//o for terá o atributo length(comprimento do array para percorrer o array inteiro)
		for (int i = 0 ; i < notasAlunoA.length ; i++) { 
			//na vez que ele entrar acrescrentará um ao total, no 3 ele sairá do laço
			total += notasAlunoA[i];
			
		}
		
		System.out.println(total / notasAlunoA.length);
		
		
		//definindo valores do array na criação
		//utiliza-se chaves
		double [] notasDoAlunoB = {7.0, 5.6, 3.7, 9.8};
		
		double total2 = 0;
		
		for (int b = 0; b < notasDoAlunoB.length; b++) {
			//o indice dentro do array irá pegar cada elemento passado na lógica a cada loop
			total2 += notasDoAlunoB[b];
		}
		
		System.out.println(total2 / notasDoAlunoB.length);
		//imprimindo os valores do array 
		System.out.println(notasDoAlunoB[0]);
		//abaixo pegamos o ultimo valor do array
		System.out.println(notasDoAlunoB [notasDoAlunoB.length - 1]);
	}

}
