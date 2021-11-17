package locosys.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminPages extends JFrame {

	private JTable locationsTable;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPages frame = new AdminPages();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminPages() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 602);
		getContentPane().setLayout(null);
		
		/**
		 * Les elements des cartes
		 * */
		
		JLayeredPane pnlCards = new JLayeredPane();
		pnlCards.setBounds(222, 79, 579, 399);
		getContentPane().add(pnlCards);
		pnlCards.setLayout(null);
		
		//card 1 (tableau de bord)
		JPanel dashTab = new JPanel();
		dashTab.setBounds(0, 0, 579, 399);
		dashTab.setBackground(new Color(112,146,190));
		pnlCards.add(dashTab);
		dashTab.setLayout(null);
		
		locationsTable = new JTable();
		locationsTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"No Client", "No Vehicule", "Date depart", "Date retour", "Actions"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		locationsTable.getColumnModel().getColumn(0).setPreferredWidth(60);
		locationsTable.getColumnModel().getColumn(0).setMinWidth(20);
		locationsTable.getColumnModel().getColumn(1).setPreferredWidth(68);
		locationsTable.getColumnModel().getColumn(1).setMinWidth(20);
		locationsTable.getColumnModel().getColumn(2).setPreferredWidth(80);
		locationsTable.getColumnModel().getColumn(2).setMinWidth(20);
		locationsTable.getColumnModel().getColumn(3).setPreferredWidth(80);
		locationsTable.getColumnModel().getColumn(3).setMinWidth(20);
		locationsTable.getColumnModel().getColumn(4).setPreferredWidth(80);
		locationsTable.getColumnModel().getColumn(4).setMinWidth(20);
		locationsTable.setBounds(47, 109, 466, 251);
		
		
		JScrollPane locationsScrollPane = new JScrollPane(locationsTable);
		locationsScrollPane.setBounds(23, 85, 530, 302);
		dashTab.add(locationsScrollPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(23, 49, 74, 24);
		dashTab.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(120, 49, 74, 24);
		dashTab.add(textPane_1);
		
		JDateChooser locationsDateDepart = new JDateChooser();
		locationsDateDepart.setBounds(222, 49, 95, 24);
		dashTab.add(locationsDateDepart);
		
		JDateChooser locationsDateRetour = new JDateChooser();
		locationsDateRetour.setBounds(329, 49, 99, 24);
		dashTab.add(locationsDateRetour);
		
		JButton dashAjouterBtn = new JButton("Ajouter");
		dashAjouterBtn.setBackground(new Color(34, 139, 34));
		dashAjouterBtn.setBounds(440, 49, 113, 24);
		dashTab.add(dashAjouterBtn);
		
		JLabel dashLbl = new JLabel("Tableau de bord");
		dashLbl.setFont(new Font("Dialog", Font.BOLD, 15));
		dashLbl.setBounds(23, -12, 171, 49);
		dashTab.add(dashLbl);
		
		JSeparator separatorDash = new JSeparator();
		separatorDash.setBounds(23, 28, 139, 14);
		dashTab.add(separatorDash);
		
		//card 2 (clients)		
		JPanel clientsTab = new JPanel();
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
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"No", "Prenom", "Nom", "Telephone", "Adresse", "Date naissance", "Permis", "Actions"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class, Object.class, Integer.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(34);
		table.getColumnModel().getColumn(1).setPreferredWidth(66);
		table.getColumnModel().getColumn(2).setPreferredWidth(61);
		table.getColumnModel().getColumn(3).setPreferredWidth(91);
		table.getColumnModel().getColumn(4).setPreferredWidth(108);
		table.getColumnModel().getColumn(5).setPreferredWidth(100);
		table.getColumnModel().getColumn(6).setPreferredWidth(52);
		clientsScrollPane.setViewportView(table);
		
		JSeparator separatorClients = new JSeparator();
		separatorClients.setBounds(22, 31, 127, 16);
		clientsTab.add(separatorClients);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(12, 49, 23, 22);
		clientsTab.add(textPane_2);
		
		JTextPane textPane_2_1 = new JTextPane();
		textPane_2_1.setBounds(47, 49, 54, 22);
		clientsTab.add(textPane_2_1);
		
		JTextPane textPane_2_2 = new JTextPane();
		textPane_2_2.setBounds(109, 49, 47, 22);
		clientsTab.add(textPane_2_2);
		
		JTextPane textPane_2_3 = new JTextPane();
		textPane_2_3.setBounds(163, 49, 80, 22);
		clientsTab.add(textPane_2_3);
		
		JTextPane textPane_2_4 = new JTextPane();
		textPane_2_4.setBounds(252, 49, 90, 22);
		clientsTab.add(textPane_2_4);
		
		JTextPane textPane_2_5 = new JTextPane();
		textPane_2_5.setBounds(438, 49, 36, 22);
		clientsTab.add(textPane_2_5);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(354, 48, 75, 26);
		clientsTab.add(dateChooser);
		
		JButton clientsAjouterBtn = new JButton("Ajouter");
		clientsAjouterBtn.setBackground(new Color(34, 139, 34));
		clientsAjouterBtn.setBounds(486, 48, 76, 26);
		clientsTab.add(clientsAjouterBtn);
		
		//card 3 (vehicules)
		JPanel vehiculesTab = new JPanel();
		vehiculesTab.setBounds(0, 0, 579, 399);
		vehiculesTab.setBackground(new Color(112,146,190));
		pnlCards.add(vehiculesTab);
		
		//card 4 (utilisateurs)
		JPanel usersTab = new JPanel();
		usersTab.setBounds(0, 0, 579, 399);
		usersTab.setBackground(new Color(112,146,190));
		pnlCards.add(usersTab);
		
		//card 5 (gestion)
		JPanel gestionTab = new JPanel();
		gestionTab.setBounds(0, 0, 579, 399);
		gestionTab.setBackground(new Color(112,146,190));
		pnlCards.add(gestionTab);
		
		
		/**
		 * Les elements du panel du dessus
		 * */
		
		JPanel topBar = new JPanel();
		topBar.setBounds(222, 0, 579, 80);
		topBar.setBackground(new Color(112,146,190));
		getContentPane().add(topBar);
		topBar.setLayout(null);
		
		JButton reservationBtn = new JButton("Reservation");
		reservationBtn.setForeground(new Color(240, 248, 255));
		reservationBtn.setBackground(new Color(6,62,125));
		reservationBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		reservationBtn.setBounds(31, 24, 115, 44);
		topBar.add(reservationBtn);
		
		JButton cueilletteBtn = new JButton("Cueillette");
		cueilletteBtn.setForeground(new Color(240, 248, 255));
		cueilletteBtn.setBackground(new Color(6,62,125));
		cueilletteBtn.setBounds(158, 24, 99, 44);
		topBar.add(cueilletteBtn);
		
		JButton retourBtn = new JButton("Retour");
		retourBtn.setForeground(new Color(240, 248, 255));
		retourBtn.setBackground(new Color(6,62,125));
		retourBtn.setBounds(269, 24, 99, 44);
		topBar.add(retourBtn);
		
		JLabel welcomeLbl = new JLabel("BIENVENUE, [username]");
		welcomeLbl.setBounds(384, 0, 182, 32);
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
		logoutLbl.setIcon(new ImageIcon(AdminPages.class.getResource("/images/logout-small.jpg")));
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
		gestionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		gestionBtn.setBounds(49, 453, 130, 40);
		sideBar.add(gestionBtn);
		
		JButton usersBtn = new JButton("Utilisateurs");
		usersBtn.setBounds(49, 375, 130, 40);
		sideBar.add(usersBtn);
		
		JButton vehiculesBtn = new JButton("Vehicules");
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
		logoLbl.setIcon(new ImageIcon(AdminPages.class.getResource("/images/logoSmall.png")));
		logoLbl.setBounds(0, 0, 179, 134);
		sideBar.add(logoLbl);
	}
}
