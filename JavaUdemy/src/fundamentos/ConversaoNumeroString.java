package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		//Usando a classe Wrapper
		Integer num1 = 10000;
		//Estamos efetuando a conversão do numero inteiro para o tipo String
		//A partir do momento da conversão, é possível abrir o leque através da notação ponto
		System.out.println(num1.toString().length());
		
		int num2 = 10000;
		//usando o tipo primitivo int para converter em string
		System.out.println(Integer.toString(num2));
		
		//também pode-se converter dessa forma
		
		System.err.println(("" + num2).length());
		System.err.println(("" + num1).length());
		
	}
}
