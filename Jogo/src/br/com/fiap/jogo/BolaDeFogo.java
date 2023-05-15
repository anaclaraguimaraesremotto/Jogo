package br.com.fiap.jogo;

public class BolaDeFogo implements Movivel{

	private int poder;

    public BolaDeFogo(int poder) {
        this.poder = poder;
    }

	public void mover(int x, int y) {
		// TODO Auto-generated method stub
		 System.out.println("Lançando Bola de Fogo para x: " + x + ", y: " + y);
	}

}
