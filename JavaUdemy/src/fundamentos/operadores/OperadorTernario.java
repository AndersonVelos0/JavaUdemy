package fundamentos.operadores;

public class OperadorTernario {
	
	
	public static void main(String[] args) {
		
		//operador ternário 
		
		double media = 7.6; 
		//no caso abaixo está utilizando dois operadores de comparação ternários "?" e ":"
		String resultado = media  >= 7 ? "Aprovado" : "Recuperação";
		
		System.out.println("O aluno está " + resultado);
		
	}

}
