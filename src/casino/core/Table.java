package casino.core;

import java.util.ArrayList;
import java.util.List;

public class Table {
	private Croupier croupier = null;
	private ArrayList<Joueur> joueurs = new ArrayList<>();
	private Roulette roulette = new MaRoulette();

	public Table() {
	}
	public Roulette getRoulette()
	{
		return roulette;
	}
	public void setCroupier(Croupier croupier) {
		this.croupier = croupier;
	}

	Croupier getCroupier() {
		return croupier;
	}

	List<Joueur> getJoueurs() {
		return joueurs;
	}

	void addJoueur(Joueur joueur) {
		for (Joueur joueurDejaEnregistre : joueurs)
			if (joueur == joueurDejaEnregistre)
				return;
		joueurs.add(joueur);
	}

	void removeJoueur(Joueur joueur) {
		joueurs.remove(joueur);
	}
}
