package Presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Entities.Etudiant;
import dao.EtudiantDao;

public class AjoutIhm extends JFrame {
	JTextField cin = new JTextField();  
	JTextField nom = new JTextField();
	JTextField pre = new JTextField();
	JTextField moy = new JTextField();
	JTextField not = new JTextField();
	
	public AjoutIhm () {
	  
	  
	   setVisible(true);
	   setTitle("ajouter etudiant");
	   JButton a = new JButton("Ajouter");
	   JButton b = new JButton("Suprimer");
	   JButton c = new JButton("Modifier");
	   JButton d = new JButton("Chercher");
	   JLabel lab = new JLabel("CIN");
	   JLabel lab1 = new JLabel("Nom");
	   JLabel lab2 = new JLabel("Prenom");
	   JLabel lab3 = new JLabel("moyenne");
	   JLabel lab4 = new JLabel("note");
	   JPanel P = new JPanel();
/////////////////////////
	   getContentPane().setLayout(null);
	   getContentPane().add(cin);
	   getContentPane().add(nom);
	   getContentPane().add(pre);
	   getContentPane().add(moy);
	   getContentPane().add(not);
	   getContentPane().add(a);
	   getContentPane().add(b);
	   getContentPane().add(c);
	   getContentPane().add(d);
	   getContentPane().add(lab);
	   getContentPane().add(lab1);
	   getContentPane().add(lab2);
	   getContentPane().add(lab3);
	   getContentPane().add(lab4);
	   P = (JPanel)getContentPane();
	/////////////////////////////////////////////
	   setBounds(200, 100, 700, 550);
	   a.setBounds(250, 400, 100, 30);
	   b.setBounds(360, 400, 100, 30);
	   c.setBounds(250, 440, 100, 30);
	   d.setBounds(360, 440, 100, 30);
	   lab.setBounds (150, 95, 150, 50);
	   lab1.setBounds(150, 125, 150, 50);
	   lab2.setBounds(150, 155, 150, 50);
	   lab3.setBounds(150, 185, 150, 50);
	   lab4.setBounds(150, 215, 150, 50);
	   cin.setBounds(250, 110, 180, 25);
	   nom.setBounds(250, 140, 180, 25);
	   pre.setBounds(250, 170, 180, 25);
	   moy.setBounds(250, 200, 180, 25);
	   not.setBounds(250, 230, 180, 25);
	   
	   a.addActionListener(new AjoutControl(this) );
	   b.addActionListener(new SuprimControl(this) );
	   c.addActionListener(new ModifControl(this) );
	   d.addActionListener(new AjoutControl(this) );
	   
	   
  }
}
