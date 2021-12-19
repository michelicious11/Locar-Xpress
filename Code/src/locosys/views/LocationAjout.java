package locosys.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;

import locosys.controller.ContratLocationController;
import locosys.controller.LocationAjoutController;
import locosys.models.ContratLocation;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class LocationAjout extends JFrame {

	private JTextField noVehiculeField;
	private JTextField noClientField;

	private Date dateDepart;
	private Date dateRetour;
	private boolean assurance, forfaitUsure, paiementCredit;
	private static JTable tableEmp; 

	private JFrame locationAjout;

	public JFrame getLocationAjout() {
		return locationAjout;
	}

	public void setLocationAjout(JFrame locationAjout) {
		this.locationAjout = locationAjout;
	}

	public LocationAjout(JTable tableEmp) {
		initialize();
	}

	//create an object of SingleObject
	private static LocationAjout instance = new LocationAjout(tableEmp);

	//Get the only object available
	public static LocationAjout getInstance(JTable tableEmp){
		LocationAjout.tableEmp = tableEmp; 
		return instance;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		locationAjout = this; 
		locationAjout = new JFrame();
		locationAjout.setBounds(100, 100, 391, 364);
		locationAjout.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		locationAjout.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 375, 330);
		panel.setBackground(new Color(112,146,190));;
		panel.setLayout(null);

		noVehiculeField = new JTextField();
		noVehiculeField.setBounds(160, 76, 108, 20);
		panel.add(noVehiculeField);
		noVehiculeField.setColumns(10);

		noClientField = new JTextField();
		noClientField.setBounds(160, 45, 108, 20);
		panel.add(noClientField);

		JLabel clientIDLbl = new JLabel("No Client :");
		clientIDLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		clientIDLbl.setBounds(22, 48, 108, 14);
		panel.add(clientIDLbl);

		JLabel vehiculeIDLbl = new JLabel("No Vehicule :");
		vehiculeIDLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		vehiculeIDLbl.setBounds(22, 79, 108, 14);
		panel.add(vehiculeIDLbl);

		JDateChooser dateDepartChooser = new JDateChooser();
		dateDepartChooser.setBounds(160, 107, 108, 20);
		panel.add(dateDepartChooser);

		JDateChooser dateRetourChooser = new JDateChooser();
		dateRetourChooser.setBounds(160, 138, 108, 20);
		panel.add(dateRetourChooser);

		JLabel dateDepartLbl = new JLabel("Date de depart:");
		dateDepartLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dateDepartLbl.setBounds(22, 113, 128, 14);
		panel.add(dateDepartLbl);

		JLabel dateRetourLbl = new JLabel("Date de retour :");
		dateRetourLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dateRetourLbl.setBounds(22, 144, 128, 14);
		panel.add(dateRetourLbl);

		JLabel assurancesLbl = new JLabel("Assurances :");
		assurancesLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		assurancesLbl.setBounds(22, 180, 108, 14);
		panel.add(assurancesLbl);

		JLabel forfaitUsureLbl = new JLabel("Forfait Usure :");
		forfaitUsureLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		forfaitUsureLbl.setBounds(22, 208, 119, 14);
		panel.add(forfaitUsureLbl);

		JLabel paiementLbl = new JLabel("Paiement :");
		paiementLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		paiementLbl.setBounds(22, 236, 100, 14);
		panel.add(paiementLbl);

		JRadioButton ouiForfaitUsureRadio = new JRadioButton("Oui");
		ouiForfaitUsureRadio.setBounds(159, 206, 47, 23);
		panel.add(ouiForfaitUsureRadio);
		ouiForfaitUsureRadio.setBackground(new Color(112,146,190));;

		JRadioButton nonForfaitUsureRadio = new JRadioButton("Non");
		nonForfaitUsureRadio.setBounds(221, 206, 47, 23);
		panel.add(nonForfaitUsureRadio);
		nonForfaitUsureRadio.setBackground(new Color(112,146,190));
		
		ouiForfaitUsureRadio.setSelected(true);
		ButtonGroup buttonGroupForfaitUsure = new ButtonGroup();
		buttonGroupForfaitUsure.add(ouiForfaitUsureRadio);
		buttonGroupForfaitUsure.add(nonForfaitUsureRadio);

		JRadioButton ouiAssuranceRadio = new JRadioButton("Oui");
		ouiAssuranceRadio.setBackground(new Color(112, 146, 190));
		ouiAssuranceRadio.setBounds(159, 180, 47, 23);
		panel.add(ouiAssuranceRadio);

		JRadioButton nonAssuranceRadio = new JRadioButton("Non");
		nonAssuranceRadio.setBackground(new Color(112, 146, 190));
		nonAssuranceRadio.setBounds(221, 180, 47, 23);
		panel.add(nonAssuranceRadio);
		
		ouiAssuranceRadio.setSelected(true);
		ButtonGroup buttonGroupAssurance = new ButtonGroup();
		buttonGroupAssurance.add(ouiAssuranceRadio);
		buttonGroupAssurance.add(nonAssuranceRadio);

		JRadioButton creditPaiementRadio = new JRadioButton("Credit");
		creditPaiementRadio.setActionCommand("Java");
		creditPaiementRadio.setBackground(new Color(112,146,190));
		creditPaiementRadio.setBounds(118, 235, 69, 23);
		panel.add(creditPaiementRadio);

		JRadioButton debitPaiementRadio = new JRadioButton("Debit");
		debitPaiementRadio.setActionCommand("Debit");
		debitPaiementRadio.setBackground(new Color(112,146,190));
		debitPaiementRadio.setBounds(197, 234, 79, 23);
		panel.add(debitPaiementRadio);

		JRadioButton especesPaiementRadio = new JRadioButton("Especes");
		especesPaiementRadio.setActionCommand("Especes");
		especesPaiementRadio.setBackground(new Color(112,146,190));
		especesPaiementRadio.setBounds(271, 234, 87, 23);
		panel.add(especesPaiementRadio);

		creditPaiementRadio.setSelected(true);
		ButtonGroup buttonGroupPaiement = new ButtonGroup();
		buttonGroupPaiement.add(creditPaiementRadio);
		buttonGroupPaiement.add(debitPaiementRadio);
		buttonGroupPaiement.add(especesPaiementRadio);

		JLabel ajoutLocationTitleLbl = new JLabel("Ajout d'une location");
		ajoutLocationTitleLbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		ajoutLocationTitleLbl.setBounds(22, 11, 225, 34);
		panel.add(ajoutLocationTitleLbl);;


		JButton ajouterBtn = new JButton("Ajouter");
		ajouterBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int noClient = Integer.parseInt(noClientField.getText());
				int noVehicule = Integer.parseInt(noVehiculeField.getText());
				Date dateDepart = dateDepartChooser.getDate();
				Date dateRetour = dateRetourChooser.getDate();
				assurance = nonAssuranceRadio.isSelected();
				forfaitUsure = nonForfaitUsureRadio.isSelected();
				paiementCredit = creditPaiementRadio.isSelected();

				ContratLocation c = new ContratLocation(LocationAjoutController.getNbrLocation(), noVehicule, noVehicule, dateDepart, dateRetour, assurance, forfaitUsure, paiementCredit); 
				LocationAjoutController.ajouterLocationTable(c, tableEmp);
				locationAjout.dispose();
			}
		});
		locationAjout.getContentPane().setLayout(null);
		ajouterBtn.setBounds(178, 265, 130, 34);
		panel.add(ajouterBtn);
		locationAjout.getContentPane().add(panel);


	}
}
