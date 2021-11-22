package locosys.views;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import locosys.controller.AppPagesController;
import javax.swing.JScrollPane;

public class EmployeGestionPage extends JFrame {

	private JFrame employeGestionPage;
	
	public JFrame getEmployeGestionPage() {
		return employeGestionPage;
	}

	public void setEmployeGestionPage(JFrame employeGestionPage) {
		this.employeGestionPage = employeGestionPage;
	}
	
	private JButton addEmployeeBtn;
	private JButton editEmployeeBtn;
	private JLabel employeLbl;
	private JTable employeTable;

	   //create an object of SingleObject
	   private static EmployeGestionPage instance = new EmployeGestionPage();

	   //Get the only object available
	   public static EmployeGestionPage getInstance(){
	      return instance;
	   }

	/**
	 * Create the application.
	 */
	public EmployeGestionPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		employeGestionPage = this; 
		employeGestionPage = new JFrame();
		employeGestionPage.setBounds(100, 100, 630, 495);
		employeGestionPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		employeGestionPage.setLocationRelativeTo(null);
		employeGestionPage.getContentPane().setLayout(null);
		
		JPanel panelEmploye = new JPanel();
		panelEmploye.setBackground(new Color(112,146,190));
		panelEmploye.setBounds(0, 0, 616, 458);
		employeGestionPage.getContentPane().add(panelEmploye);
		panelEmploye.setLayout(null);
		
		addEmployeeBtn = new JButton("Ajouter");
		addEmployeeBtn.setBounds(145, 392, 147, 41);
		panelEmploye.add(addEmployeeBtn);
		
		editEmployeeBtn = new JButton("Modifier");
		editEmployeeBtn.setBounds(320, 392, 147, 41);
		panelEmploye.add(editEmployeeBtn);
		
		employeLbl = new JLabel("Employes");
		employeLbl.setBounds(67, 10, 135, 32);
		panelEmploye.add(employeLbl);
		
		JScrollPane employeScrollPane = new JScrollPane(employeTable);
		employeScrollPane.setBounds(67, 52, 479, 303);
		panelEmploye.add(employeScrollPane);
		
		employeTable = new JTable();
		AppPagesController.loadEmployeeTable(employeTable);
		employeScrollPane.setViewportView(employeTable);
	}
}
