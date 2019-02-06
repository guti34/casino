package casino.core;

public class JoueurDe7 extends AbstractDefaultJoueur {
	/* 
	 * le joueur de 7 joue toujours 1 sur le 7, il ne s'endette pas
	 */
	public JoueurDe7(String name, int solde) {
		super(name, solde);
	}

	@Override
	public void joue(Partie partie) {
		if(getSolde()>0){
		mes_sous--;
		Mise mise = new Mise(this, 1, 7);
		partie.mise(mise);
		}
	}

}
