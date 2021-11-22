package main;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class ConnectionBD {

	//nom de la db
	private String fileName;
	private String commands; 
	private static String url = "jdbc:sqlite:";

	//relative path pour que ca fonctionne sur la plupart des ordis (a voir si on peut faire mieux)
	private static String url2 = "database\\sqlBrowserLocarXpress.sql";

	//private static Connection conn;
	//private static Statement stmt; 

	public static String getUrl3() {
		return url2;
	}


	public static void setUrl3(String url3) {
		ConnectionBD.url2 = url3;
	}


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
		
		String commands;
		String commandsFinal= ""; 
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream inputstream = classloader.getResourceAsStream(url2);
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(inputstream, StandardCharsets.UTF_8));


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
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(readDB());
			System.out.println("ca mooorche");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Getters a
	 * */
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getCommands() {
		return commands;
	}

	public void setCommands(String commands) {
		this.commands = commands;
	}

	public static String getUrl() {
		return url;
	}

	public static void setUrl(String url) {
		ConnectionBD.url = url;
	}

	public static String getUrl2() {
		return url2;
	}

	public static void setUrl2(String url2) {
		ConnectionBD.url2 = url2;
	}

}
