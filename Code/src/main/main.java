package main;

import java.awt.EventQueue;
import locosys.controller.AppLoginController;
import locosys.views.UserPages;

public class main {

	/**
	 * Create the database.
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		// Only need to be run once
		//ConnectionBD.createNewDatabase("locosys.db");
		//ConnectionBD.insertIntoDB();
		
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
