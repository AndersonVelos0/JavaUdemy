package classe;

public class Data {
	
	int day; 
	int month; 
	int year;
	
	//adicionando o método para mostrar a data
	String showDate() {
		return String.format("%d/%d/%d", day, month, year);
	}
}
