package Presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AuthentificationIhm extends JFrame {

	JTextField log = new JTextField();  
	JTextField pas = new JTextField();
	public JLabel msg = new JLabel();
	public AuthentificationIhm(){
		// creation
		setVisible(true);
		setTitle("Bonjour tous le monde");	
		JButton b = new JButton("Done");
		JButton B = new JButton("Annuler");	
		B.addActionListener(new ActionListener() { 	
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
		});
		JLabel lab1 = new JLabel("LOGIN");
		JLabel lab2 = new JLabel("Password");
		JLabel lab3 = new JLabel("Genre");
		JPanel P = new JPanel();
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("ouvrir");
		JMenu menu1 = new JMenu("File");
		JMenu menux = new JMenu("|");
		JMenu menu2 = new JMenu("Edit");
		JMenu menu3 = new JMenu("Source");
		JMenu menu4 = new JMenu("Search");
		JMenu menu5 = new JMenu("Run");
		JMenu menu6 = new JMenu("Window");
		JMenu menu7 = new JMenu("Help");
		JMenuItem Item = new JMenuItem("Fichier");
		JMenuItem Item1 = new JMenuItem("Projet");
		JMenuItem Item2 = new JMenuItem("Package");
		JMenuItem Item3 = new JMenuItem("Classe");
		JMenuItem Item4 = new JMenuItem("Source");
		JRadioButton h = new JRadioButton("Homme");
		JRadioButton f = new JRadioButton("Femme");
		ButtonGroup g = new ButtonGroup();
		JCheckBox bx = new JCheckBox("Remember me ");
		
		
		
		
		
		
		pas = new JPasswordField();
		P = (JPanel)getContentPane();
		getContentPane().setLayout(null);
		getContentPane().add(log);
		getContentPane().add(pas);
		getContentPane().add(b);
		getContentPane().add(B);
		getContentPane().add(lab1);
		getContentPane().add(lab2);
		getContentPane().add(lab3);
		getContentPane().add(f);
		getContentPane().add(h);
		getContentPane().add(bx);
		getContentPane().add(bar);
		getContentPane().add(msg);
		
		
		setBounds(200, 100, 700, 550);
		b.setBounds(300, 400, 80, 20);
		B.setBounds(300,425, 80, 20);
		msg.setBounds(120, 40, 150, 30);
		lab1.setBounds(120, 225, 150, 30);
		lab2.setBounds(120, 255, 150, 30);
		lab3.setBounds(120, 300, 150, 30);
		log.setBounds(250, 230, 200, 20);
		pas.setBounds(250, 260, 200, 20);
		f.setBounds(250, 320, 150, 20);
		h.setBounds(250, 300, 150, 20);
		bx.setBounds(250, 360, 130, 20);
		bar.setBounds(0, 0, 1400, 20);
		b.addActionListener(new AuthentificationControle(this));
		bx.setSelected(false);
		g.add(f);g.add(h);
		
		
		bar.add(menu);
		bar.add(menu1);
		menux.setEnabled(false);
		bar.add(menux);
		bar.add(menu2);
		bar.add(menu3);
		bar.add(menu4);
		bar.add(menu5);
		bar.add(menu6);
		bar.add(menu7);
		menu.add(Item);
		menu.add(Item1);
		menu.add(Item2);
		menu.add(Item3);
		menu.add(Item4);
		

		
		
		
		
	}

}
