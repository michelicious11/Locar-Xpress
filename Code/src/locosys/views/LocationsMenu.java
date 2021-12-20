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
import locosys.controller.LocationsMenuController;

import javax.swing.JScrollPane;
import java.awt.Font;

public class LocationsMenu extends JFrame {

	private JFrame locationsMenu;

	public JFrame getLocationsMenu() {
		return locationsMenu;
	}

	public void setLocationsMenu(JFrame LocationsMenu) {
		this.locationsMenu = LocationsMenu;
	}

	private JButton addLocationBtn;
	private JButton editLocationBtn;
	private JLabel locationLbl;
	private JTable locationsTable;

	//create an object of SingleObject
	private static LocationsMenu instance = new LocationsMenu();

	//Get the only object available
	public static LocationsMenu getInstance(){
		return instance;
	}

	/**
	 * Create the application.
	 */
	public LocationsMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		locationsMenu = this; 
		locationsMenu = new JFrame();
		locationsMenu.setBounds(100, 100, 630, 495);
		locationsMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		locationsMenu.setLocationRelativeTo(null);
		locationsMenu.getContentPane().setLayout(null);

		JPanel panelLocations = new JPanel();
		panelLocations.setBackground(new Color(112,146,190));
		panelLocations.setBounds(0, 0, 616, 458);
		locationsMenu.getContentPane().add(panelLocations);
		panelLocations.setLayout(null);

		locationLbl = new JLabel("Locations");
		locationLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		locationLbl.setBounds(67, 10, 135, 32);
		panelLocations.add(locationLbl);

		JScrollPane locationScrollPane = new JScrollPane(locationsTable);
		locationScrollPane.setBounds(67, 52, 479, 303);
		panelLocations.add(locationScrollPane);

		locationsTable = new JTable();
		LocationsMenuController.loadLocationsTable(locationsTable);
		locationScrollPane.setViewportView(locationsTable);
		
		addLocationBtn = new JButton("Ajouter");
		addLocationBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LocationAjout locationAjout = LocationAjout.getInstance(locationsTable);
				locationAjout.getLocationAjout().setVisible(true);		
			}
		});
		addLocationBtn.setBounds(145, 392, 147, 41);
		panelLocations.add(addLocationBtn);

		editLocationBtn = new JButton("Modifier");
		editLocationBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LocationEdit locationEdit = LocationEdit.getInstance(locationsTable);
				locationEdit.getLocationEdit().setVisible(true);	
			}
		});
		editLocationBtn.setBounds(320, 392, 147, 41);
		panelLocations.add(editLocationBtn);
	}
}

