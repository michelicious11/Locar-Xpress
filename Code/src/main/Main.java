package main;

import java.awt.EventQueue;
import locosys.controller.AppLoginController;
import locosys.views.AppLogin;
import locosys.views.UserPages;

public class Main {

	/**
	 * Create the database.
	 * Launch the application.
	 */
	public static void main(String[] args) {	

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
