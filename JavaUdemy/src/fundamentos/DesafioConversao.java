package fundamentos;

import java.util.Scanner;
import java.util.Locale;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro salario: ");	
		String salario1 = sc.next();
		
		System.out.println("Digite o segundo salario: ");	
		String salario2 = sc.next();
		
		System.out.println("Digite o terceiro salario: ");	
		String salario3 = sc.next();
		
		
		Double salario_1 = Double.parseDouble(salario1);
		Double salario_2 = Double.parseDouble(salario2);
		Double salario_3 = Double.parseDouble(salario3);

		
		Double soma = salario_1 + salario_2 + salario_3;
		
		System.out.println("Soma dos salarios é: " + soma);
		System.out.println("Média dos salarios é: " + soma / 3);
		
		
	}

}
