package fundamentos.operadores;

public class OperadoresRelacionais {
	
	public static void main(String[] args) {
	
		//exemplificando operadores relacionais
		
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 4);
		System.out.println(30 != 4);
		
		
		//Misturando operadores logicos e relacionais
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = passouPorMedia && bomComportamento;
		
		System.out.println("Tem desconto? " + temDesconto);
		
		
		
	}

}
