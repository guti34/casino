package casino.core;

public interface Joueur {
	/**
	 * 
	 * @return le solde du joueur
	 */
	int getSolde();
	
	public void joue(Partie partie);
	public void encaisse(int montant);
	public void notification(int numero);
}
