package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {

		// Quando criamos uma string, por exemplo, criamos um objeto. Exemplo:
		String texto = "Texto";
		// também pode ser representado dessa forma
		String tex = new String("Texto");
		tex.toLowerCase();
		// String nesse caso é uma classe do java e toda classe, quando referenciada,
		// cria-se um objeto

		// Classes Wrapper(Involucros) são a versão objeto dos tipos primitivos

		// byte
		Byte b = 1;

		// Short
		Short c = 1000;

		// Integer
		Integer i = Integer.parseInt("10000");

		// long

		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(c.toString());
		System.out.println(i * 3);

		// Boolean

		Boolean bool = Boolean.parseBoolean("True");
		System.out.println(bool);
		System.out.println(bool.toString().toUpperCase());

		// Caracter

		Character a = 'a';
		System.out.println(a.toString());

		// Reais

		Double t = 12344.2335;
		System.out.println(t);

		Float y = 1223.23f;
		System.out.println(y);

		// Essas foram as versões orientadas a objeto dos tipos primitivos
	}

}
