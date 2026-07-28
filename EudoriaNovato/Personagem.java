package EudoriaNovato;

public class Personagem {
	String nome;
	String classe;
	int nivel;
	int pv;
	double power;
	
	public Personagem(String nome, String classe, int nivel, int pv, double power) {
		this.nome = nome;
		this.classe = classe;
		this.nivel = nivel;
		this.pv = pv;
		this.power = power;
		
	}
	
	public void exibirStatus() {
		System.out.println("Nome: " + nome + "\n" + "Classe: " + classe + "\n" + "Nível: " + nivel + "\n" + "Pontos de Vida: " + pv + "\n" + "Poder Base: " + power + "\n\n");
	}

}

