package locosys.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTable;

import locosys.models.Client;
import locosys.models.Employe;
import net.proteanit.sql.DbUtils;

public class ClientAjoutController {
	private static String url = "jdbc:sqlite:locosys.db";

	public static int getNbrClient() {
		String query = "SELECT *  FROM Client";

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
	
	public static void ajouterClientTable(Client cli, JTable tableCli) {
		String query = "INSERT INTO Employe ('prenom', 'nom', 'telephone', 'courriel') "
						+ "VALUES ('" + cli.getPrenom() + "', '" + cli.getNom() 
						+ "', '" + cli.getTelephone() + "', '"  + "');";
		String query2 = "SELECT * FROM Client";
			
		try(Connection conn = DriverManager.getConnection(url)) {
			Statement stmt = conn.createStatement();
			int rv = stmt.executeUpdate(query);
			ResultSet rs = stmt.executeQuery(query2);
			tableCli.setModel(DbUtils.resultSetToTableModel(rs));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
