package EudoriaMestre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Grupo {
	private String nomeDoGrupo;
	private List<Personagem> membros;
	
	public Grupo(String nomeDoGrupo) {
		this.nomeDoGrupo = nomeDoGrupo;
		this.membros = new ArrayList<>();
	}
	
	public String getNomeDoGrupo() {
		return nomeDoGrupo;
	}
	
	public void adicionarMembro(Personagem personagem) {
		this.membros.add(personagem);
	}
	
	public void listarMembros() {
		System.out.println("\n--- Membros do Grupo: " + nomeDoGrupo + " ---");
		for (Personagem p : membros) {
			p.exibirStatus();
		}
		System.out.println("------------------------------------");
	}
	
	// Realiza o confronto entre dois personagens e executa suas habilidades especiais
	public void batalhar(Personagem p1, Personagem p2) {
		System.out.println("\n--- Início da Batalha: " + p1.nome + " vs " + p2.nome + " ---");
		
		// Chamada dos ataques / habilidades especiais de cada classe!
		p1.usarHabilidadeEspecial();
		p2.usarHabilidadeEspecial();
		
		// Cálculo do Poder Total: poderTotal = nivel * poderBase
		double poderTotalP1 = p1.nivel * p1.poderBase;
		double poderTotalP2 = p2.nivel * p2.poderBase;
		
		System.out.println(p1.nome + " | Poder Total: " + String.format("%.2f", poderTotalP1));
		System.out.println(p2.nome + " | Poder Total: " + String.format("%.2f", poderTotalP2));
		
		// Verificação do vencedor
		if (poderTotalP1 > poderTotalP2) {
			System.out.println(p1.classe + " " + p1.nome + " venceu! Poder total: " + String.format("%.2f", poderTotalP1));
		} else if (poderTotalP2 > poderTotalP1) {
			System.out.println(p2.classe + " " + p2.nome + " venceu! Poder total: " + String.format("%.2f", poderTotalP2));
		} else {
			System.out.println("A batalha terminou em Empate!");
		}
	}

	// Batalha em pares sequenciais contra outro grupo
	public void batalharContraGrupo(Grupo outroGrupo) {
		System.out.println("\n========================================");
		System.out.println("   CONFRONTO DIRETO DE GRUPOS");
		System.out.println("   " + this.nomeDoGrupo + " VS " + outroGrupo.getNomeDoGrupo());
		System.out.println("========================================");

		int totalLutas = Math.min(this.membros.size(), outroGrupo.getMembros().size());

		for (int i = 0; i < totalLutas; i++) {
			Personagem p1 = this.membros.get(i);
			Personagem p2 = outroGrupo.getMembros().get(i);
			batalhar(p1, p2);
		}
	}
	
	public void ordenarMembrosPorNivel() {
		Collections.sort(membros);
		System.out.println("\nMembros do Grupo " + nomeDoGrupo + " ordenados por Nível:");
		for (Personagem p : membros) {
			System.out.println("- " + p.nome + " (Nível " + p.nivel + ")");
		}
	}
	
	public List<Personagem> getMembros() {
		return membros;
	}
}