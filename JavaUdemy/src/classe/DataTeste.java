package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data date1 = new Data();
		date1.day = 28;
		date1.month = 12;
		date1.year = 2016;

		System.out.println(date1.day + "/" + date1.month + "/" + date1.year);
		//adicionando o método showDate para mostrar a data completa através da função
		System.out.printf(date1.showDate());
		
	}

}
