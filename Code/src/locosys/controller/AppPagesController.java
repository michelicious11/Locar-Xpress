package locosys.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AppPagesController {
	private static String [] users = new String[99]; 
	private static String url = "jdbc:sqlite:locosys.db";
	
	
	//methode pour verifier si le nom utilisateur et le mot de passe match avec l'information de la base de donnees
	public static String afficherBienvenuePrenomEmploye(int noEmploye) {
		String query = "SELECT * FROM Employe WHERE idEmploye = '" +  noEmploye + "'";

		try(Connection conn = DriverManager.getConnection(url)) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			return rs.getString("prenom");
		}catch(Exception e){
			e.printStackTrace();
		}
		return "";
	}
}
