package classe;

public class AreaCirc {
	//atributo de instancia
	double ray;
	//atributo pi pertence a classe e imutavel
	static final double pi = 3.14;

	// criando o construtor passando o parametro do raio e declarando o valor padrão
	// de PI
	AreaCirc(double initialRay) {
		ray = initialRay;
	}

	// criando o método para calcular a area da circunferencia
	double calculateArea() {
		// fazendo da forma manual o calculo
		// return ray * ray * pi;
		
		// efetuando usando a função da biblioteca math
		// é um método que pertence diretamente a classe, pois chamamos a classe
		// utilizamos notação ponto e chamamos o método
		return pi * Math.pow(ray, 2);
	}
}
