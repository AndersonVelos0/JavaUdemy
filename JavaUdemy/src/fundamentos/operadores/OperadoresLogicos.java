package fundamentos.operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {

		boolean cond1 = true;
		boolean cond2 = 3 > 7;

		// resultado da operação entre os dois boolean acima
		// dará falso por conta da tabela verdade do E(&&)
		System.out.println(cond1 && cond2);
		// OU
		System.out.println(cond1 || cond2);
		// ou exclusivo
		System.out.println(cond1 ^ cond2);
		// negação logica
		System.out.println(!cond1);
		System.out.println(!cond2);

		// Tabelas verdade

		// E

		System.out.println("\n Tabela do E");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		// OU

		System.out.println("\n Tabela do ou");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		// Ou exclusivo

		System.out.println("\n Ou exclusivo!");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		// NOT
		
		System.out.println("\n Negação logica!");
		System.out.println(!true);
		System.out.println(!false);
		

	}
}
