package casino.core;

public class JoueurMartingaleBis extends JoueurMartingale {
	
	private int montant = 1;

	public JoueurMartingaleBis(String name, int solde) {
		super(name, solde);
		// TODO Auto-generated constructor stub
	}
	public void joue(Partie partie) {
		if(this.getSolde()>0) {
			if(partiegagnée){
				montant = 1;
				partiegagnée = false;
			}
			else{
				montant*=2;
			}
			mes_sous=mes_sous - montant;
			Mise mise = new Mise(this, montant, 13,2);
			partie.mise(mise);
		}
	}

}
