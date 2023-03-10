package classe;

public class Produto {
	// atributos da classe
	String name;
	double price;
	double discount;

	
	//foi criado um método para calcular o preço com desconto
	//também foi alterado na classe ProdutoTeste
	double priceWithDiscount(){ 
		double finalDiscount = price * (1 - discount);
		return finalDiscount;
	}
	//criado um método passando um parametro que não foi iniciado na classe
	//dessa forma, pode ser passado diretamente pelo usuario
	double priceWithDiscount(double discountOfMannager) {
		return price * (1 - discount + discountOfMannager);
		
	}
}
