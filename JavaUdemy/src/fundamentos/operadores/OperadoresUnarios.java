package fundamentos.operadores;

public class OperadoresUnarios {
	
	public static void main(String[] args) {
		
		
		int a = 1;
		int b = 2;
		
		//formas pos fixadas
		a++; // a = a + 1
		b++; // b = b + 1
		a--; // a = a - 1
		b--; // b = b - 1
		
		//formas pre fixadas
		++a; // a = a + 1
		++b; // b = b + 1
		--a; // a = a - 1
		--b; // b = b - 1
		
		System.out.println("Trabalhando com ordem de precedencia!");
		
		//nesse caso abaixo será true pela ordem de precedencia, o java irá priorizar a forma pre fixada
		// em seguida irá efetuar a comparação e, somente após irá decrementar
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	
		
	}
	
}
