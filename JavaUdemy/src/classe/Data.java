package classe;

public class Data {
	
	int day; 
	int month; 
	int year;
	
	//Adicionado construtor padrão na classe Data
	Data(){
		day = 1;
		month = 1; 
		year = 1970;

	}
	//Construtor passando parametros na classe data
	Data(int day1, int month1, int year1){
		day = day1;
		month = month1; 
		year = year1;
		
		System.out.printf("%d/%d/%d", day1, month1, year1);
		
	}
	//adicionando o método para mostrar a data
	String showDate() {
		return String.format("%d/%d/%d", day, month, year);
	}
}
