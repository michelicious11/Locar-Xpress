package main;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.io.*;


public class ConnectionBD {

	//nom de la db
	private String fileName;
	private String commands; 
	private static String url = "jdbc:sqlite:";
	static String url2 = "..\\locar-xpress\\resources\\database\\sqlBrowserLocarXpress.sql";
	//private static Connection conn;
	//private static Statement stmt; 

	/**
	 * Connects to the database (creates one in the project if it doesnt exist)
	 *
	 */
	public static void createNewDatabase(String fileName) {
		url += fileName;

		try (Connection conn = DriverManager.getConnection(url)) {
			if (conn != null) {
				System.out.println("A new database has been created.");
			}
		} catch (SQLException e) {
			e.printStackTrace();   
		}
	}

	//fonction qui retourne le fichier sql en string
	public static String readDB() {
		
		String filePath = new File("").getAbsolutePath();
		System.out.println (filePath);

		//http://stackoverflow.com/questions/2788080/reading-a-text-file-in-java    
		//http://stackoverflow.com/questions/19874066/how-to-read-text-file-relative-path
		//BufferedReader reader = new BufferedReader(new FileReader(filePath + "/src/DBTextFiles/Administrator.txt"));
		
		
		String commands;
		String commandsFinal= ""; 
		try {
			BufferedReader br = new BufferedReader(
					new FileReader(url2));


			while((commands = br.readLine()) != null) {
				commandsFinal += commands;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return commandsFinal; 
	}

	//fonction qui utilise les commandes sql en string pour run query

	public static void insertIntoDB() {

		try {
			Connection conn = DriverManager.getConnection(url);
			Statement ps = conn.createStatement();
			ps.executeUpdate(readDB());
			System.out.println("ca mooorche");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
