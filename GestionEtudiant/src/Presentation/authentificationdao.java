package Presentation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class authentificationdao {
	
	

	Connection cnx; //créer une cnx (lien) ver une base de données
	
	Statement st; // pour envoyer et exécuter des requetes sql
	 
	ResultSet rsq; // récuperation des Rst
	
	public authentificationdao() {
String chaine = "jdbc:mysql://localhost:3306/user";
	

		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("chargement avec succés");
		}
		catch (ClassNotFoundException e1) {
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
	
	boolean login(String logn, String pw)
	
	{boolean t = false;
		try {
		
			st = cnx.createStatement();
			rsq = st.executeQuery("select password from test where login = '"+ logn +"' ");
			while (rsq.next()) {
			
			if (pw.equals(rsq.getString("password"))) {
				System.out.println("votre mot de pass est correcte");
			t =  true;
			
			
			}
			else 
			{
				System.out.println("votre mot de pass est incorrecte");
				t=  false;
			}
				
			} 
		}
			catch (SQLException e) {
			// 
			e.printStackTrace();
			
			t=  false;
		}
		
		
		
		
		return t; 
	}
	
	//Methode qui retourne un mot de passe par rapport à un login  
	

}
