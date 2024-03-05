package ssjungle;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		List <Etudiant> le= new Vector<>();
		Vector <Etudiant> ve=new Vector<>();
		Etudiant e=new Etudiant(17,"Mortadha");
		e.addNote(new Note("UML",17));
		e.addNote(new Note("JEE",10));
		e.addNote(new Note("Symfony",15));
		System.out.println(e.toString());
		Etudiant e1=new Etudiant(18,"Sedki");
		e1.addNote(new Note("UML",20));
		e1.addNote(new Note("JEE",19));
		e1.addNote(new Note("Symfony",13));
		System.out.println(e1.toString());
		Etudiant e2=new Etudiant(19,"Rayen");
		e2.addNote(new Note("UML",19));
		e2.addNote(new Note("JEE",18));
		e2.addNote(new Note("Symfony",12));
		System.out.println(e2.toString());
		
		Stats s=new Stats();
		le.add(e);
		le.add(e1);
		le.add(e2);
		ve.add(e);
		ve.add(e1);
		ve.add(e2);
		s.getMoyenneGroupe(ve);
		Matcomparator c= new Matcomparator();
		Collections.sort(le,c);
		System.out.println("Apres tri= ");
		s.afficherStatsEtudiants(le);
	}

}
