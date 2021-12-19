package locosys.controller;

import main.ConnectionBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JTable;

import locosys.models.ContratLocation;
import locosys.models.Employe;
import main.ConnectionBD;
import net.proteanit.sql.DbUtils;

public class FormulaireDepartController {
	private static String url = "jdbc:sqlite:locosys.db";

	public static ContratLocation trouveLocation(String telephone) {
		String query= "SELECT * FROM Contrat WHERE ID = " + telephone + ";";; 
		ContratLocation contrat = null;
		
		try(Connection conn = DriverManager.getConnection(url)) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				contrat = new ContratLocation(rs.getInt("contratID"),  rs.getInt("clientID"), rs.getInt("vehiculeID"), 
						rs.getDate("dateHeureDepart"), rs.getDate("dateHeureRetour"),
						rs.getInt("assurances"), rs.getInt("usureJournalier"),rs.getInt("paiementCredit"));
			}
			return contrat;
		}catch(Exception e){
			e.printStackTrace();
		}
		return contrat;
	}
}
