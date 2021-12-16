package main;

import java.awt.EventQueue;
import locosys.views.AppLogin;


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