package fundamentos;

public class TipoString {
	
	public static void main (String[] args) {
		
		//funcionalidades de uma string 
		//o charat irá pegar o indice da frase e irá impri-lo
		System.out.println("Olá, pessoal, como vocês estão?".charAt(5));
		
		//Concatenação de string
		String s = "Boa tarde!";
		System.out.println(s.concat("Olá, pessoas"));
		System.out.println(s + "!!");
		//para testar os valores iniciais em uma string
		//dará verdadeiro
		System.out.println(s.startsWith("Boa"));
		//dará falso
		System.out.println(s.startsWith("boa"));
		//testar os valores do final da string
		System.out.println(s.endsWith("tarde!"));
		// quantos caracteres tem uma string 
		System.out.println(s.length());
		//verificar a igualdade da string
		System.out.println(s.equals("boa tarde!"));
		//ignorar maiusculas e minusculas
		System.out.println(s.equalsIgnoreCase("Boa tarde!"));
		
		//string formatada
		
		String nome = "Anderson";
		String sobrenome = "Veloso";
		int idade = 23;
		double salario = 12345.566;
		//string formatada para receber e concatenar variaveis
		System.out.printf("O senhor %s %s tem %d anos e recebe %.2f", nome, sobrenome, idade, salario);
		
		//outra opção
		
		String frase = String.format("\nO senhor %s %s tem %d anos e recebe %.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		//verificar se uma palavra está contida na string 
		
		System.out.println("Olá, mundo".contains("mundo"));
		System.out.println("Olá, mundo".indexOf("mundo"));
		
		//para iniciar a execução a partir de determinado momento na string
		
		System.out.println("Olá, mundo".substring(5));
		System.out.println("Olá, mundo".substring(3,7));

		
		
	}

}
