package Traitement;

import java.util.Scanner;
import java.util.Vector;
import Entities.*;
import dao.EtudiantDao;
public class GestionEtudiant {
Scanner sc = new Scanner(System.in);
	public Vector v = new Vector();
	
	
     public Vector ajouterEtudiant()
	{
	while(true)
	{
		Etudiant e = new Etudiant();
		System.out.println("veuillez saisir le nom");
		 e.nom =sc.next();
			System.out.println("veuillez saisir le prenom");
			 e.prenom =sc.next();
			System.out.println("veuillez saisir la  note");
				e.note= sc.nextDouble();
						
				EtudiantDao dao = new EtudiantDao();
				dao.ajoutEtudiant(e);
				
				v.add(e);
				System.out.println("Etudaint ajoutée avec succes");
				System.out.println("Quitter O/N");
				if(sc.next().equalsIgnoreCase("o"))
					break;
	}
	for (int i = 0; i < v.size(); i++) {
		Etudiant r = new Etudiant();
		r = (Etudiant)v.get(i);
		
		System.out.println(r.nom + "=====>" + r.note);
	}
	
	
		
		return v;
	}
public	void calculerMoyenne()
	{
	Etudiant e1 = new Etudiant();
	 double somme = 0; int j;
     for( j=0 ;j<v.size() ; j++) {
    	e1=(Etudiant) v.get(j);
     somme=somme+e1.note;}
     
     e1.notemoyenne=somme/v.size();
System.out.println("la moyenne est :"+ somme/v.size());
 	
     }	 
  
    	 
    
	
	
}
