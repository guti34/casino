package casino.core;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class Casino {
	/*
	 * exemple d'une classe Singleton
	 */

	private static Casino casino = null;

	private HashMap<String,Table> tables=new HashMap<>();
	private Set<Personne> personnes=new HashSet<Personne>();
	
	public static Casino getCasino() {
		if (casino == null)
			casino = new Casino();
		return casino;
	}
	
	private Casino(){
		// 3 tables de roulette dans le casino
		tables.put("1",new Table());		
		tables.put("2",new Table());		
		tables.put("3",new Table());		
	}
	public Table getTable(String nomTable){
			return tables.get(nomTable);
	}
	public void entre(Personne personne){
		personnes.add(personne);
		if(personne instanceof Joueur)
			System.out.println(personne.getName()+" arrive avec "+((Joueur)personne).getSolde());
		// c'est la pointeuse
		if(personne instanceof Croupier)
			System.out.println(personne.getName()+" arrive au boulot");
	}
	public void sort(Personne personne){
		personnes.remove(personne);
		if(personne instanceof Joueur)
			System.out.println(personne.getName()+" sort avec "+((Joueur)personne).getSolde());
	}
	public void printListePersonnesPresentes(){
		System.out.println("Liste des personnes présentes dans le casino");
		for(Personne personne:personnes)
			System.out.println("* "+personne.getName());
	}
}
