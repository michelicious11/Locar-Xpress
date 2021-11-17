package main;

import java.sql.Statement;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.sqlite.SQLiteDataSource;

import locosys.views.AdminPages;

public class ConnectionBD {

	public static void main(String[] args) {
		SQLiteDataSource ds = null;

		try {
			getSqlCommands();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 

		try {
			ds = new SQLiteDataSource();
			ds.setUrl("jdbc:sqlite:locar-xpress.db");
		} catch ( Exception e ) {
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println( "Opened database successfully" );

		//String query = "CREATE TABLE IF NOT EXISTS userTest ( " +
		//"ID INTEGER PRIMARY KEY, "
		//	+ "NAME TEXT NOT NULL)";
		//String query2 = "INSERT INTO userTest ( NAME) VALUES " +
		//	"'Shane'";
		String query3 = "SELECT * FROM userTest";

		try ( Connection conn = ds.getConnection();
				Statement stmt = conn.createStatement();) {

			//int rv = stmt.executeUpdate(query);
			//int rv2 = stmt.executeUpdate(query2);
			ResultSet rs = stmt.executeQuery(query3);

			while ( rs.next() ) {
				int id = rs.getInt( "ID" );
				String name = rs.getString( "NAME" );

				System.out.println("Result: ID = " + id + ", NAME = " + name );
			}


		} catch ( SQLException e ) {
			e.printStackTrace();
			System.exit( 0 );
		}
 
		System.out.println( "Created database successfully" );
	}
	
	public static void getSqlCommands() throws IOException {
		URL fileContent = ConnectionBD.class.getResource("/text/sqlCommands.txt");
		//String sqlCommands = Files.readString(fileContent);
		//try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileContent))){
			
			char[] array = new char[10];
			//read into array
			//bufferedReader.read(array, 0, 5);
			for (char c : array) {
				 // if char is empty
	            if(c == (char)0) {
	               c = '*';
	            }
	            // prints characters
	            System.out.print(c);
			}
		//} catch (Exception e) {
			//e.printStackTrace();
		}
	}


//}
