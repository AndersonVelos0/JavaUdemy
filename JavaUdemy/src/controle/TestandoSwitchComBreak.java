package controle;

import java.util.Scanner;

public class TestandoSwitchComBreak {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String conceito = "";
		System.out.println("Informe sua nota!");
		int nota = sc.nextInt();
		
		switch (nota) {
		
		case 10:
			conceito = "A";
			//o break é utilizado para quebrar o fluxo natural do código, o case, caso selecionado, será finalizado
			//ja o continue interrompe apenas a repetição em que ele foi chamado, passando para proxima linha
			break;
		case 9:
			conceito = "A";
			break;
		
		case 8:
			conceito = "B";
			break;
		
		case 7:
			conceito = "C";
			break;
			
		case 6:
			conceito = "D";
			break;
			
		//neste caso abaixo, setamos 3 cases para mesma finalidade, economizando linhas e memória	
		case 5: case 4: case 3: 
			conceito = "F";
			break;
		
		default:
			conceito = "Não enontrado";
			break;
			
		}
		
		System.out.println("Conceito é: " + conceito);
		sc.close();
	}
	
}
