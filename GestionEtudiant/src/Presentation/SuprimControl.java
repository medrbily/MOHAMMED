package Presentation;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.EtudiantDao;

public class SuprimControl implements ActionListener {
AjoutIhm mm;
	
	public void actionPerformed(ActionEvent e) {
		
		EtudiantDao dao = new EtudiantDao();
		
		dao.suprimerEtudiant(mm.cin.getText());
		
		
	
	}
	 public SuprimControl(AjoutIhm hh) {
		 mm= hh;
	 }
	 
	
	
	}


