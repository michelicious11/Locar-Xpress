package locosys.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class LocationsMenuController {
	private static String url = "jdbc:sqlite:locosys.db";
	
	public static void loadLocationsTable(JTable table) {
		String query = "SELECT Contrat.idContrat AS 'No Contrat', Contrat.idClient AS 'No Client', Contrat.idVehicule AS 'No Vehicule', "
						+ "Contrat.dateDeDepart as 'Date Depart', Contrat.dateDeRetour as 'Date Retour' "
						+ "FROM Contrat;";

		try(Connection conn = DriverManager.getConnection(url)) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(rs));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
