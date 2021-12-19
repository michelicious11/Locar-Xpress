package locosys.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class EmployeGestionPageController {

	private static String url = "jdbc:sqlite:locosys.db";


	//methode pour avoir le type d'utilisateur (1 pour user, 2 pour superuser et 3 pour admin)
	public static String [] getPrixContrat(String nomDeLaTable, String nomAttribut) {
		String [] temp = new String [5];
		int compteur = 0;
		try {
			String query = "SELECT " + nomAttribut + ", idTypeVehicule"
					     + " FROM " + nomDeLaTable;

			try(Connection conn = DriverManager.getConnection(url)) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				temp[compteur++] = rs.getString(compteur);
				if (!rs.next() ) {
				    System.out.println("Aucune donnée");
				} else {
					while (rs.next()) {
				    	temp[compteur++] = rs.getString(nomAttribut);
				    	System.out.println(rs.getString(nomAttribut));
					}
				}
				return temp;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
