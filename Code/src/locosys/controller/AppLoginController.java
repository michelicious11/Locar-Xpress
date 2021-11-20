package locosys.controller;

import main.ConnectionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppLoginController {
	private static String [] users = new String[99]; 
	private static String url = "jdbc:sqlite:locosys.db";

	//methode pour verifier si le nom utilisateur et le mot de passe match avec l'information de la base de donnees
	public static boolean usernamePasswordCheck(String nomUtilisateurInput, String motDePasseInput) {
		String query = "SELECT * FROM Utilisateur WHERE nomUtilisateur = '" +  nomUtilisateurInput 
				+ "' and motDePAsse = '" + motDePasseInput + "'"; 

		try(Connection conn = DriverManager.getConnection(url)) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			return rs.next();
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	//methode pour avoir le type d'utilisateur (1 pour user, 2 pour superuser et 3 pour admin)
	public static int getTypeUtilisateur(String nomUtilisateurInput, String motDePasseInput) {

		if(usernamePasswordCheck(nomUtilisateurInput, motDePasseInput)) {
			String query = "SELECT idTypeUtilisateur FROM Utilisateur WHERE nomUtilisateur = '" +  nomUtilisateurInput + "'";

			try(Connection conn = DriverManager.getConnection(url)) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				return rs.getInt("idTypeUtilisateur");

			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return 0;
	}
}
