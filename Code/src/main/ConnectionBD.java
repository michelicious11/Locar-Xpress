package main;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionBD {
	
	//nom de la db
	private String fileName; 

    /**
     * Connect to a sample database (create one if it doesnt exist)
     *
     */
    public static void createNewDatabase(String fileName) {

        String url = "jdbc:sqlite:resources:database" + fileName;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("A new database has been created.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}