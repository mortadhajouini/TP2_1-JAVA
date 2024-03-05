package ssjungle;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Stats {
	
	
	public void afficherStatsEtudiants(List <Etudiant> l) {
		Iterator<Etudiant>it=l.iterator();
		while(it.hasNext()) {
			Etudiant e=it.next();
			System.out.println(e.getValue());
			System.out.println(e.getMax());
			System.out.println(e.getMin());
		}	
	}
	public void getMoyenneGroupe (Vector <Etudiant> ve) {
		double s=0;
		Iterator<Etudiant>it=ve.iterator();
		while(it.hasNext()){
			Etudiant e=it.next();
			s=s+e.getValue();
		}
		System.out.println("MoyGroup= "+s/ve.size());
		
	}
	public void getMaximumGroupe() {
		
		
	}
	public void getMinimumGroupe() {
		
		
	}
	
}
