package locosys.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTable;

import locosys.models.Employe;
import net.proteanit.sql.DbUtils;

public class EmployeAjoutController {
	private static String url = "jdbc:sqlite:locosys.db";

	public static int getNbrEmploye() {
		String query = "SELECT *  FROM Employe";

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
	
	public static void ajouterEmployeTable(Employe emp, JTable tableEmp) {
		String query = "INSERT INTO Employe"
						+ "VALUES ('" + emp.getEmployeID() + " , " + emp.getPrenom() + " , " + emp.getNom() 
						+ " , " + emp.getTelephone() + " , " + emp.getCourriel() + "');" ;
		String query2 = "SELECT * FROM Employe";
			
		try(Connection conn = DriverManager.getConnection(url)) {
			Statement stmt = conn.createStatement();
			int rv = stmt.executeUpdate(query);
			ResultSet rs = stmt.executeQuery(query);
			tableEmp.setModel(DbUtils.resultSetToTableModel(rs));
			System.out.println( "1st executeUpdate() returned " + rv );
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
