package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		// O java irá ler o arquivo e atribuir a variavel b ao tipo double
		// ele irá inferir o tipo
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
	}

}
