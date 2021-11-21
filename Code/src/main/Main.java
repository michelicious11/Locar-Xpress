package main;

import java.awt.EventQueue;
import locosys.controller.AppLoginController;
import locosys.views.UserPages;

public class Main {

	/**
	 * Create the database.
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
<<<<<<< HEAD:Code/src/main/Main.java
		// Only need to be run once
		//ConnectionBD.createNewDatabase("locosys.db");
		//ConnectionBD.insertIntoDB();
		
=======
		//System.out.println(ConnectionBD.readDB());
>>>>>>> main:Code/src/main/main.java
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppLogin window = new AppLogin();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}    
}
