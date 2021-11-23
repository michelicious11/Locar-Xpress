package main;

import java.awt.EventQueue;
import locosys.controller.AppLoginController;
import locosys.views.AdminPages;

public class main {

	/**
	 * Create the database.
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {
			System.out.println(ConnectionBD.readDB());

		}catch(Exception e) {
			System.out.println("exception");
		}

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
