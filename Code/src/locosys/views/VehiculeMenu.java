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
import locosys.controller.VehiculeMenuController;

import javax.swing.JScrollPane;
import java.awt.Font;

public class VehiculeMenu extends JFrame {

	private JFrame vehiculeMenu;

	public JFrame getVehiculeMenu() {
		return vehiculeMenu;
	}

	public void setVehiculeMenu(JFrame vehiculeMenu) {
		this.vehiculeMenu = vehiculeMenu;
	}

	private JButton addVehiculeBtn;
	private JButton editVehiculeBtn;
	private JLabel vehiculeLbl;
	private JTable vehiculeTable;

	//create an object of SingleObject
	private static VehiculeMenu instance = new VehiculeMenu();

	//Get the only object available
	public static VehiculeMenu getInstance(){
		return instance;
	}

	/**
	 * Create the application.
	 */
	public VehiculeMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		vehiculeMenu = this; 
		vehiculeMenu = new JFrame();
		vehiculeMenu.setBounds(100, 100, 630, 495);
		vehiculeMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		vehiculeMenu.setLocationRelativeTo(null);
		vehiculeMenu.getContentPane().setLayout(null);

		JPanel panelVehicule = new JPanel();
		panelVehicule.setBackground(new Color(112,146,190));
		panelVehicule.setBounds(0, 0, 616, 458);
		vehiculeMenu.getContentPane().add(panelVehicule);
		panelVehicule.setLayout(null);

		vehiculeLbl = new JLabel("Clients");
		vehiculeLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		vehiculeLbl.setBounds(67, 10, 135, 32);
		panelVehicule.add(vehiculeLbl);

		JScrollPane vehiculeScrollPane = new JScrollPane(vehiculeTable);
		vehiculeScrollPane.setBounds(67, 52, 479, 303);
		panelVehicule.add(vehiculeScrollPane);

		vehiculeTable = new JTable();
		VehiculeMenuController.loadVehiculeTable(vehiculeTable);
		vehiculeScrollPane.setViewportView(vehiculeTable);
		
		addVehiculeBtn = new JButton("Ajouter");
		addVehiculeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ClientAjout vehiculeAjout = ClientAjout.getInstance(vehiculeTable);
				vehiculeAjout.getClientAjout().setVisible(true);		
			}
		});
		addVehiculeBtn.setBounds(145, 392, 147, 41);
		panelVehicule.add(addVehiculeBtn);

		editVehiculeBtn = new JButton("Modifier");
		editVehiculeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VehiculeEdit vehiculeEdit = VehiculeEdit.getInstance(vehiculeTable);
				vehiculeEdit.getVehiculeEdit().setVisible(true);	
			}
		});
		editVehiculeBtn.setBounds(320, 392, 147, 41);
		panelVehicule.add(editVehiculeBtn);
	}
}

