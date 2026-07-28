package EudoriaMestre;

public class Main {
	public static void main(String[] args) {
		
		// 1. Criando Heróis dos Vingadores (4 membros)
		Guerreiro thor = new Guerreiro("Thor", 9, 200, 18.0, 15.0);
		Guerreiro capitaoAmerica = new Guerreiro("Capitão América", 6, 160, 12.0, 10.0);
		Mago homemDeFerro = new Mago("Homem de Ferro", 8, 140, 16.0, 14.0);
		Mago feiticeiraEscarlate = new Mago("Feiticeira Escarlate", 10, 120, 20.0, 18.0);
		
		// 2. Criando Heróis da Liga da Justiça (4 membros)
		Guerreiro superman = new Guerreiro("Superman", 10, 220, 19.0, 16.0);
		Guerreiro batman = new Guerreiro("Batman", 7, 150, 13.0, 11.0);
		Guerreiro mulherMaravilha = new Guerreiro("Mulher Maravilha", 8, 180, 15.0, 13.0);
		Mago zatanna = new Mago("Zatanna", 6, 110, 14.0, 12.0);
		
		// 3. Montando os Grupos
		Grupo vingadores = new Grupo("Os Vingadores");
		vingadores.adicionarMembro(thor);
		vingadores.adicionarMembro(capitaoAmerica);
		vingadores.adicionarMembro(homemDeFerro);
		vingadores.adicionarMembro(feiticeiraEscarlate);
		
		Grupo ligaDaJustica = new Grupo("Liga da Justiça");
		ligaDaJustica.adicionarMembro(superman);
		ligaDaJustica.adicionarMembro(batman);
		ligaDaJustica.adicionarMembro(mulherMaravilha);
		ligaDaJustica.adicionarMembro(zatanna);
		
		// 4. Listando membros dos grupos
		vingadores.listarMembros();
		ligaDaJustica.listarMembros();
		
		// 5. Ordenando Membros por nível (usando o Comparable)
		vingadores.ordenarMembrosPorNivel();
		ligaDaJustica.ordenarMembrosPorNivel();
		
		// 6. Batalhas de exemplo:
		
		// Exemplo A: Duelo individual direto
		vingadores.batalhar(thor, superman);
		
		// Exemplo B: O próprio Grupo chama as batalhas sequenciais em pares contra o outro
		vingadores.batalharContraGrupo(ligaDaJustica);
	}
}