package EudoriaAventureiro;


public abstract class Personagem {
	String nome;
	String classe;
	int nivel;
	int PV;
	double power;
	
	public Personagem(String nome, String classe, int nivel, int PV, double power) {
		this.nome = nome;
		this.classe = classe;
		this.nivel = nivel;
		this.PV = PV;
		this.power = power;
	}
	
	public void exibirStatus() {
		System.out.println("--- Status do Personagem ---");
		System.out.println("Nome: " + nome + "\nClasse: " + classe + "\nPontos de Vida: " + PV + "\nPoder Base: " + power);
	}
	
	public abstract void usarHabilidadeEspecial();

}
