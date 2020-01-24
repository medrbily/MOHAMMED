import java.util.Scanner;

import Entities.Eleve;
import Entities.Etudiant;
import Traitement.GestionEtudiant;
import dao.EtudiantDao;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         GestionEtudiant gestion = new GestionEtudiant();
      //   gestion.ajouterEtudiant();
         //gestion.calculerMoyenne();
		// Eleve ee = new Eleve();
		// ee.affiche();
		// ee.affiche(4);
		//  ee.affiche("simo");
		//  ee.affiche(3," simo ");
		//Surcharge surcharge = new Surcharge();
		//surcharge.trier(1);
		EtudiantDao edao= new EtudiantDao();
		// edao.ajoutEtudiant(new Etudiant());
		 // edao.modifiernote ();
		  
		  while(true) {
				 System.out.println("1 : pour ajouter , 2 : pour modifier , 3 : pour suprimer ");
				 int i = sc.nextInt();
				 switch(i) {
				 case 1 : edao.ajoutEtudiant(new Etudiant());break;
				 case 2 : edao.modifiernote (); break;
				 case 3 : edao.suprimerEtudiant();break;
				 }
					 
				 
			 }

          
	}

}
