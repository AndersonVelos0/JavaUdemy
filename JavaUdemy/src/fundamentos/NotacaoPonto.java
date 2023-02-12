package fundamentos;

public class NotacaoPonto {
	
	  public static void main(String[] args) {
		
		  String s = "Ohayo, X";
		  // a função toUpperCase deixará todos os caracteres maiusculos
		  s = s.replace("X", "Onni-chan");
		  s = s.toUpperCase();
		  // a função replace fará a substituição de uma informação pela outra 
		  s = s.replace("X", "Onni-chan");
		  //a função concat adicionará informações na sua variavel
		  s = s.concat("!!!");
		  System.out.println(s);
		  
		  //Para acessarmos as funcionalidades utiliza-se a notação ".", a IDE ajudará com as solicitações.
		  
		  String y = "Bom dia, Anderson".replace("Anderson","Beatriz. ").toLowerCase().concat("Como você está?");
		  System.out.println(y);
		  
		  //Tipos primitivos não tem operador "."
		  
		  int a = 3; 
		  //O código abaixo não irá rodar porque os primitivos não possuem funcionalidades pela notação.
		  //a.replace 
	}
}
