package locosys.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import locosys.controller.EmployeEditController;
import locosys.models.Employe;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClientEdit extends JFrame {

	private JTextField nomField;
	private JTextField telephoneField;
	private JTextField prenomField;
	private JTextField courrielField;
	private JTextField employeIDField;
	
	private int noEmploye; 
	private String prenom;
	private String nom;
	private String telephone;
	private String courriel;
	private static JTable tableEmp;
	private static Employe emp; 
	
	private JFrame employeEdit;
	
	public JFrame getEmployeEdit() {
		return employeEdit;
	}

	public void setEmployeEdit(JFrame employeEdit) {
		this.employeEdit = employeEdit;
	}
	
	public ClientEdit(JTable tableEmp) {
		initialize();
	}
	
	//create an object of SingleObject
	private static LocationEdit instance = new LocationEdit(tableEmp);


	//Get the only object available
	public static LocationEdit getInstance(JTable tableEmp){
		LocationEdit.tableEmp = tableEmp; 
		return instance;
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		employeEdit = this; 
		employeEdit = new JFrame();
		employeEdit.setBounds(100, 100, 420, 310);
		employeEdit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		employeEdit.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 409, 271);
		panel.setBackground(new Color(112,146,190));;
		panel.setLayout(null);
		
		nomField = new JTextField();
		nomField.setBounds(160, 95, 120, 20);
		panel.add(nomField);
		nomField.setColumns(10);
		
		telephoneField = new JTextField();
		telephoneField.setColumns(10);
		telephoneField.setBounds(160, 126, 120, 20);
		panel.add(telephoneField);
		
		prenomField = new JTextField();
		prenomField.setColumns(10);
		prenomField.setBounds(160, 64, 120, 20);
		panel.add(prenomField);
		
		courrielField = new JTextField();
		courrielField.setColumns(10);
		courrielField.setBounds(160, 157, 120, 20);
		panel.add(courrielField);
		
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
				noEmploye = Integer.parseInt(employeIDField.getText()); 
				EmployeEditController.modifierEmployeTable(emp, tableEmp);
			}
		});
		employeEdit.getContentPane().setLayout(null);
		modifierBtn.setBounds(160, 203, 120, 34);
		panel.add(modifierBtn);
		employeEdit.getContentPane().add(panel);
		
		JButton supprimerBtn = new JButton("Supprimer");
		supprimerBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				noEmploye = Integer.parseInt(employeIDField.getText()); 
				prenom = prenomField.getText();
				nom = nomField.getText();
				telephone = telephoneField.getText();
				courriel = courrielField.getText();
				emp = new Employe(noEmploye, prenom, nom, telephone, courriel);
				EmployeEditController.supprimerEmployeTable(emp, tableEmp);
			}
		});
		supprimerBtn.setBounds(290, 32, 97, 22);
		panel.add(supprimerBtn);
		
		JLabel noEmployeLbl = new JLabel("No Employe");
		noEmployeLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		noEmployeLbl.setBounds(22, 30, 120, 22);
		panel.add(noEmployeLbl);
		
		employeIDField = new JTextField();
		employeIDField.setColumns(10);
		employeIDField.setBounds(160, 33, 120, 20);
		panel.add(employeIDField);
	
	}
}
