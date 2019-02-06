package casino.core;

import java.util.Random;

public class JoueurSansPeur extends AbstractDefaultJoueur {
	// le joueur sans peur continue à jouer avec un solde negatif
	// il joue une mise correspondant au numéro tiré au hasard
	private Random random = new Random();

	public JoueurSansPeur(String name, int solde) {
		super(name, solde);
	}

	@Override
	public void joue(Partie partie) {

		int num = random.nextInt(37);
		if (num > 0) {
			mes_sous -= num;
			Mise mise = new Mise(this, num, num);
			partie.mise(mise);
		}
	}

}
