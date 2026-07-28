package EudoriaMestre;

public class Mago extends Personagem {
	double inteligencia;
	
	public Mago(String nome, int nivel, int PV, double power, double inteligencia) {
		super(nome, "Mago", nivel, PV, power);
		this.inteligencia = inteligencia;
	}
	
	@Override
	public void usarHabilidadeEspecial() {
		System.out.println(nome + " Utiliza seus poderes mágicos!");
	}

}
