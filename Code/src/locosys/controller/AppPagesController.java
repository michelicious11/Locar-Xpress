package locosys.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

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
	
	//methode pour loader la table dans le jframe du bouton employe du menu Gestion
	public static void loadEmployeeTable(JTable table) {
		String query = "SELECT * FROM Employe";

		try(Connection conn = DriverManager.getConnection(url)) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(rs));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void loadClientsTable(JTable table) {
		String query = "SELECT * FROM Client";

		try(Connection conn = DriverManager.getConnection(url)) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(rs));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void loadVehiculesTable(JTable table) {
		String query = "SELECT * FROM Vehicule";

		try(Connection conn = DriverManager.getConnection(url)) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(rs));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void loadUsersTable(JTable table) {
		String query = "SELECT * FROM Utilisateur";

		try(Connection conn = DriverManager.getConnection(url)) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(rs));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
