package EudoriaMestre;

public class Guerreiro extends Personagem {
	double forca;
	
	public Guerreiro(String nome, int nivel, int PV, double power, double forca) {
		super(nome, "Guerreiro", nivel, PV, power);
		this.forca = forca;
	}
	
	@Override
	public void usarHabilidadeEspecial() {
		System.out.println(nome + " desfere Golpes Poderosos!");
	}

}
