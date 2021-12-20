package locosys.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import locosys.controller.AppPagesController;
import locosys.controller.ClientMenuController;

import javax.swing.JScrollPane;
import java.awt.Font;

public class ClientMenu extends JFrame {

	private JFrame clientMenu;

	public JFrame getClientMenu() {
		return clientMenu;
	}

	public void setClientMenu(JFrame clientMenu) {
		this.clientMenu = clientMenu;
	}

	private JButton addClientBtn;
	private JButton editClienBtn;
	private JLabel clientLbl;
	private JTable clientTable;

	//create an object of SingleObject
	private static VehiculeMenu instance = new VehiculeMenu();

	//Get the only object available
	public static VehiculeMenu getInstance(){
		return instance;
	}

	/**
	 * Create the application.
	 */
	public ClientMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		clientMenu = this; 
		clientMenu = new JFrame();
		clientMenu.setBounds(100, 100, 630, 495);
		clientMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		clientMenu.setLocationRelativeTo(null);
		clientMenu.getContentPane().setLayout(null);

		JPanel panelClients = new JPanel();
		panelClients.setBackground(new Color(112,146,190));
		panelClients.setBounds(0, 0, 616, 458);
		clientMenu.getContentPane().add(panelClients);
		panelClients.setLayout(null);

		clientLbl = new JLabel("Clients");
		clientLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		clientLbl.setBounds(67, 10, 135, 32);
		panelClients.add(clientLbl);

		JScrollPane clientScrollPane = new JScrollPane(clientTable);
		clientScrollPane.setBounds(67, 52, 479, 303);
		panelClients.add(clientScrollPane);

		clientTable = new JTable();
		ClientMenuController.loadClientTable(clientTable);
		clientScrollPane.setViewportView(clientTable);
		
		addClientBtn = new JButton("Ajouter");
		addClientBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ClientAjout clientAjout = ClientAjout.getInstance(clientTable);
				clientAjout.getClientAjout().setVisible(true);		
			}
		});
		addClientBtn.setBounds(145, 392, 147, 41);
		panelClients.add(addClientBtn);

		editClienBtn = new JButton("Modifier");
		editClienBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ClientEdit clientEdit = ClientEdit.getInstance(clientTable);
				clientEdit.getEmployeEdit().setVisible(true);	
			}
		});
		editClienBtn.setBounds(320, 392, 147, 41);
		panelClients.add(editClienBtn);
	}
}

