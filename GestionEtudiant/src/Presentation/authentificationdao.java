package Presentation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class authentificationdao {
	
	

	Connection cnx; //cr�er une cnx (lien) ver une base de donn�es
	
	Statement st; // pour envoyer et ex�cuter des requetes sql
	 
	ResultSet rsq; // r�cuperation des Rst
	
	public authentificationdao() {
String chaine = "jdbc:mysql://localhost:3306/user";
	

		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("chargement avec succ�s");
		}
		catch (ClassNotFoundException e1) {
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
	
	//Methode qui retourne un mot de passe par rapport � un login  
	

}
