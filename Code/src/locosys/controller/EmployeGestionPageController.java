package locosys.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import locosys.models.Employe;

import main.ConnectionBD;
import net.proteanit.sql.DbUtils;

public class EmployeGestionPageController {

	private static String url = "jdbc:sqlite:locosys.db";

	public static void ajouterEmployeTable(Employe emp) {
		String query = "INSERT INTO Employe"
						+ "VALUES ('" + emp.getEmployeID() + " , " + emp.getPrenom() + " , " + emp.getNom() 
						+ " , " + emp.getTelephone() + " , " + emp.getCourriel() + "');" ;

		try(Connection conn = DriverManager.getConnection(url)) {
			Statement stmt = conn.createStatement();
			int rv = stmt.executeUpdate(query);
			System.out.println( "1st executeUpdate() returned " + rv );
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void modifierEmployeTable(Employe emp) {
		String query = "UPDATE Employe SET "
						+ "prenom = " + emp.getPrenom() + " , " + "nom = " + emp.getNom() 
						+ " , " + "telephone = " + emp.getTelephone() + " , " + "courriel = " + emp.getCourriel() 
						+ "WHERE employeID = " + emp.getEmployeID() + "');" ;

		try(Connection conn = DriverManager.getConnection(url)) {
			Statement stmt = conn.createStatement();
			int rv = stmt.executeUpdate(query);
			System.out.println( "1st executeUpdate() returned " + rv );
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void supprimerEmployeTable(Employe emp) {
		String query = "DELETE FROM Employe WHERE employeID = " + emp.getEmployeID();

		try(Connection conn = DriverManager.getConnection(url)) {
			Statement stmt = conn.createStatement();
			int rv = stmt.executeUpdate(query);
			System.out.println( "1st executeUpdate() returned " + rv );
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
