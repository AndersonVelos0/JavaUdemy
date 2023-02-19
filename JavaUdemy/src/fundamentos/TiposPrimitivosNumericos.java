package fundamentos;

public class TiposPrimitivosNumericos {
	
	public static void main (String[] args) {
		
		// Tipo double
		double a = 1;
		System.out.println(a);
		
		//Para declarar um número do tipo float é necessário colocar um F ao final do valor.
		float b = 1.5F;
		//ou podemos fazer dessa forma usando o Cast
		float c = (float) 1.5;
		System.out.println(b);
		
		
		int d = 340;
		//ao primeiro momento o java vai te alertar que pode haver perda de conteudo na variavel
		//contudo, você pode efetuar o cast e forçar essa conversão:
		byte e = (byte) d;
		System.out.println(e);
		
		
	}

}
