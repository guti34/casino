package casino.core;

public class Mise {
	private final Joueur joueur;
	private final int montant;
	private final int[] numeros;
	
	public Mise(Joueur joueur,int montant,int numero){
		this(joueur,montant,new int[]{numero});
	}
	public Mise(Joueur joueur,int montant,int[] numeros){
		this.joueur=joueur;
		this.montant=montant;
		this.numeros=numeros;
	}
	public Joueur getJoueur(){
		return joueur;
	}
	public int getMontant(){
		return montant;
	}
	public int[] getNumeros(){
		return numeros;
	}
}
