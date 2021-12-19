package locosys.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTable;

import locosys.models.ContratLocation;
import locosys.models.Employe;
import net.proteanit.sql.DbUtils;

public class LocationAjoutController {
	private static String url = "jdbc:sqlite:locosys.db";

	public static int getNbrLocation() {
		String query = "SELECT *  FROM Contrat";

		try(Connection conn = DriverManager.getConnection(url)) {
			int counter = 0; 
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				counter++;
			}
			return counter;
		}catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void ajouterLocationTable(ContratLocation c, JTable tableContrat) {
		String query = "INSERT INTO Contrat ('idClient', 'idVehicule', 'dateDeDepart', 'dateDeRetour', "
				+ "		'assurance', 'forfaitUsure', 'paiementCredit') VALUES "
						+ "('" + c.getClientID() + "' , '" + c.getVehiculeID() + "' , '" + c.getDateHeureDepart()
						+ "' , '" + c.getDateHeureRetour() + "' , '" + c.isAssurances()
						+ "' , '" + c.isUsureJournalier() + "' , '" + c.isPaiementCredit() + "');";
		System.out.println(query);
		String query2 = "SELECT * FROM Contrat";
			
		try(Connection conn = DriverManager.getConnection(url)) {
			Statement stmt = conn.createStatement();
			int rv = stmt.executeUpdate(query);
			ResultSet rs = stmt.executeQuery(query2);
			tableContrat.setModel(DbUtils.resultSetToTableModel(rs));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
