package casino.core;

public class Mise {
	private final Joueur joueur;
	private final int montant;
	private final int[] numeros;
	private final int parit�;//0=pair ; 1=impair ; 2=pas de mise
	
	public Mise(Joueur joueur,int montant,int numero,int parit�){
		this(joueur,montant,new int[]{numero},parit�);
	}
	public Mise(Joueur joueur,int montant,int[] numeros,int parit�){
		this.joueur=joueur;
		this.montant=montant;
		this.numeros=numeros;
		this.parit�=parit�;
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
	public int getParit�() {
		return parit�;
	}
}
