package casino.core;

public abstract class AbstractDefaultJoueur implements Joueur,Personne{
	protected int mes_sous;
	private String nom;
	
	public AbstractDefaultJoueur(String nom,int solde){
		this.mes_sous=solde;
		this.nom=nom;
	}
	@Override
	public int getSolde(){
		return mes_sous;
	}
	@Override
	public void encaisse(int montant){
		mes_sous+=montant;
	}
	@Override
	public String getName() {		
		return nom;
	}
	@Override
	public void notification(int numero) {
		// rien à faire, le croupier me payera si j'ai gagné		
	}

}
