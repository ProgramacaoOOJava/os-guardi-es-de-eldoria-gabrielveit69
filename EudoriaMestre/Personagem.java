package EudoriaMestre;

public abstract class Personagem implements Comparable<Personagem> {
	String nome;
	String classe;
	int nivel;
	int pv;
	double poderBase;
	
	public Personagem(String nome, String classe, int nivel, int pv, double poderBase) {
		this.nome = nome;
		this.classe = classe;
		this.nivel = nivel;
		this.pv = pv;
		this.poderBase = poderBase;
	}
	
	public void exibirStatus() {
		System.out.println("--- Status do Personagem ---");
		System.out.println("\nNome: " + nome + "\nClasse: " + classe + "\n Nível: " + nivel + "\nPontos de Vida: " + pv + "\nPoder Base: " + poderBase);
	}
	
	public abstract void usarHabilidadeEspecial();
	
	@Override
	public int compareTo(Personagem outro) {
		return Integer.compare(this.nivel, outro.nivel);
	}

}
