package casino.core;

public class Mise {
	private final Joueur joueur;
	private final int montant;
	private final int[] numeros;
	private final int parité;//0=pair ; 1=impair ; 2=pas de mise
	
	public Mise(Joueur joueur,int montant,int numero,int parité){
		this(joueur,montant,new int[]{numero},parité);
	}
	public Mise(Joueur joueur,int montant,int[] numeros,int parité){
		this.joueur=joueur;
		this.montant=montant;
		this.numeros=numeros;
		this.parité=parité;
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
	public int getParité() {
		return parité;
	}
}
