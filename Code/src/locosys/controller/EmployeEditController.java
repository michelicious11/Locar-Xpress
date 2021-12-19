package locosys.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import locosys.models.Employe;
import net.proteanit.sql.DbUtils;

public class EmployeEditController {
	private static String url = "jdbc:sqlite:locosys.db";
	
	
	public static Employe convert2EmployeObject(int employeID) {
		String query = "SELECT idEmploye, prenom, nom, telephone, courriel "
				+ "FROM Employe WHERE idEmploye = " + employeID;
		Employe employe = null;
		
		try(Connection conn = DriverManager.getConnection(url)) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println(rs);
			while(rs.next()) {
				employe = new Employe(Integer.parseInt(rs.getString("idEmploye")), rs.getString("prenom"), 
						rs.getString("nom"), rs.getString("telephone"), rs.getString("courriel"));
				System.out.println(employe.getPrenom());
				return employe;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return employe;
	}

	
	public static void modifierEmployeTable(Employe emp, JTable tableEmp) {
		String query = "UPDATE Employe SET prenom = 'tst" + emp.getPrenom()
						+ "', nom = '" +  emp.getNom()
						+ "', telephone = '" + emp.getTelephone()
						+ "', courriel = '" + emp.getCourriel() + "'"
						+ " WHERE idEmploye = " + emp.getEmployeID() + ";";
		String query2 = "SELECT * FROM Employe";
			
		try(Connection conn = DriverManager.getConnection(url)) {
			Statement stmt = conn.createStatement();
			int rv = stmt.executeUpdate(query);
			ResultSet rs = stmt.executeQuery(query2);
			tableEmp.setModel(DbUtils.resultSetToTableModel(rs));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void supprimerEmployeTable(Employe emp, JTable tableEmp) {
		String query = "DELETE FROM Employe WHERE idEmploye = " + "'" +emp.getEmployeID() + "';";
		String query2 = "SELECT * FROM Employe";
			
		try(Connection conn = DriverManager.getConnection(url)) {
			Statement stmt = conn.createStatement();
			int rv = stmt.executeUpdate(query);
			ResultSet rs = stmt.executeQuery(query2);
			tableEmp.setModel(DbUtils.resultSetToTableModel(rs));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}

