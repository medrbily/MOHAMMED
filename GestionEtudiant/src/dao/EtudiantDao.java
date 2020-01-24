package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Entities.Etudiant;

  public class EtudiantDao {
	
	Connection cnx; //créer une cnx (lien) ver une base de données
	
	Statement st; // pour envoyer et exécuter des requeteq sql
	 
	ResultSet rsq; // récuperation des Rst
	
	public EtudiantDao() {
String chaine = "jdbc:mysql://localhost:3306/gestionetudiant";
	

		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("chargement avec succés");
		}catch (ClassNotFoundException e1) {
			System.out.println("probléme driver");
			e1.printStackTrace();
		}
		try {
			cnx = DriverManager.getConnection(chaine, "root", "");
			System.out.println("cnx avec succés");
		} catch (Exception e1) {
			System.out.println("probléme de cnx");
			e1.printStackTrace();
		}
	}
	public void ajoutEtudiant(Etudiant e) {
		
		
		try {
			st = cnx.createStatement();
			int i = st.executeUpdate("insert into Etudiant(CIN,Nom,Prenom,moyenne,note) values("+e.cne+ ",'"+e.nom+"','"+e.prenom+"',  "+e.notemoyenne +","+e.note+")");
			System.out.println("Enregistrement avec succés : " + i);
		} catch (SQLException e1) {
			System.out.println(" probléme d'enregistrement ");
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
				System.out.println("probléme de modification ");
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
					System.out.println("probléme de modification ");
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
				System.out.println("probléme de supression ");
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
				System.out.println("probléme de supression ");
			}
			
		}

}
