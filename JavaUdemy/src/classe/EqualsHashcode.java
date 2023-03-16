package classe;

public class EqualsHashcode {

	public static void main(String[] args) {
		
		User u1 = new User();
		u1.name = "Pedro Silva";
		u1.email = "Pedro.Silva@gmail.com";
		
		User u2 = new User();
		u2.name = "Pedro Silva";
		u2.email = "Pedro.Silva@gmail.com";
		
		//retornará falso pois são objetos distintos na memoria
		System.out.println(u1==u2);
		
		//retornará falso, pois o equals padrão busca a memória
		//após a criação do método equals para comparar os objetos, ele serão verdadeiros
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
	}
	
	 
}
