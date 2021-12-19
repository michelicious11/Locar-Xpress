package locosys.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JSeparator;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.toedter.calendar.JDateChooser;

import locosys.controller.AppPagesController;


public class AdminPages extends JFrame {

	//Tables des cards (gestion en a pas)
	private JTable locationsTable;
	private JTable clientsTable;
	private JTable vehiculesTable;
	private JTable usersTable;
	private JLabel welcomeLbl;

	public JLabel getWelcomeLbl() {
		return welcomeLbl;
	}

	public void setWelcomeLbl(JLabel label, String welcomeLblText) {
		label.setText(welcomeLblText);
	}

	private JFrame adminPages; 

	public void setWelcomeText(String welcomeText, JLabel label){
		label.setText(welcomeText);
	}


	/**
	 * Create the frame.
	 * @param frame 
	 */
	public AdminPages() {
		adminPages = this; //pour que this soit l'instance de adminPages
		adminPages.setTitle("Administrateur");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 602);
		getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);


		/**
		 * Les elements des cartes
		 * */

		final JLayeredPane pnlCards = new JLayeredPane();
		pnlCards.setBounds(222, 79, 579, 399);
		getContentPane().add(pnlCards);
		pnlCards.setLayout(null);

		//card 1 (tableau de bord)
		final JPanel dashTab = new JPanel();
		dashTab.setBounds(0, 0, 579, 399);
		dashTab.setBackground(new Color(112,146,190));
		pnlCards.add(dashTab);
		dashTab.setLayout(null);

		locationsTable = new JTable();
		AppPagesController.loadLocationTable(locationsTable);

		JScrollPane locationsScrollPane = new JScrollPane(locationsTable);
		locationsScrollPane.setBounds(23, 85, 530, 302);
		dashTab.add(locationsScrollPane);

		JLabel dashLbl = new JLabel("Tableau de bord");
		dashLbl.setFont(new Font("Dialog", Font.BOLD, 15));
		dashLbl.setBounds(23, -12, 171, 49);
		dashTab.add(dashLbl);

		JSeparator separatorDash = new JSeparator();
		separatorDash.setBounds(23, 28, 139, 14);
		dashTab.add(separatorDash);
		
		JButton btnMenuLocations = new JButton("Menu locations");
		btnMenuLocations.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnMenuLocations.setBounds(340, 28, 213, 35);
		dashTab.add(btnMenuLocations);
		
		//card 2 (clients)		
		final JPanel clientsTab = new JPanel();
		clientsTab.setVisible(false);
		clientsTab.setBounds(0, 0, 579, 399);
		clientsTab.setBackground(new Color(112,146,190));
		pnlCards.add(clientsTab);
		clientsTab.setLayout(null);

		JLabel clientsLbl = new JLabel("Clients");
		clientsLbl.setBounds(22, 0, 101, 32);
		clientsLbl.setFont(new Font("Dialog", Font.BOLD, 16));
		clientsTab.add(clientsLbl);

		JScrollPane clientsScrollPane = new JScrollPane((Component) null);
		clientsScrollPane.setBounds(12, 83, 550, 286);
		clientsTab.add(clientsScrollPane);

		clientsTable = new JTable();
		AppPagesController.loadClientsTable(clientsTable);
		clientsScrollPane.setViewportView(clientsTable);

		JSeparator separatorClients = new JSeparator();
		separatorClients.setBounds(22, 31, 127, 16);
		clientsTab.add(separatorClients);

		JButton clientsMenuBtn = new JButton("Menu clients");
		clientsMenuBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		clientsMenuBtn.setBounds(349, 31, 213, 35);
		
		//card 3 (vehicules)
		final JPanel vehiculesTab = new JPanel();
		vehiculesTab.setVisible(false);
		clientsTab.add(clientsMenuBtn);
		vehiculesTab.setBounds(0, 0, 579, 399);
		vehiculesTab.setBackground(new Color(112,146,190));
		pnlCards.add(vehiculesTab);
		vehiculesTab.setLayout(null);

		JScrollPane vehiculesScrollPane = new JScrollPane(vehiculesTable);
		vehiculesScrollPane.setBounds(23, 85, 530, 302);
		vehiculesTab.add(vehiculesScrollPane);

		vehiculesTable = new JTable();
		AppPagesController.loadVehiculesTable(vehiculesTable);
		vehiculesScrollPane.setViewportView(vehiculesTable);

		JLabel vehiculesLbl = new JLabel("Vehicules");
		vehiculesLbl.setFont(new Font("Dialog", Font.BOLD, 15));
		vehiculesLbl.setBounds(23, -12, 171, 49);
		vehiculesTab.add(vehiculesLbl);

		JSeparator separatorVehicules = new JSeparator();
		separatorVehicules.setBounds(23, 28, 139, 14);
		vehiculesTab.add(separatorVehicules);
		
		JButton btnMenuVehicules = new JButton("Menu vehicules");
		btnMenuVehicules.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnMenuVehicules.setBounds(340, 26, 213, 35);
		vehiculesTab.add(btnMenuVehicules);

		vehiculesTable = new JTable();
		AppPagesController.loadVehiculesTable(vehiculesTable);
		vehiculesScrollPane.setViewportView(vehiculesTable);
		
		//card 4 (utilisateurs)
		final JPanel usersTab = new JPanel();
		usersTab.setVisible(false);
		usersTab.setBounds(0, 0, 579, 399);
		usersTab.setBackground(new Color(112,146,190));
		pnlCards.add(usersTab);
		usersTab.setLayout(null);

		JScrollPane usersScrollPane = new JScrollPane(usersTable);
		usersScrollPane.setBounds(23, 85, 530, 302);
		usersTab.add(usersScrollPane);

		usersTable = new JTable();
		AppPagesController.loadUsersTable(usersTable);
		usersScrollPane.setViewportView(usersTable);

		JLabel usersLbl = new JLabel("Utilisateurs");
		usersLbl.setFont(new Font("Dialog", Font.BOLD, 15));
		usersLbl.setBounds(23, -12, 171, 49);
		usersTab.add(usersLbl);

		JSeparator separatorUsers = new JSeparator();
		separatorUsers.setBounds(23, 28, 139, 14);
		usersTab.add(separatorUsers);

		JButton utilisateursMenuBtn = new JButton("Menu utilisateurs");
		utilisateursMenuBtn.setBounds(340, 28, 213, 35);
		usersTab.add(utilisateursMenuBtn);
		
		//card 5 (gestion)
		final JPanel gestionTab = new JPanel();
		gestionTab.setVisible(false);
		
		gestionTab.setBounds(0, 0, 579, 399);
		gestionTab.setBackground(new Color(112,146,190));
		pnlCards.add(gestionTab);
		gestionTab.setLayout(null);

		JPanel panelCentreGestion = new JPanel();
		panelCentreGestion.setBounds(70, 60, 410, 286);
		panelCentreGestion.setBackground(new Color(1, 50, 62));
		gestionTab.add(panelCentreGestion);
		panelCentreGestion.setLayout(null);
		
		JButton modalitesLocationGestionBtn = new JButton("Modalites de location");
        modalitesLocationGestionBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ModalitesLocationGestionPage modalitesPage = ModalitesLocationGestionPage.getInstance();
                modalitesPage.getModalitesLocationGestionPage().setVisible(true); 
            }
        });
		modalitesLocationGestionBtn.setBounds(100, 23, 205, 50);
		panelCentreGestion.add(modalitesLocationGestionBtn);

		JButton employesGestionBtn = new JButton("Employes");
		employesGestionBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EmployeGestionPage employePage = EmployeGestionPage.getInstance();
				employePage.getEmployeGestionPage().setVisible(true); 
			}
		});
		employesGestionBtn.setBounds(100, 85, 205, 50);
		panelCentreGestion.add(employesGestionBtn);

		JButton rapportsGestionBtn = new JButton("Rapports");
	
		rapportsGestionBtn.setBounds(100, 147, 205, 50);
		panelCentreGestion.add(rapportsGestionBtn);

		
		
		JButton soumissionGestionBtn = new JButton("Soumissions");
		soumissionGestionBtn.setBounds(100, 209, 205, 50);
		panelCentreGestion.add(soumissionGestionBtn);

		JLabel gestionLbl = new JLabel("Gestion");
		gestionLbl.setFont(new Font("Dialog", Font.BOLD, 15));
		gestionLbl.setBounds(12, 0, 171, 49);
		gestionTab.add(gestionLbl);

		JSeparator separatorGestion = new JSeparator();
		separatorGestion.setBounds(12, 34, 139, 14);
		gestionTab.add(separatorGestion);


		/**
		 * Les elements du panel du dessus
		 * */

		JPanel topBar = new JPanel();
		topBar.setBounds(222, 0, 579, 80);
		topBar.setBackground(new Color(112,146,190));
		getContentPane().add(topBar);
		topBar.setLayout(null);

		JButton reservationBtn = new JButton("Reservation");
		reservationBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FormulaireDepart formulaireDepart = FormulaireDepart.getInstance();
				formulaireDepart.getFormulaireDepart();			}
		});
		reservationBtn.setForeground(new Color(240, 248, 255));
		reservationBtn.setBackground(new Color(6,62,125));
		reservationBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		reservationBtn.setBounds(31, 24, 115, 44);
		topBar.add(reservationBtn);
		
		JButton cueilletteBtn = new JButton("Cueillette");
		cueilletteBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Cueillette form");
			}
		});
		cueilletteBtn.setForeground(new Color(240, 248, 255));
		cueilletteBtn.setBackground(new Color(6,62,125));
		cueilletteBtn.setBounds(158, 24, 99, 44);
		topBar.add(cueilletteBtn);

		JButton retourBtn = new JButton("Retour");
		retourBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FormulaireRetour formulaireRetour = FormulaireRetour.getInstance();
				formulaireRetour.getFormulaireRetour();			}
		});
		retourBtn.setForeground(new Color(240, 248, 255));
		retourBtn.setBackground(new Color(6,62,125));
		retourBtn.setBounds(269, 24, 99, 44);
		topBar.add(retourBtn);

		welcomeLbl = new JLabel("TEST");
		welcomeLbl.setFont(new Font("Tahoma", Font.BOLD, 12));
		welcomeLbl.setBounds(417, 0, 149, 32);
		topBar.add(welcomeLbl);

		/**
		 * Les elements du panel du dessous
		 * */

		JPanel bottomBar = new JPanel();
		bottomBar.setBackground(new Color(112,146,190));
		bottomBar.setBounds(222, 475, 579, 90);
		getContentPane().add(bottomBar);
		bottomBar.setLayout(null);

		JLabel logoutLbl = new JLabel("");
		logoutLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AppLogin login = new AppLogin(); //pour l'instant il n'a que admin
				login.getFrame().setVisible(true);	
				adminPages.dispose();
			}
		});
		logoutLbl.setIcon(new ImageIcon(UserPages.class.getResource("/images/logout-small.jpg")));
		logoutLbl.setBounds(511, 24, 56, 54);
		bottomBar.add(logoutLbl);

		/**
		 * Les elements du panel du cote
		 * */

		JPanel sideBar = new JPanel();
		sideBar.setBounds(0, 0, 226, 565);
		getContentPane().add(sideBar);
		sideBar.setBackground(new Color(1, 50, 62));
		sideBar.setLayout(null);

		JButton gestionBtn = new JButton("Gestion");
		gestionBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gestionTab.setVisible(true);
				pnlCards.removeAll(); 
				pnlCards.add(gestionTab);
				pnlCards.repaint();
				pnlCards.revalidate(); 
			}
		});

		gestionBtn.setBounds(49, 453, 130, 40);
		sideBar.add(gestionBtn);

		JButton usersBtn = new JButton("Utilisateurs");
		usersBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				usersTab.setVisible(true);
				pnlCards.removeAll(); 
				pnlCards.add(usersTab);
				pnlCards.repaint();
				pnlCards.revalidate(); 
			}
		});
		usersBtn.setBounds(49, 375, 130, 40);
		sideBar.add(usersBtn);

		JButton vehiculesBtn = new JButton("Vehicules");
		vehiculesBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		vehiculesBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				vehiculesTab.setVisible(true);
				pnlCards.removeAll(); 
				pnlCards.add(vehiculesTab);
				pnlCards.repaint();
				pnlCards.revalidate(); 
			}
		});
		vehiculesBtn.setBounds(49, 300, 130, 40);
		sideBar.add(vehiculesBtn);

		JButton clientsBtn = new JButton("Clients");
		clientsBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clientsTab.setVisible(true);
				pnlCards.removeAll(); 
				pnlCards.add(clientsTab);
				pnlCards.repaint();
				pnlCards.revalidate(); 
			}
		});
		clientsBtn.setBounds(49, 223, 130, 40);
		sideBar.add(clientsBtn);

		JButton dashBtn = new JButton("Tableau de bord");
		dashBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnlCards.removeAll(); 
				pnlCards.add(dashTab);
				pnlCards.repaint();
				pnlCards.revalidate(); 
			}
		});
		dashBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dashBtn.setBounds(49, 147, 130, 40);
		sideBar.add(dashBtn);

		JLabel logoLbl = new JLabel("");
		logoLbl.setIcon(new ImageIcon(UserPages.class.getResource("/images/logoSmall.png")));
		logoLbl.setBounds(0, 0, 179, 134);
		sideBar.add(logoLbl);
	}
}
