package classe;

public class Data {

	int day;
	int month;
	int year;

	// Adicionado construtor padrão na classe Data
	Data() {
		//day = 1;
		//month = 1;
		//year = 1970;

		//Utilizando o diz dentro do construtor como função/método
		//Sempre que usado o this como método você está chamando um construtor a partir de outro
		this(1,1,1970);
	}

	// Construtor passando parametros na classe data
	Data(int day, int month, int year) {
		// caso queiramos alterar nossa variavel de instancia de forma direta
		// utilizamos o this

		// this é utilizado para referenciar o objeto que está sendo criado neste
		// momento
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// adicionando o método para mostrar a data
	String showDate() {
		// devido ao método showDate pertencer a instancia por não ser static
		// podemos acessar através do this, também

		// métodos static não podem ser acessados pelo this
		return String.format("%d/%d/%d ", this.day, this.month, this.year);
	}
	
	void printFormatedDate() {
		System.out.println(showDate());
	}
}
