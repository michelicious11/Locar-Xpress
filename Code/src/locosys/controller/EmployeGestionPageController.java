package locosys.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class EmployeGestionPageController {

	private static String url = "jdbc:sqlite:locosys.db";


	//methode pour avoir le type d'utilisateur (1 pour user, 2 pour superuser et 3 pour admin)
	public static String getPrixContrat(String nomDeLaTable, String nomAttribut, int idRecherchee) {
		try {
			String query = "SELECT " + nomAttribut + ", idTypeVehicule"
					     + " FROM " + nomDeLaTable 
					     + " WHERE " + "idTypeVehicule" + " = " +  idRecherchee;

			try(Connection conn = DriverManager.getConnection(url)) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				System.out.println(rs.getString(idRecherchee));
				return rs.getString(idRecherchee);
			} catch (Exception e){
				e.printStackTrace();
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return "Erreur";
	}
}
