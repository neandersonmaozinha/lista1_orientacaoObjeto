package excercicioOrientacaoObjeto_1_1;




/* Exercício 1.1. Descreva em no máximo 200 palavras o que é um automóvel e o que
ele faz. Liste os substantivos e verbos separadamente. Cada substantivo corresponde
a um objeto que precisará ser construído para implementar um sistema, nesse caso,
um carro. Selecione 5 dos objetos que você listou e, para cada um, liste vários
atributos e comportamentos. Descreva brevemente como esses objetos interagem
entre si e com outros objetos na sua descrição. Estes passos que você seguiu são
típicos do projeto orientado a objetos.*/

public class Carro {

	String modelo;
	String fabricante;
	String cor;
	String roda;
	int numeroPortas;
	int pontenciaCavalos;
	double velocidadeMaxima;
	int quantidadeMachas;
	int macha;
	boolean arCondicionado;
	boolean estaLigado = false;
	boolean tetoSolar;
	int velocidade;
	
	public void ligar (boolean estaLigado) {
		if (estaLigado == false) {
			this.estaLigado = true;
		}
	}
	
	public void desligar (boolean estaLigado) {
		if (estaLigado) {
			this.estaLigado = false;
		}
	}
	
	public void aumentarVelocidade (int velocidade) {
		this.velocidade++;
	}
	
	public void diminuirVelocidade (int velocidade) {
		this.velocidade--;
		
		}
	public void aumentarMacha (int macha) {
		if (macha <= quantidadeMachas) {
			this.macha++;
		}
	}
	public void diminuirMacha(int macha) {
		if (macha <= quantidadeMachas) {
			this.macha--;
		}
	}
}



