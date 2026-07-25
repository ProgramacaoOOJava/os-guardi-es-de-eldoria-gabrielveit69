package Eudorianovato;

public class Main {
	public static void main(String[] args) {
		Personagem personagem1 = new Personagem("Diego", "Bárbaro", 1, 15, 2.55);
		Personagem personagem2 = new Personagem("Emerson", "Bardo", 1, 8, 2.55);
		personagem1.exibirStatus();
		personagem2.exibirStatus();
	}

}
