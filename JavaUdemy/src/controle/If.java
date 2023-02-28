package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a média: ");
		double media = sc.nextDouble();

		if (media <= 10 && media >= 7) {
			System.out.println("Parabens, você foi aprovado!");
		//o else sempre estará linkado ao if
		} else {
			System.out.println("Você foi reprovado!");
		}

		sc.close();
	}

}
