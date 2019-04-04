package casino.core;

public class JoueurMartingale extends AbstractDefaultJoueur {
	
	private int montant = 1;
	
	public JoueurMartingale(String name, int solde) {
		super(name, solde);
	}
	
	public void joue(Partie partie) {
		if(this.getSolde()>0) {
			if(partiegagn�e){
				montant = 1;
				partiegagn�e = false;
			}
			else{
				montant*=2;
			}
			mes_sous=mes_sous - montant;
			Mise mise = new Mise(this, montant, 42,0);//42 pour ne pas miser sur un nombre de la roulette .....
			partie.mise(mise);
		}
	}
	
}
