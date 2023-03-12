package classe;

public class AreaCircTeste {

	public static void main(String[] args) {

		// Instanciando o objeto da classe AreaCirc
		AreaCirc circ1 = new AreaCirc(5);

		AreaCirc circ2 = new AreaCirc(10);

		System.out.println(circ1.calculateArea());
		System.out.println(circ2.calculateArea());

	}
}
