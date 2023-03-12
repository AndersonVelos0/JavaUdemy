package classe;

public class DataTeste {

	public static void main(String[] args) {
		//Após a criação dos construtores, não será necessário criar as variaveis do objeto, pois 
		//o parametro já foi passado.1'
		Data date1 = new Data();
		Data date2 = new Data(28, 12, 2018);

		// System.out.println(date1.day + "/" + date1.month + "/" + date1.year);

		// adicionando o método showDate para mostrar a data completa através da função
		System.out.println("\n" + date1.showDate());


	}

}
