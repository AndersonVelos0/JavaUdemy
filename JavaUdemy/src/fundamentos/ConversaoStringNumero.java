package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main (String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		
		//quando há duas strings e você usa o simbolo do +, será uma concatenação e não uma soma
		System.out.println(valor1 + valor2);
		
		
		//convertendo String para o tipo Double
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		//printando a soma e a média dos dois numeros pedidos como string
		double soma = numero1 + numero2;
		System.out.println("Soma é: " + soma);
		System.out.println("Média do numero é: " + soma / 2);
	}

}
