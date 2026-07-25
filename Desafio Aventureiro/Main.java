package EudoriaAventureiro;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Guerreiro arthus = new Guerreiro("Arthus", 5, 150, 12.0, 8.0);
		Mago morgana = new Mago("Morgana", 7, 100, 15.5, 10.0);
		
		arthus.exibirStatus();
		arthus.usarHabilidadeEspecial();
		
		morgana.exibirStatus();
		morgana.usarHabilidadeEspecial();
		
		System.out.println("--- Demonstração de Polimorfismo ---");
		List<Personagem> herois = new ArrayList<>();
		herois.add(arthus);
		herois.add(morgana);
		
		herois.add(new Guerreiro("Bonrin", 3, 120, 10.0, 6.0));
		herois.add(new Mago("Brujah", 3, 150, 15.2, 10.5));
		
		for (Personagem p : herois) {
			p.exibirStatus();
			p.usarHabilidadeEspecial();
			System.out.println("------------------------------");
		}
	}

}
