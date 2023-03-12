package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		// o new é a palavra que cria uma instancia para classe
		//Adicionado o parametro exigido pelo construtor
		Produto p1 = new Produto("Notebook", 4854.34);
		// Estamos alterando de forma direta os valores dos atributos da classe Produto
		

		// Instanciando outro objeto da mesma classe
		//foi adicionado o nome do produto devido ao construtor criado com parametro
		Produto p2 = new Produto("Headset", 342.95);
		

		// Imprimindo os valores
		// adicionando o atributo da classe "discount"
		System.out.println(p1.name + "\n" + p1.price + "\n" + Produto.discount);
		System.out.println(p2.name + "\n" + p2.price + "\n" + Produto.discount);

		//houve o refatoramento do código, adicionando o método de calcular o preço com desconto
		//quando é chamado entre parenteses, estamos chamando um método, quando sem parenteses, um atributo
		double finalPrice1 = p1.priceWithDiscount();
		double finalPrice2 = p2.priceWithDiscount();

		System.out.printf("Preço final do produto é: R$%.2f." + "\n", finalPrice1);
		System.out.printf("Preço final do produto é: R$%.2f.", finalPrice2);

		// Obs: É valido lembrar que a alteração de valores e informes dos atributos
		// deve ser feita através dos métodos getters
		// and setters, desta forma é só para entendimento de como funciona,.
	}
}
