package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Entities.Etudiant;

  public class EtudiantDao {
	
	Connection cnx; //cr�er une cnx (lien) ver une base de donn�es
	
	Statement st; // pour envoyer et ex�cuter des requeteq sql
	 
	ResultSet rsq; // r�cuperation des Rst
	
	public EtudiantDao() {
String chaine = "jdbc:mysql://localhost:3306/gestionetudiant";
	

		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("chargement avec succ�s");
		}catch (ClassNotFoundException e1) {
			System.out.println("probl�me driver");
			e1.printStackTrace();
		}
		try {
			cnx = DriverManager.getConnection(chaine, "root", "");
			System.out.println("cnx avec succ�s");
		} catch (Exception e1) {
			System.out.println("probl�me de cnx");
			e1.printStackTrace();
		}
	}
	public void ajoutEtudiant(Etudiant e) {
		
		
		try {
			st = cnx.createStatement();
			int i = st.executeUpdate("insert into Etudiant(CIN,Nom,Prenom,moyenne,note) values("+e.cne+ ",'"+e.nom+"','"+e.prenom+"',  "+e.notemoyenne +","+e.note+")");
			System.out.println("Enregistrement avec succ�s : " + i);
		} catch (SQLException e1) {
			System.out.println(" probl�me d'enregistrement ");
			e1.printStackTrace();
		}	
			
		}
	
		public void modifiernote() {
		
			int code;
			double note;
			Scanner sc = new Scanner(System.in);
			System.out.println("veulliez  saisir le code d'etudiant  ");
			code = sc.nextInt();
			System.out.println("saisir la nouvelle note  ");
			note = sc.nextDouble();
			try {
				st = cnx.createStatement();
	int i = st.executeUpdate("update etudiant set note ="  + note + "where cin="+ code );
				System.out.println("modification avec succes");						
			} catch (Exception e) {
				System.out.println("probl�me de modification ");
			}
			}
			
			public void modifiernote(String b) {
				
				int code;
				double note;
				Scanner sc = new Scanner(System.in);
				System.out.println("veulliez  saisir le code d'etudiant  ");
				//code = sc.nextInt();
				System.out.println("saisir la nouvelle note  ");
				note = sc.nextDouble();
				try {
					st = cnx.createStatement();
		int i = st.executeUpdate("update etudiant set note ="  + note + "where cin="+ b );
					System.out.println("modification avec succes");						
				} catch (Exception e) {
					System.out.println("probl�me de modification ");
				}
	}
		
		public void suprimerEtudiant() {
			int code;
			Scanner sc = new Scanner(System.in);
			System.out.println("veulliez  saisir le code d'etudiant  ");
			code = sc.nextInt();
			
			try {
				st = cnx.createStatement();
	int i = st.executeUpdate("delete from etudiant where cin="+ code );
				System.out.println("supression avec succes");						
			} catch (Exception e) {
				System.out.println("probl�me de supression ");
			}
			
		}
		public void suprimerEtudiant(String a) {
			int code;
			Scanner sc = new Scanner(System.in);
			System.out.println("veulliez  saisir le code d'etudiant  ");
			code = Integer.parseInt(a);
			
			try {
				st = cnx.createStatement();
	int i = st.executeUpdate("delete from etudiant where cin="+ code );
				System.out.println("supression avec succes");						
			} catch (Exception e) {
				System.out.println("probl�me de supression ");
			}
			
		}

}
