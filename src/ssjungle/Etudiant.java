package ssjungle;

import java.util.ArrayList;

public class Etudiant  implements IStatisticable, Comparable<Etudiant> {
 private int matricule;
 private String nom;
 private ArrayList<Note> lnote;
 
public Etudiant(int matricule, String nom) {
	super();
	this.matricule = matricule;
	this.nom = nom;
	this.lnote = new ArrayList<>();
}

public int getMatricule() {
	return matricule;
}

public void setMatricule(int matricule) {
	this.matricule = matricule;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public ArrayList<Note> getLnote() {
	return lnote;
}

public void setLnote(ArrayList<Note> lnote) {
	this.lnote = lnote;
}
 
public void addNote( Note n) {
	this.lnote.add(n);
}

@Override
public String toString() {
	return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", lnote=" + lnote + "]";
}

@Override
public double getValue() {
	double moyenne;
	double s=0;
	for(int i=0; i<getLnote().size(); i++) {
		s=s+getLnote().get(i).getNote();
	}
	moyenne=s/getLnote().size();
	return moyenne;
}

public double getMax() {
	double max= getLnote().get(0).getNote();
	for(int i=0; i<getLnote().size(); i++ ) {
		if (max < getLnote().get(i).getNote()){
			max=getLnote().get(i).getNote();
		}
	}
	return max;
}
public double getMin() {
	double min= getLnote().get(0).getNote();
	for(int i=0; i<getLnote().size(); i++ ) {
		if (min > getLnote().get(i).getNote()){
			min=getLnote().get(i).getNote();
		}
	}

	return min;
}

@Override
public int compareTo(Etudiant E) {
	if(this.getValue()>E.getValue()) {
		return 1;
	}
	if(this.getValue()<E.getValue()) {
		return -1;
	}
	else {
		return 0;
	}
}

}
