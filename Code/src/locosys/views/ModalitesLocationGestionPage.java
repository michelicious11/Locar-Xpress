package locosys.views;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import locosys.controller.AppPagesController;
import locosys.controller.ContratLocationController;
import locosys.controller.EmployeGestionPageController;

import javax.swing.JScrollPane;
import java.awt.Label;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.SystemColor;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Dimension;

public class ModalitesLocationGestionPage extends JFrame {

	private JFrame modalitesLocationGestionPage;
	
	public JFrame getModalitesLocationGestionPage() {
		return modalitesLocationGestionPage;
	}

	public void setModalitesLocationGestionPage(JFrame modalitesLocationGestionPage) {
		this.modalitesLocationGestionPage = modalitesLocationGestionPage;
	}
	
	private JButton addModalitesLocationBtn;
	private JButton editModalitesLocationBtn;
	
	private JLabel modalitesLocationClasseEconomiqueLbl;
	private JLabel modalitesLocationClasseMoyenneLbl;
	private JLabel modalitesLocationClasseConfortLbl;
	private JLabel modalitesLocationClasseLuxeLbl;
	private JLabel modalitesLocationClasseUtilitaireLbl;

	private JTextField modalitesLocationClasseConfortField;
	private JTextField modalitesLocationClasseLuxeField;
	private JTextField modalitesLocationClasseEconomiqueField;
	private JTextField modalitesLocationClasseMoyenneField;
	private JTextField modalitesLocationClasseUtilitaireField;
	
	   //create an object of SingleObject
	   private static ModalitesLocationGestionPage instance = new ModalitesLocationGestionPage();
	   private JTextField modalitesLocationFraisUsureForfait2ArgentField;
	   private JLabel modalitesLocationFraisEssenceLbl;
	   private JTextField modalitesLocationFraisEssenceField;
	   private JTextField modalitesLocationFraisUsureForfait2KmField;
	   private JTextField modalitesLocationFraisUsureForfait1ArgentField;
	   private JTextField modalitesLocationFraisUsureForfait1KmField;
	   private JLabel modalitesLocationFraisAssuranceLbl;
	   private JTextField modalitesLocationFraisAssuranceField;
	   private JLabel modalitesLocationTaxesProvincialesLbl;
	   private JTextField modalitesLocationTaxesProvincialesField;
	   private JLabel modalitesLocationTaxesFederalesLbl;
	   private JTextField modalitesLocationTaxesFederalesField;
	   private JLabel modalitesLocationCautionEnEspecesLbl;
	   private JTextField modalitesLocationCautionEnEspecesField;

	   //Get the only object available
	   public static ModalitesLocationGestionPage getInstance(){
	      return instance;
	   }

	/**
	 * Create the application.
	 */
	public ModalitesLocationGestionPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		modalitesLocationGestionPage = this; 
		modalitesLocationGestionPage = new JFrame();
		modalitesLocationGestionPage.setBounds(100, 100, 800, 800);
		modalitesLocationGestionPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		modalitesLocationGestionPage.setLocationRelativeTo(null);
		modalitesLocationGestionPage.getContentPane().setLayout(null);
		//ResultSet prixDeBase = EmployeGestionPageController.getPrixContrat("TypeVehicule" , "prixDeBase");
		
		
		JPanel panelModalitesLocation = new JPanel();
		panelModalitesLocation.setForeground(new Color(153, 0, 0));
		panelModalitesLocation.setBackground(new Color(112,146,190));
		panelModalitesLocation.setBounds(0, 0, 800, 800);
		modalitesLocationGestionPage.getContentPane().add(panelModalitesLocation);
		panelModalitesLocation.setLayout(null);
		
		
//		addModalitesLocationBtn = new JButton("Modifier");
//		addModalitesLocationBtn.setBounds(145, 392, 147, 41);
//		panelModalitesLocation.add(editModalitesLocationBtn);
		
		editModalitesLocationBtn = new JButton("Modifier");
		editModalitesLocationBtn.setBounds(94, 819, 147, 41);
		panelModalitesLocation.add(editModalitesLocationBtn);
		
//////////////////CLASSE ÉCONOMIQUE //////////////////////////////////////////////////
		modalitesLocationClasseEconomiqueLbl = new JLabel("Classe economique");
		modalitesLocationClasseEconomiqueLbl.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		modalitesLocationClasseEconomiqueLbl.setBounds(10, 57, 141, 19);
		panelModalitesLocation.add(modalitesLocationClasseEconomiqueLbl);
		
		modalitesLocationClasseEconomiqueField = new JTextField();
		modalitesLocationClasseEconomiqueLbl.setLabelFor(modalitesLocationClasseEconomiqueField);
		modalitesLocationClasseEconomiqueField.setBounds(190, 54, 129, 19);
		modalitesLocationClasseEconomiqueField.setText(EmployeGestionPageController.getPrixContrat("TypeVehicule" , "prixDeBase", 1));
		panelModalitesLocation.add(modalitesLocationClasseEconomiqueField);
		modalitesLocationClasseEconomiqueField.setColumns(10);
		
////////////////// CLASSE MOYENNE //////////////////////////////////////////////////
		modalitesLocationClasseMoyenneLbl = new JLabel("Classe moyenne");
		modalitesLocationClasseMoyenneLbl.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		modalitesLocationClasseMoyenneLbl.setBounds(10, 89, 170, 19);
		panelModalitesLocation.add(modalitesLocationClasseMoyenneLbl);
		
		modalitesLocationClasseMoyenneField = new JTextField();
		modalitesLocationClasseMoyenneLbl.setLabelFor(modalitesLocationClasseMoyenneField);
		modalitesLocationClasseMoyenneField.setBounds(190, 89, 129, 19);
		modalitesLocationClasseMoyenneField.setText(EmployeGestionPageController.getPrixContrat("TypeVehicule" , "prixDeBase", 2));
		panelModalitesLocation.add(modalitesLocationClasseMoyenneField);
		modalitesLocationClasseMoyenneField.setColumns(10);
		
////////////////// CLASSE CONFORT //////////////////////////////////////////////////
		modalitesLocationClasseConfortLbl = new JLabel("Classe confort");
		modalitesLocationClasseConfortLbl.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		modalitesLocationClasseConfortLbl.setBounds(10, 116, 170, 19);
		panelModalitesLocation.add(modalitesLocationClasseConfortLbl);
		
		modalitesLocationClasseConfortField = new JTextField();
		modalitesLocationClasseConfortLbl.setLabelFor(modalitesLocationClasseConfortField);
		modalitesLocationClasseConfortField.setBounds(190, 119, 129, 19);
		modalitesLocationClasseConfortField.setText(EmployeGestionPageController.getPrixContrat("TypeVehicule" , "prixDeBase", 1));
		panelModalitesLocation.add(modalitesLocationClasseConfortField);
		modalitesLocationClasseConfortField.setColumns(10);
			
////////////////// CLASSE LUXE //////////////////////////////////////////////////
		modalitesLocationClasseLuxeLbl = new JLabel("Classe luxe");
		modalitesLocationClasseLuxeLbl.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		modalitesLocationClasseLuxeLbl.setBounds(10, 148, 170, 19);
		panelModalitesLocation.add(modalitesLocationClasseLuxeLbl);
		
		modalitesLocationClasseLuxeField = new JTextField();
		modalitesLocationClasseLuxeLbl.setLabelFor(modalitesLocationClasseLuxeField);
		modalitesLocationClasseLuxeField.setBounds(190, 148, 129, 19);
		modalitesLocationClasseLuxeField.setText(EmployeGestionPageController.getPrixContrat("TypeVehicule" , "prixDeBase", 1));
		panelModalitesLocation.add(modalitesLocationClasseLuxeField);
		modalitesLocationClasseLuxeField.setColumns(10);		
		
////////////////// CLASSE UTILITAIRE //////////////////////////////////////////////////
		modalitesLocationClasseUtilitaireLbl = new JLabel("Classe utilitaire");
		modalitesLocationClasseUtilitaireLbl.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		modalitesLocationClasseUtilitaireLbl.setBounds(10, 177, 170, 19);
		panelModalitesLocation.add(modalitesLocationClasseUtilitaireLbl);
		
		modalitesLocationClasseUtilitaireField = new JTextField();
		modalitesLocationClasseUtilitaireLbl.setLabelFor(modalitesLocationClasseUtilitaireField);
		modalitesLocationClasseUtilitaireField.setBounds(190, 177, 129, 19);
		modalitesLocationClasseUtilitaireField.setText(EmployeGestionPageController.getPrixContrat("TypeVehicule" , "prixDeBase", 1));
		panelModalitesLocation.add(modalitesLocationClasseUtilitaireField);
		modalitesLocationClasseUtilitaireField.setColumns(10);
		
////////////////// Frais d'usures forfait 1 //////////////////////////////////////////////
		JLabel modalitesLocationFraisUsureForfait1Lbl = new JLabel("Frais d'usures forfait 1");
		modalitesLocationFraisUsureForfait1Lbl.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		modalitesLocationFraisUsureForfait1Lbl.setLabelFor(modalitesLocationFraisUsureForfait1Lbl);
		modalitesLocationFraisUsureForfait1Lbl.setBounds(10, 275, 170, 19);
		panelModalitesLocation.add(modalitesLocationFraisUsureForfait1Lbl);
		
		modalitesLocationFraisUsureForfait1ArgentField = new JTextField();
		modalitesLocationFraisUsureForfait1ArgentField.setColumns(10);
		modalitesLocationFraisUsureForfait1ArgentField.setBounds(190, 275, 62, 19);
		panelModalitesLocation.add(modalitesLocationFraisUsureForfait1ArgentField);
		
		modalitesLocationFraisUsureForfait1KmField = new JTextField();
		modalitesLocationFraisUsureForfait1KmField.setColumns(10);
		modalitesLocationFraisUsureForfait1KmField.setBounds(257, 275, 62, 19);
		panelModalitesLocation.add(modalitesLocationFraisUsureForfait1KmField);
		
////////////////// Frais d'usures forfait 2 //////////////////////////////////////////////
		JLabel modalitesLocationFraisUsureForfait2Lbl = new JLabel("Frais d'usures forfait 2");
		modalitesLocationFraisUsureForfait2Lbl.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		modalitesLocationFraisUsureForfait2Lbl.setLabelFor(modalitesLocationFraisUsureForfait2ArgentField);
		modalitesLocationFraisUsureForfait2Lbl.setBounds(10, 307, 170, 19);
		panelModalitesLocation.add(modalitesLocationFraisUsureForfait2Lbl);
		
		modalitesLocationFraisUsureForfait2ArgentField = new JTextField();
		modalitesLocationFraisUsureForfait2ArgentField.setColumns(10);
		modalitesLocationFraisUsureForfait2ArgentField.setBounds(190, 307, 62, 19);
		panelModalitesLocation.add(modalitesLocationFraisUsureForfait2ArgentField);
		
		modalitesLocationFraisUsureForfait2KmField = new JTextField();
		modalitesLocationFraisUsureForfait2KmField.setColumns(10);
		modalitesLocationFraisUsureForfait2KmField.setBounds(257, 307, 62, 19);
		panelModalitesLocation.add(modalitesLocationFraisUsureForfait2KmField);
		
////////////////// Frais d'essences //////////////////////////////////////////////////////
		modalitesLocationFraisEssenceLbl = new JLabel("Frais d'essences");
		modalitesLocationFraisEssenceLbl.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		modalitesLocationFraisEssenceLbl.setBounds(10, 336, 170, 19);
		panelModalitesLocation.add(modalitesLocationFraisEssenceLbl);
		
		modalitesLocationFraisEssenceField = new JTextField();
		modalitesLocationFraisEssenceLbl.setLabelFor(modalitesLocationFraisEssenceField);
		modalitesLocationFraisEssenceField.setColumns(10);
		modalitesLocationFraisEssenceField.setBounds(190, 336, 129, 19);
		panelModalitesLocation.add(modalitesLocationFraisEssenceField);
		
////////////////// Frais d'assurances //////////////////////////////////////////////////////
		modalitesLocationFraisAssuranceLbl = new JLabel("Frais d'assurances");
		modalitesLocationFraisAssuranceLbl.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		modalitesLocationFraisAssuranceLbl.setBounds(10, 365, 170, 19);
		panelModalitesLocation.add(modalitesLocationFraisAssuranceLbl);
		
		modalitesLocationFraisAssuranceField = new JTextField();
		modalitesLocationFraisAssuranceLbl.setLabelFor(modalitesLocationFraisAssuranceField);
		modalitesLocationFraisAssuranceField.setColumns(10);
		modalitesLocationFraisAssuranceField.setBounds(190, 365, 129, 19);
		panelModalitesLocation.add(modalitesLocationFraisAssuranceField);
		
////////////////// Taxes provinciales //////////////////////////////////////////////////////
		modalitesLocationTaxesProvincialesLbl = new JLabel("Taxes provinciales");
		modalitesLocationTaxesProvincialesLbl.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		modalitesLocationTaxesProvincialesLbl.setBounds(10, 498, 170, 22);
		panelModalitesLocation.add(modalitesLocationTaxesProvincialesLbl);
		
		modalitesLocationTaxesProvincialesField = new JTextField();
		modalitesLocationTaxesProvincialesLbl.setLabelFor(modalitesLocationTaxesProvincialesField);
		modalitesLocationTaxesProvincialesField.setColumns(10);
		modalitesLocationTaxesProvincialesField.setBounds(190, 495, 129, 22);
		panelModalitesLocation.add(modalitesLocationTaxesProvincialesField);
		
////////////////// Taxes fédérales //////////////////////////////////////////////////////
		modalitesLocationTaxesFederalesLbl = new JLabel("Taxes federales");
		modalitesLocationTaxesFederalesLbl.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		modalitesLocationTaxesFederalesLbl.setBounds(10, 530, 170, 19);
		panelModalitesLocation.add(modalitesLocationTaxesFederalesLbl);
		
		modalitesLocationTaxesFederalesField = new JTextField();
		modalitesLocationTaxesFederalesLbl.setLabelFor(modalitesLocationTaxesFederalesField);
		modalitesLocationTaxesFederalesField.setColumns(10);
		modalitesLocationTaxesFederalesField.setBounds(190, 527, 129, 19);
		panelModalitesLocation.add(modalitesLocationTaxesFederalesField);
		
////////////////// Caution en espèces //////////////////////////////////////////////////////
		modalitesLocationCautionEnEspecesLbl = new JLabel("Caution en especes");
		modalitesLocationCautionEnEspecesLbl.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		modalitesLocationCautionEnEspecesLbl.setBounds(10, 559, 170, 19);
		panelModalitesLocation.add(modalitesLocationCautionEnEspecesLbl);
		
		modalitesLocationCautionEnEspecesField = new JTextField();
		modalitesLocationCautionEnEspecesLbl.setLabelFor(modalitesLocationCautionEnEspecesField);
		modalitesLocationCautionEnEspecesField.setColumns(10);
		modalitesLocationCautionEnEspecesField.setBounds(190, 556, 129, 19);
		panelModalitesLocation.add(modalitesLocationCautionEnEspecesField);
		
////////////////// Séparateur //////////////////////////////////////////////////////
		JSeparator separator = new JSeparator();
		separator.setOpaque(true);
		separator.setBackground(new Color(204, 255, 51));
		separator.setFont(new Font("Dialog", Font.PLAIN, 5));
		separator.setBounds(424, 0, 366, 790);
		panelModalitesLocation.add(separator);
		
////////////////// Titre "Modifications" //////////////////////////////////////////////////////
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Modifications");
		lblNewJgoodiesTitle.setForeground(new Color(255, 204, 255));
		lblNewJgoodiesTitle.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 15));
		lblNewJgoodiesTitle.setBounds(200, 7, 103, 37);
		panelModalitesLocation.add(lblNewJgoodiesTitle);
	}
}

