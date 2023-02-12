package fundamentos;

//o import será trazido para essa região fora do main, porém, dentro do pacote.
import java.util.Date;

public class Import {

	public static void main(String[] args) {

		/*
		 * Algumas funcionalidades do java necessitam de importação das bibliotecas como
		 * é o caso do exemplo abaixo que importará a biblioteca util
		 */
		Date d = new Date();
		System.out.println(d);
		
		// Nem todo conteudo está disponível no pacote mais basico, o lang, alguns
		// necessitam ser importados.
	}
}
