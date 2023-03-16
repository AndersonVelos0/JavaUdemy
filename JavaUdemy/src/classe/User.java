package classe;

public class User {

	String name;
	String email;

	// criando o método equals para comparar dois objetos
	public boolean equals(Object obj) {

		// forma correta de se implementar para verificação da veracidade
		// verificando se o obj está instanciado em User
		//o instanceof pergunta "a variavel obj é da instancia de User?"
		if (obj instanceof User) {
			// Convertendo o objeto em user
			User outro = (User) obj;
			// referenciando e igualando os valores
			boolean nomeIgual = outro.name.equals(this.name);
			boolean emailIgual = outro.email.equals(this.email);
			// se ambos forem iguais, retorne true
			return nomeIgual && emailIgual;

		} else {
			return false;
		}
	}
}
