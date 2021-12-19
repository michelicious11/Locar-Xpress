package locosys.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import locosys.controller.EmployeAjoutController;
import locosys.models.Employe;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class EmployeAjout extends JFrame {


	private JTextField nomField;
	private JTextField telephoneField;
	private JTextField prenomField;
	private JTextField courrielField;

	private String prenom;
	private String nom;
	private String telephone;
	private String courriel;
	private static JTable tableEmp; 
	
	private JFrame employeAjout;
	
	public JFrame getEmployeAjout() {
		new EmployeAjout().setVisible(true);
		return employeAjout;
	}

	public void setEmployeAjout(JFrame employeAjout) {
		this.employeAjout = employeAjout;
	}
	
	public EmployeAjout(JTable tableEmp) {
		this.tableEmp = tableEmp; 
	}
	
	//create an object of SingleObject
	private static EmployeAjout instance = new EmployeAjout(tableEmp);

	//Get the only object available
	public static EmployeAjout getInstance(JTable tableEmp){
		return instance;
	}
	
	/**
	 * Create the application.
	 */
	public EmployeAjout() {
		initialize();
	}
	


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		employeAjout = this; 
		employeAjout = new JFrame();
		employeAjout.setBounds(100, 100, 344, 300);
		employeAjout.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		employeAjout.setLocationRelativeTo(null);
		employeAjout.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112,146,190));;
		employeAjout.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		nomField = new JTextField();
		nomField.setBounds(160, 76, 86, 20);
		panel.add(nomField);
		nomField.setColumns(10);
		
		telephoneField = new JTextField();
		telephoneField.setColumns(10);
		telephoneField.setBounds(160, 107, 86, 20);
		panel.add(telephoneField);
		
		prenomField = new JTextField();
		prenomField.setColumns(10);
		prenomField.setBounds(160, 45, 86, 20);
		panel.add(prenomField);
		
		courrielField = new JTextField();
		courrielField.setColumns(10);
		courrielField.setBounds(160, 138, 86, 20);
		panel.add(courrielField);
		
		JLabel prenomLbl = new JLabel("Prenom :");
		prenomLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		prenomLbl.setBounds(22, 48, 68, 14);
		panel.add(prenomLbl);
		
		JLabel nomLbl = new JLabel("Nom :");
		nomLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nomLbl.setBounds(22, 79, 68, 14);
		panel.add(nomLbl);
		
		JLabel telephoneLbl = new JLabel("Telephone :");
		telephoneLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		telephoneLbl.setBounds(22, 110, 108, 14);
		panel.add(telephoneLbl);
		
		JLabel courrielLbl = new JLabel("Courriel :");
		courrielLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		courrielLbl.setBounds(22, 141, 68, 14);
		panel.add(courrielLbl);
		
		JButton ajouterBtn = new JButton("Ajouter");
		ajouterBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				prenom = prenomField.getText();
				nom = nomField.getText();
				telephone = telephoneField.getText();
				courriel = courrielField.getText();
				
				Employe emp = new Employe(EmployeAjoutController.getNbrEmploye(), prenom, nom, telephone, courriel); 
				
			}
		});
		ajouterBtn.setBounds(116, 199, 130, 34);
		panel.add(ajouterBtn);
	}
}
