package classe;

public class PrimeiroTrauma {
	// como chamar essa variavel dentro do método main sem ter declarado-a dentro
	// dele?
	int a = 3;
	//um membro de classe consegue acessar outro membro de classe
	//algo estatico consegue acessar algo estatico
	static int b = 4;

	public static void main(String[] args) {

		// é necessário criarmos uma instancia para chamarmos o atributo

		PrimeiroTrauma x = new PrimeiroTrauma();
		System.out.println(x.a);

		// outra forma de acessar é transformando o atributo em static
		System.out.println(b);
	}

}
