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
		
		
		//System.out.println(AppLoginController.usernamePasswordCheck("staluk", "password2"));
		//System.out.println(ConnectionBD.readDB() + ConnectionBD.getUrl2());
		//AppLoginController.getTypeUtilisateur("staluk", "password2");
		
		
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
