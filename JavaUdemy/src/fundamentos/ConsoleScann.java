package fundamentos;

import java.util.Scanner;

public class ConsoleScann {

	public static void main(String[] args) {
		
		//funcionalidade utilizada para entrada de dados pelo usuário
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		//para leitura da string usa-se nextLine
		String nome = sc.nextLine();
		
		System.out.println(" Digite seu sobrenome: ");
		String sobrenome = sc.nextLine();
		
		//Para leitura do tipo int usa-se nextInt
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println("\nNome: " + nome + " " + sobrenome 
				+ "\nIdade:" + idade);
		
		//é necessário fechar o scanner para que ele não fique ocupando memória na máquina.
		sc.close();
	}
}
