package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String valor1 = "";
		
		//While irá retornar false até a opção ser digitada
		while (!valor1.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: ");
			valor1 = sc.nextLine();

		}
		sc.close();
	}
}
