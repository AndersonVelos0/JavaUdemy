package controle;

public class TestandoSwitch {

	public static void main(String[] args) {
	
		//forma mais usual do switch sem o break
		String faixa = "laranja";
		//SWITCH não recebe valor verdadeiro ou falso, mas sim, o proprio valor da variavel
		switch (faixa.toLowerCase()){
			
			case "preta":
				System.out.println("Bassai-Dai...");
				
			case "marrom":
				System.out.println("Tekki shoddan");
			
			case "roxa":
				System.out.println("Heian Godan");
			
			case "verde":
				System.out.println("Heian Yodan");
			
			case "laranja":
				System.out.println("Heian Sandan");
			
			//default:
				//System.out.println("Não sei muita coisa!");
			//devido a falta do break, todos os cases serão executados
		}
	} 
}
