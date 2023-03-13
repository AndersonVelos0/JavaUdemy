package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		//fizemos uma atribuição por valor abaixo
		double a = 2;
		double b = a;
		
		a++;
		b--;
		//vemos que apesar de a variavel b receber a, os valores são diferentes
		//os dois valores são independentes
		System.out.println(a + " " + b);
		
		
		Data d1 = new Data(01,06,2022);
		Data d2 = d1; //atribuição por referencia (objeto)
		
		d1.day = 02;
		d2.month = 12;
		
		//o resultado impresso será o mesmo, pois estão sendo referenciados ao mesmo 
		//espaço de memória 
		System.out.println("\n" + d1.showDate());
		System.out.println(d2.showDate());
		
		
		/* Quando passado o objeto como atributo para um método, como parametro, dentro 
		 * do método, você irá receber a referencia do objeto em memoria
		 * a chamada do método causou uma alteração diretamente no objeto
		 */
		
		//Isso não é uma boa prática, a chamada do método causou uma alteração diretamente no objeto passado
		// o ideal é não mexer uma referencia para uma função de modo que ela cause alteração no objeto. 
		backDataToComumValue(d1);
		
		//o objeto foi modificado e impresso
		System.out.println("\n" + d1.showDate());
		System.out.println(d2.showDate());
		
		int c = 5;
		
		/* Quando atribuimos um valor primitivo como parametro pra um metodo, esse valor terá o mesmo comporta
 		 * mento que a atribuição de um valor primitivo. Sempre será passado para um método ou atribuição por valor
 		 * uma cópia na memoria é criada
		 */
		changePrimitive(c);
		System.out.println(c);
		
	}
	
	//a partir de um metodo que pertence a classe é possivel acessar outro metodo da classe
	//estará passando um endereço de memoria que irá mexer no objeto que foi passado
	//dentro deste método recebemos a referencia do objeto em memoria
	
	/* esse método foi criado para mostrar que o que for alterado dentro do atributo da classe 
	 * se referenciando ao objeto terá impacto quando o método for chamado 
	 */
	static void backDataToComumValue(Data d) {
		d.day = 1;
		d.month = 1;
		d.year = 1970;
	}
	
	//esse método foi criado para mostrar que mesmo que o método seja chamado ele não causará impacto
	//pois foi gerado uma copia
	static void changePrimitive(int a) {
		a++;
		
	}
	
}
