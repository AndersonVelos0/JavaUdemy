package classe;

public class Produto {
	// atributos da classe
	String name;
	double price;
	//tornando o desconto um atributo pertencente a classe produto
	static double discount = 0.25;

	Produto(String initialName, double initialPrice) {
		// A variavel initialName só foi criada no escopo local do construtor
		// para que seja referenciada ou seja, setada, é necessário iniciar a variavel
		// necessario explicitamente setar.
		name = initialName;
		price = initialPrice;
	}

	// foi criado um método para calcular o preço com desconto
	// também foi alterado na classe ProdutoTeste
	double priceWithDiscount() {
		double finalDiscount = price * (1 - discount);
		return finalDiscount;
	}

	// criado um método passando um parametro que não foi iniciado na classe
	// dessa forma, pode ser passado diretamente pelo usuario
	double priceWithDiscount(double discountOfMannager) {
		return price * (1 - discount + discountOfMannager);

	}
}
