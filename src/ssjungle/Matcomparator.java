package ssjungle;

import java.util.Comparator;

public class Matcomparator implements Comparator<Etudiant> {

	@Override
	public int compare(Etudiant o1, Etudiant o2) {
		return o1.getMatricule()-o2.getMatricule();
	}
	
}
