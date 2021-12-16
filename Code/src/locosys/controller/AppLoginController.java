package locosys.controller;

import main.ConnectionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;

import locosys.views.AdminPages;
import locosys.views.SuperuserPages;
import locosys.views.UserPages;


	/*
	 * Controller de la vue AppLogin
	 * 
	 * */
	

public class AppLoginController {
	private static String [] users = new String[99]; 
	private static String url = "jdbc:sqlite:locosys.db";

	//methode pour verifier si le nom utilisateur et le mot de passe match avec l'information de la base de donnees
	public static boolean authentification(String nomUtilisateurInput, String motDePasseInput) {
		String query = "SELECT * FROM Utilisateur WHERE nomUtilisateur = '" +  nomUtilisateurInput 
				+ "' and motDePasse = '" + motDePasseInput + "'"; 

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

		if(authentification(nomUtilisateurInput, motDePasseInput)) {
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
	
	//methode pour avoir le No employe grace a son nom d'utilisateur et son mot de passe
	public static int getNoEmploye(String nomUtilisateurInput, String motDePasseInput) {

		if(authentification(nomUtilisateurInput, motDePasseInput)) {
			String query = "SELECT idEmploye FROM Utilisateur WHERE nomUtilisateur = '" +  nomUtilisateurInput + "'";

			try(Connection conn = DriverManager.getConnection(url)) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				return rs.getInt("idEmploye");

			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return 0;
	}
	
	//methode pour afficher le nom de l'employe lors de la connexion
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
	
	//methode pour faire l'autorisation d'acces ((1 pour user, 2 pour superuser et 3 pour admin)
	public static void authorizationMethod(String username, String password, String prenomEmploye, JFrame frame) {
		switch(AppLoginController.getTypeUtilisateur(username, password)) {
		case 1:
			UserPages userPages = new UserPages(); 
			userPages.setVisible(true);
			userPages.setWelcomeText("Bienvenue, " + prenomEmploye, userPages.getWelcomeLbl());
			frame.dispose(); 
			System.out.println("user");
			break;
		case 2:
			SuperuserPages superuserPages = new SuperuserPages();
			superuserPages.setWelcomeText("Bienvenue, " + prenomEmploye, superuserPages.getWelcomeLbl());
			superuserPages.setVisible(true);
			frame.dispose(); 
			System.out.println("superuser");
			break;
		case 3:
			AdminPages adminPages = new AdminPages();
			adminPages.setWelcomeText("Bienvenue, " + prenomEmploye, adminPages.getWelcomeLbl());
			adminPages.setVisible(true);
			frame.dispose(); 
			System.out.println("admin");
			break; 
		default:
			System.out.println("erreur");
		}
	}
	
	
}
