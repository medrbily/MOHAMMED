package Presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Entities.Etudiant;
import dao.EtudiantDao;

public class AjoutControl implements ActionListener{

AjoutIhm a;
	public void actionPerformed(ActionEvent e) {
		EtudiantDao dao = new EtudiantDao();
		Etudiant etudiant = new Etudiant();
		etudiant.cne = Integer.parseInt(a.cin.getText());
		etudiant.nom = a.nom.getText();
		etudiant.prenom = a.pre.getText();
		etudiant.note = Double.parseDouble(a.not.getText());
		etudiant.notemoyenne = Double.parseDouble(a.moy.getText());
		dao.ajoutEtudiant(etudiant);
		a.cin.setText("");
		a.nom.setText("");
		a.pre.setText("");
		a.not.setText("");
		a.moy.setText("");
	
	}
	public AjoutControl(AjoutIhm ihm) {
		a = ihm;
	}

}
