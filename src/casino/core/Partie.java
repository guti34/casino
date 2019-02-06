package casino.core;

import java.util.HashSet;
import java.util.Set;

/**
 * Cette classe représente une partie
 * @author agutierr
 *
 */
public class Partie {
	public enum Etat{ATTENTE,MISES,MISES_TERMINE,ATTENTE_TIRAGE,TERMINE};
	
	private Etat etat;
	private Set<Mise> mises;	
	
	public Partie(){
		etat=Etat.ATTENTE;
	}
	public Etat getEtat(){
		return etat;
	}
	public void debutMises(){
		if(etat==Etat.ATTENTE)
		{
		mises=new HashSet<Mise>();
		etat=Etat.MISES;
		}
	}
	public boolean mise(Mise mise){
		// on enregistre la mise
		if(etat==Etat.MISES)
		{
			return mises.add(mise);
		}else{
			return false;
		}
	}
	public void finMises()
	{
		if(etat==Etat.MISES)
			etat=Etat.MISES_TERMINE;
		
	}
	public Set<Mise> getMises(){
		if(etat==Etat.MISES_TERMINE) {
			etat=Etat.TERMINE;
			return mises;
		}
		else return null;
	}
}
