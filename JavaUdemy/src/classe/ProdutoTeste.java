package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		//o new é a palavra que cria uma instancia para classe
		Produto p1 = new Produto();
		//Estamos alterando de forma direta os valores dos atributos da classe Produto
		p1.name = "Notebook Dell Aspiron";
		p1.price = 4345.87;
		p1.discount = 0.23;
			
		//Instanciando outro objeto da mesma classe
		Produto p2 = new Produto();
		p2.name = "Headset Redragon";
		p2.price = 299.90;
		p2.discount = 0.15;
		
		//Imprimindo os valores
		System.out.println(p1.name + "\n" + p1.price + "\n" + p1.discount);
		System.out.println(p2.name + "\n" + p2.price + "\n" + p2.discount);
		
		//Obs: É valido lembrar que a alteração de valores e informes dos atributos deve ser feita através dos métodos getters
		//and setters, desta forma é só para entendimento de como funciona,.
	}
}
