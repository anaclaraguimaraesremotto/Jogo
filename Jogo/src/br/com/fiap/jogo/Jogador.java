package br.com.fiap.jogo;

public abstract class Jogador extends PersonagemNaoJogavel{
	protected String nome;
    protected int xp;
    protected int hp;
    protected boolean envenenado;

    public Jogador(String nome, int xp, int hp) {
        this.nome = nome;
        this.xp = xp;
        this.hp = hp;
        this.envenenado = false;
    }

    public abstract void mover(int x, int y);
    
	public void receberDano(int pontos) {
		hp -= pontos;
		if(hp <=0) {
			System.out.println("GAME OVER! " + nome);
		}
	}

	public void receberCura(int pontos) {
		hp += pontos;
	}

	public String getNome() {
		return nome;
	}

	public int getXp() {
		return xp;
	}

	public int getHp() {
		return hp;
	}

	public boolean isEnvenenado() {
		return envenenado;
	}

	public void ganharExperiencia(int pontos) {
		xp += pontos;
	}

	public void receberAntidoto() {
		envenenado = !envenenado;
		
	}

	public void atacar(Jogador jogador) {
		jogador.receberDano(this.getXp());
		if(jogador.foiDerrotado())
			ganharExperiencia(jogador.getXp());
	}

	private boolean foiDerrotado() {
		return false;
	}


}
