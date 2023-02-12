package fundamentos;

public class ExercicioTemperatura {
	
	public static void main(String[] args) {
		final double divisaoFarenheit = 5.0 / 9.0;
		final double ajuste = 32;
		
		double farenheit = 86;
		double grausCelsius = (farenheit - ajuste) * divisaoFarenheit;
		System.out.println(grausCelsius);
		
	}

}
