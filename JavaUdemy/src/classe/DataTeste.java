package classe;

public class DataTeste {

	public static void main(String[] args) {
		//Após a criação dos construtores, não será necessário criar as variaveis do objeto, pois 
		//o parametro já foi passado.1'
		Data date1 = new Data();
		
		Data date2 = new Data(28, 12, 2018);
		
		String formatedDate1 = date1.showDate();
		
		// adicionando o método showDate para mostrar a data completa através da função
		
		System.out.println(formatedDate1);
		System.out.println(date2.showDate());

		date1.showDate();
		date2.showDate();

	}

}
