package casino.core;

public class Main {

	
	public static void main(String args[]){
		Casino casino=Casino.getCasino();
		// on crée un croupier qui entre au casino
		Croupier gaston=new Croupier("gaston",1000000);
		casino.entre(gaston);
		// on place le croupier à la table 1 
		Table table1=casino.getTable("1");
		gaston.setTable(table1);
		// on crée deux joueurs
		JoueurDe7 simplet=new JoueurDe7("simplet", 5000);
		JoueurSansPeur bayard=new JoueurSansPeur("bayard", 5000);
		
		JoueurMartingale jean=new JoueurMartingale("jean",5000);
		JoueurMartingaleBis pierre = new JoueurMartingaleBis("pierre",5000);
		
		// qui entrent au casino
		casino.entre(simplet);
		casino.entre(bayard);
		
		casino.entre(jean);
		casino.entre(pierre);
		
		table1.addJoueur(simplet);
		table1.addJoueur(bayard);
		
		table1.addJoueur(jean);
		table1.addJoueur(pierre);
		
		// on joue ... parties
		int NB_PARTIES=1000;
		for(int i=0;i<NB_PARTIES;i++){
			// vas-y gaston lance une partie
			Partie partie=gaston.lancePartie();
			// les joueurs jouent
			for(Joueur joueur: table1.getJoueurs())
			{
				joueur.joue(partie);
			}
			// gaston arrete le temps des mises
			gaston.rienNeVaPlus(partie);
			// gaston enregistre les mises
			if(gaston.enregistreMises(partie))
			{
				// vas-y gaston fait tourner la roulette 
				gaston.sortUnNumero();
				// gaston paye les gagnants
				gaston.payeGagnants();
			}
			
		}
			// on affiche
			System.out.println("Le croupier "+gaston.getName()+" dispose de "+gaston.getCaisse());
			casino.sort(simplet);
			casino.sort(bayard);
			
			casino.sort(jean);
			casino.sort(pierre);
			
	}
}
