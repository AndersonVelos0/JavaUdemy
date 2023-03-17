package Collections;

import java.util.Objects;

public class User {

	String name;

	User(String name) {
		this.name = name;
	}

	public String toString() {
		return "Meu nome é: " + this.name + ".";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(name, other.name);
	}
	
//	//FORMA SIMPLES DE IMPLEMENTAR O EQUALS E O HASHCODE
//	
//	@Override
//	public int hashcode() {
//		return 0;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		User outro = (User) obj;
//		return this.name.equals(outro.name);
//	}

}
