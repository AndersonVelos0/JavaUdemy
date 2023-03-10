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
	
	double priceWithDiscount(double discountOfMannager) {
		return price * (1 - discount + discountOfMannager);
		
	}
}
