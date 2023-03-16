package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		//informações do funcionario
		
		
		// Tipos numericos inteiros
		byte anosNaEmpresa = 12;
		short numeroDeSalarios = 543;
		int id = 565765;
		long milhas = 3_234_213_123L;
		
		
		//tipos numéricos reais 
		
		float salario = 1.342f;
		double saldoBancario = 678.567;
		
		//tipos caracteres
		
		char a = 'A';
		
		//tipo booleano 
		
		boolean estaDeFerias = false;
		
		// usando as variaveis 
		
		
		//Dias na empresa
		System.out.println(anosNaEmpresa * 365);
		
		//Numero de salarios
		System.out.println(numeroDeSalarios / 12);
		
		//Id 
		System.out.println(id + " ganha " + salario);
		
		//saldo
		System.out.println(saldoBancario);
		
		// CARACTERES
		
		System.out.println(a);
		
		//booleano 
		 
		System.out.println("Ferias? " + estaDeFerias);
		
		//long 
		
		System.out.println(milhas);
	}

}
