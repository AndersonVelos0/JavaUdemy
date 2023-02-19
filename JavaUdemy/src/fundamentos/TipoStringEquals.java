package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		//forma incorreta de comparação
		System.out.println("2" == "2");
		
		//forma correta 
		
		String s = new String("2");
		System.out.println("2" == s);
		//ira comparar o conteudo das duas strings e retornar verdadeiro
		System.out.println("2".equals(s));
		
		
		Scanner sc = new Scanner(System.in);
		
		String s2 = sc.nextLine();
		//serve para retirar os espaços em branco da string
		System.out.println("2".equals(s2.trim()));
		//retornará false se der espaço na string
		System.out.println("2" == s2.trim());

		
		sc.close();
	}
	
	
}
