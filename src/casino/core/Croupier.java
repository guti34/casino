package casino.core;

import java.util.Set;

public class Croupier implements Personne{
	
	private int caisse=0;
	private String name;
	private Table table=null;
	private Set<Mise> mises=null;
	private int numero_sorti;
	
	public Croupier(String name,int caisse){
		this.name=name;
		this.caisse=caisse;
	}
	public int getCaisse(){
		return caisse;
	}
	public void setTable(Table table){
		this.table=table;
	}
	public Table getTable(Table table){
		return table;
	}
	public Partie lancePartie(){
		// que si je bosse
		if(table==null)
			return null;
		// et qu'un joueur est à la table
		else if(table.getJoueurs().size()<1)
			return null;
		// je crie "faites vos jeux!"
		else{
			Partie partie=new Partie();
			partie.debutMises();
			return partie;
		}		
	}
	// fin du temps de mise
	public void rienNeVaPlus(Partie partie)
	{
		// je crie "les jeux sont fait! Rien ne va plus"
		partie.finMises();
	}
	/**
	 * 
	 * @param partie
	 * @return true si au moins une mise a été enregistrée
	 */
	public boolean enregistreMises(Partie partie){
		// j'enregistre les mises
		mises=partie.getMises();
		// je les encaisse
		for(Mise mise:mises)
			caisse+=mise.getMontant();	
		return mises.size()>0;
	}
	public void payeGagnants(){
		// je paye les joueurs
		for(Mise mise:mises)
		{
			if(mise.getNumeros()[0]==numero_sorti){
				int aPayer=mise.getMontant()*36;
				caisse-=aPayer;
				mise.getJoueur().encaisse(aPayer);
			}
		}	
		
	}
	public void sortUnNumero(){
		numero_sorti=table.getRoulette().tirage();	
		// j'annonce le numero
		for(Joueur joueur:table.getJoueurs())
			joueur.notification(numero_sorti);
	}

	@Override
	public String getName() {		
		return name;
	}
	
}
