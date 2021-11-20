package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

import locosys.views.AdminPages;
import locosys.views.SuperuserPages;
import locosys.views.UserPages;

import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import locosys.controller.AppLoginController ;

public class AppLogin {

	private JFrame frame;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Create the login page
	 */
	public AppLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setPreferredSize(new Dimension(900, 400));
		frame.setBounds(100, 100, 760, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);

		JPanel coteGauche = new JPanel();
		coteGauche.setBounds(0, 0, 529, 330);
		coteGauche.setBackground(new Color(1, 50, 67));
		frame.getContentPane().add(coteGauche);
		coteGauche.setLayout(null);

		JPanel coteDroit = new JPanel();
		coteDroit.setBounds(526, 0, 220, 330);
		coteDroit.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(coteDroit);
		coteDroit.setLayout(null);

		JLabel usernameLbl = new JLabel("Nom d'utilisateur");
		usernameLbl.setBounds(48, 157, 96, 13);
		coteDroit.add(usernameLbl);

		JLabel passwordLbl = new JLabel("Mot de passe");
		passwordLbl.setBounds(48, 199, 91, 13);
		coteDroit.add(passwordLbl);

		JLabel logoLbl = new JLabel(" ");
		logoLbl.setIcon(new ImageIcon(UserPages.class.getResource("/images/logoXSmall.png")));
		logoLbl.setBounds(48, 0, 129, 100);
		coteDroit.add(logoLbl);

		JLabel welcomeLbl = new JLabel("Welcome, ");
		welcomeLbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		welcomeLbl.setBounds(26, 110, 118, 37);
		coteDroit.add(welcomeLbl);

		usernameField = new JTextField();
		usernameLbl.setLabelFor(usernameField);
		usernameField.setBounds(48, 170, 129, 19);
		coteDroit.add(usernameField);
		usernameField.setColumns(10);

		passwordField = new JPasswordField();
		passwordLbl.setLabelFor(passwordField);
		passwordField.setBounds(48, 212, 129, 19);
		coteDroit.add(passwordField);


		/*
		 * Ouvre la fenetre de l'application dependamment le type d'utilisateurs
		 * */
		JButton submitBtn = new JButton("Soumettre");
		submitBtn.addMouseListener(new MouseAdapter() {
			
			//utilise la fonction getTypeUtilisateur du AppLoginController pour retourner l'information de la db
			@Override
			public void mouseClicked(MouseEvent e) {
				switch(AppLoginController.getTypeUtilisateur(usernameField.getText(), passwordField.getText())) {
				case 1:
					UserPages userPages = new UserPages(); 
					userPages.setVisible(true);
					frame.dispose(); 
					System.out.println("user");
					break;
				case 2:
					SuperuserPages superuserPages = new SuperuserPages();
					superuserPages.setVisible(true);
					frame.dispose(); 
					System.out.println("superuser");
					break;
				case 3:
					AdminPages adminPages = new AdminPages(); 
					adminPages.setVisible(true);
					frame.dispose(); 
					System.out.println("admin");
					break; 
				default:
					System.out.println("erreur");
				}
				
			}
		});
		submitBtn.setBounds(58, 241, 107, 29);
		coteDroit.add(submitBtn);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
