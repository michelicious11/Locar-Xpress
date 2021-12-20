package locosys.views;
import locosys.controller.VehiculeEditController;
import locosys.models.Vehicule;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;


public class VehiculeEdit {

	private int noVehicule;
	private JTextField vehiculeIDField;
	
	private String prenom;
	private String nom;
	private String telephone;
	private String courriel;
	private static JTable tableVehicule;
	private static Vehicule veh; 
	
	private JFrame vehiculeEdit;
	
	public JFrame getVehiculeEdit() {
		return vehiculeEdit;
	}

	public void setvehiculeEdit(JFrame vehiculeEdit) {
		this.vehiculeEdit = vehiculeEdit;
	}
	
	public VehiculeEdit(JTable tableVeh) {
		initialize();
	}
	
	//create an object of SingleObject
	private static VehiculeEdit instance = new VehiculeEdit(tableVehicule);


	//Get the only object available
	public static VehiculeEdit getInstance(JTable tableVeh){
		VehiculeEdit.tableVehicule = tableVeh; 
		return instance;
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		vehiculeEdit = new JFrame();
		vehiculeEdit.setBounds(100, 100, 420, 310);
		vehiculeEdit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		vehiculeEdit.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 409, 271);
		panel.setBackground(new Color(112,146,190));;
		panel.setLayout(null);

		JLabel prenomLbl = new JLabel("Prenom :");
		prenomLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		prenomLbl.setBounds(22, 67, 68, 14);
		panel.add(prenomLbl);
		
		JLabel nomLbl = new JLabel("Nom :");
		nomLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nomLbl.setBounds(22, 98, 68, 14);
		panel.add(nomLbl);
		
		JLabel telephoneLbl = new JLabel("Telephone :");
		telephoneLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		telephoneLbl.setBounds(22, 129, 108, 20);
		panel.add(telephoneLbl);
		
		JLabel courrielLbl = new JLabel("Courriel :");
		courrielLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		courrielLbl.setBounds(22, 160, 68, 14);
		panel.add(courrielLbl);

		
		JButton modifierBtn = new JButton("Modifier");
		modifierBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				noVehicule = Integer.parseInt(vehiculeIDField.getText()); 
				//VehiculeEditController.modifiervehiculeTable(veh, tableVehicule);
			}
		});
		vehiculeEdit.getContentPane().setLayout(null);
		modifierBtn.setBounds(160, 203, 120, 34);
		panel.add(modifierBtn);
		vehiculeEdit.getContentPane().add(panel);
		
		JButton supprimerBtn = new JButton("Supprimer");
		supprimerBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//noVehicule = Integer.parseInt(vehiculeIDField.getText()); 
				//emp = new vehicule(noVehicule, prenom, nom, telephone, courriel);
				//vehiculeEditController.supprimervehiculeTable(emp, tableEmploye);
			}
		});
		supprimerBtn.setBounds(290, 32, 97, 22);
		panel.add(supprimerBtn);
		
		JLabel novehiculeLbl = new JLabel("No vehicule");
		novehiculeLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		novehiculeLbl.setBounds(22, 30, 120, 22);
		panel.add(novehiculeLbl);
		
		vehiculeIDField = new JTextField();
		vehiculeIDField.setColumns(10);
		vehiculeIDField.setBounds(160, 33, 120, 20);
		panel.add(vehiculeIDField);
	}	
}
