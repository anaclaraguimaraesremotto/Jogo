package br.com.fiap.jogo;

public class Fase {
	public static void main(String[] args) {		
		//jogador1.nome = "Ana";(Se declarado dentro do construtor, não é necessário)
		Jogador jogador1 = new Jogador("Jussara");
		Jogador jogador2 = new Jogador();
		
		mostrarJogador(jogador1);
		jogador1.receberDano(10);		
		mostrarJogador(jogador1);		
		jogador1.receberCura(5);		
		mostrarJogador(jogador1);
		jogador1.ganharExperiencia(20);
		mostrarJogador(jogador1);
		jogador1.receberAntidoto();
		mostrarJogador(jogador1);
		jogador2.atacar(jogador1);
		
		System.out.println("Jogador 2 " + jogador2.getNome() + 
				" XP = " + jogador2.getXp() + 
				" HP = " + jogador2.getHp() +
				" ENV = " + jogador2.isEnvenenado());
	}

	private static void mostrarJogador(Jogador jogador1) {
		System.out.println("Jogador 1 " + jogador1.getNome() + 
							" XP = " + jogador1.getXp() + 
							" HP = " + jogador1.getHp() +
							" ENV = " + jogador1.isEnvenenado());
	}
}
