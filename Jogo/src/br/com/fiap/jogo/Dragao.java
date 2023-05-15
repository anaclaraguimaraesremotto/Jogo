package br.com.fiap.jogo;

public class Dragao extends ElementoVisual implements Movivel{

	public Dragao(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public void mover(int x, int y) {
		 System.out.println("Movendo Dragão para x: " + x + ", y: " + y);
	}
}
