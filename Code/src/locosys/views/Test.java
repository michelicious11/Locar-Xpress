package locosys.views;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import locosys.controller.AppPagesController;
import javax.swing.JScrollPane;
import java.awt.Label;

public class Test extends JFrame {

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

	private JTextField modalitesLocationClasseEconomiqueField;
	private JTextField modalitesLocationClasseMoyenneField;
	private JTextField modalitesLocationClasseConfortField;
	private JTextField modalitesLocationClasseLuxeField;
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
	public Test() {
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
		
		JPanel panelModalitesLocation = new JPanel();
		panelModalitesLocation.setBackground(new Color(112,146,190));
		panelModalitesLocation.setBounds(0, 0, 800, 800);
		modalitesLocationGestionPage.getContentPane().add(panelModalitesLocation);
		panelModalitesLocation.setLayout(null);
		
		
//		addModalitesLocationBtn = new JButton("Modifier");
//		addModalitesLocationBtn.setBounds(145, 392, 147, 41);
//		panelModalitesLocation.add(editModalitesLocationBtn);
		
		editModalitesLocationBtn = new JButton("Modifier");
		editModalitesLocationBtn.setBounds(112, 468, 147, 41);
		panelModalitesLocation.add(editModalitesLocationBtn);
		
//////////////////CLASSE ÉCONOMIQUE //////////////////////////////////////////////////
		modalitesLocationClasseEconomiqueLbl = new JLabel("Classe économique");
		modalitesLocationClasseEconomiqueLbl.setBounds(10, 10, 96, 19);
		panelModalitesLocation.add(modalitesLocationClasseEconomiqueLbl);
		
		modalitesLocationClasseEconomiqueField = new JTextField();
		modalitesLocationClasseEconomiqueLbl.setLabelFor(modalitesLocationClasseEconomiqueField);
		modalitesLocationClasseEconomiqueField.setBounds(119, 72, 129, 19);
		panelModalitesLocation.add(modalitesLocationClasseEconomiqueField);
		modalitesLocationClasseEconomiqueField.setColumns(10);
		 //Field = 48, 170, 129, 19. Label = 48, 157, 96, 13
//////////////////CLASSE MOYENNE //////////////////////////////////////////////////
		modalitesLocationClasseMoyenneLbl = new JLabel("Classe moyenne");
		modalitesLocationClasseMoyenneLbl.setBounds(10, 42, 96, 19);
		panelModalitesLocation.add(modalitesLocationClasseMoyenneLbl);
		
		modalitesLocationClasseMoyenneField = new JTextField();
		modalitesLocationClasseMoyenneLbl.setLabelFor(modalitesLocationClasseMoyenneField);
		modalitesLocationClasseMoyenneField.setBounds(119, 101, 129, 19);
		panelModalitesLocation.add(modalitesLocationClasseMoyenneField);
		modalitesLocationClasseMoyenneField.setColumns(10);
		
//////////////////CLASSE CONFORT //////////////////////////////////////////////////
		modalitesLocationClasseConfortLbl = new JLabel("Classe confort");
		modalitesLocationClasseConfortLbl.setBounds(10, 69, 96, 19);
		panelModalitesLocation.add(modalitesLocationClasseConfortLbl);
		
		modalitesLocationClasseConfortField = new JTextField();
		modalitesLocationClasseConfortLbl.setLabelFor(modalitesLocationClasseConfortField);
		modalitesLocationClasseConfortField.setBounds(119, 10, 129, 19);
		panelModalitesLocation.add(modalitesLocationClasseConfortField);
		modalitesLocationClasseConfortField.setColumns(10);
		
		
//////////////////CLASSE LUXE //////////////////////////////////////////////////
		modalitesLocationClasseLuxeLbl = new JLabel("Classe luxe");
		modalitesLocationClasseLuxeLbl.setBounds(10, 101, 96, 19);
		panelModalitesLocation.add(modalitesLocationClasseLuxeLbl);
		
		modalitesLocationClasseLuxeField = new JTextField();
		modalitesLocationClasseLuxeLbl.setLabelFor(modalitesLocationClasseLuxeField);
		modalitesLocationClasseLuxeField.setBounds(119, 42, 129, 19);
		panelModalitesLocation.add(modalitesLocationClasseLuxeField);
		modalitesLocationClasseLuxeField.setColumns(10);
		
		
//////////////////CLASSE UTILITAIRE //////////////////////////////////////////////////
		modalitesLocationClasseUtilitaireLbl = new JLabel("Classe utilitaire");
		modalitesLocationClasseUtilitaireLbl.setBounds(10, 130, 96, 19);
		panelModalitesLocation.add(modalitesLocationClasseUtilitaireLbl);
		
		modalitesLocationClasseUtilitaireField = new JTextField();
		modalitesLocationClasseUtilitaireLbl.setLabelFor(modalitesLocationClasseUtilitaireField);
		modalitesLocationClasseUtilitaireField.setBounds(119, 130, 129, 19);
		panelModalitesLocation.add(modalitesLocationClasseUtilitaireField);
		modalitesLocationClasseUtilitaireField.setColumns(10);
		
		JLabel modalitesLocationFraisUsureForfait1Lbl = new JLabel("Frais d'usures forfait 1");
		modalitesLocationFraisUsureForfait1Lbl.setBounds(10, 199, 118, 19);
		panelModalitesLocation.add(modalitesLocationFraisUsureForfait1Lbl);
		
		modalitesLocationFraisUsureForfait2ArgentField = new JTextField();
		modalitesLocationFraisUsureForfait2ArgentField.setColumns(10);
		modalitesLocationFraisUsureForfait2ArgentField.setBounds(119, 231, 57, 19);
		panelModalitesLocation.add(modalitesLocationFraisUsureForfait2ArgentField);
		
		JLabel modalitesLocationFraisUsureForfait2Lbl = new JLabel("Frais d'usures forfait 2");
		modalitesLocationFraisUsureForfait2Lbl.setBounds(10, 231, 118, 19);
		panelModalitesLocation.add(modalitesLocationFraisUsureForfait2Lbl);
		
		modalitesLocationFraisEssenceLbl = new JLabel("Frais d'essences");
		modalitesLocationFraisEssenceLbl.setBounds(10, 260, 118, 19);
		panelModalitesLocation.add(modalitesLocationFraisEssenceLbl);
		
		modalitesLocationFraisEssenceField = new JTextField();
		modalitesLocationFraisEssenceField.setColumns(10);
		modalitesLocationFraisEssenceField.setBounds(119, 260, 129, 19);
		panelModalitesLocation.add(modalitesLocationFraisEssenceField);
		
		modalitesLocationFraisUsureForfait2KmField = new JTextField();
		modalitesLocationFraisUsureForfait2KmField.setColumns(10);
		modalitesLocationFraisUsureForfait2KmField.setBounds(191, 231, 57, 19);
		panelModalitesLocation.add(modalitesLocationFraisUsureForfait2KmField);
		
		modalitesLocationFraisUsureForfait1ArgentField = new JTextField();
		modalitesLocationFraisUsureForfait1ArgentField.setColumns(10);
		modalitesLocationFraisUsureForfait1ArgentField.setBounds(119, 199, 57, 19);
		panelModalitesLocation.add(modalitesLocationFraisUsureForfait1ArgentField);
		
		modalitesLocationFraisUsureForfait1KmField = new JTextField();
		modalitesLocationFraisUsureForfait1KmField.setColumns(10);
		modalitesLocationFraisUsureForfait1KmField.setBounds(191, 199, 57, 19);
		panelModalitesLocation.add(modalitesLocationFraisUsureForfait1KmField);
		
		modalitesLocationFraisAssuranceLbl = new JLabel("Frais d'assurances");
		modalitesLocationFraisAssuranceLbl.setBounds(10, 289, 118, 19);
		panelModalitesLocation.add(modalitesLocationFraisAssuranceLbl);
		
		modalitesLocationFraisAssuranceField = new JTextField();
		modalitesLocationFraisAssuranceField.setColumns(10);
		modalitesLocationFraisAssuranceField.setBounds(119, 289, 129, 19);
		panelModalitesLocation.add(modalitesLocationFraisAssuranceField);
		
		modalitesLocationTaxesProvincialesLbl = new JLabel("Taxes provinciales");
		modalitesLocationTaxesProvincialesLbl.setBounds(10, 356, 118, 19);
		panelModalitesLocation.add(modalitesLocationTaxesProvincialesLbl);
		
		modalitesLocationTaxesProvincialesField = new JTextField();
		modalitesLocationTaxesProvincialesField.setColumns(10);
		modalitesLocationTaxesProvincialesField.setBounds(119, 356, 129, 19);
		panelModalitesLocation.add(modalitesLocationTaxesProvincialesField);
		
		modalitesLocationTaxesFederalesLbl = new JLabel("Taxes f\u00E9d\u00E9rales");
		modalitesLocationTaxesFederalesLbl.setBounds(10, 385, 118, 19);
		panelModalitesLocation.add(modalitesLocationTaxesFederalesLbl);
		
		modalitesLocationTaxesFederalesField = new JTextField();
		modalitesLocationTaxesFederalesField.setColumns(10);
		modalitesLocationTaxesFederalesField.setBounds(119, 385, 129, 19);
		panelModalitesLocation.add(modalitesLocationTaxesFederalesField);
		
		modalitesLocationCautionEnEspecesLbl = new JLabel("Caution en esp\u00E8ces");
		modalitesLocationCautionEnEspecesLbl.setBounds(10, 414, 118, 19);
		panelModalitesLocation.add(modalitesLocationCautionEnEspecesLbl);
		
		modalitesLocationCautionEnEspecesField = new JTextField();
		modalitesLocationCautionEnEspecesField.setColumns(10);
		modalitesLocationCautionEnEspecesField.setBounds(119, 414, 129, 19);
		panelModalitesLocation.add(modalitesLocationCautionEnEspecesField);
		
		
//		JScrollPane modalitesLocationScrollPane = new JScrollPane(modalitesLocationTable);
//		modalitesLocationScrollPane.setBounds(67, 52, 479, 303);
//		panelModalitesLocation.add(modalitesLocationScrollPane);
//		
//		modalitesLocationTable = new JTable();
//		AppPagesController.loadEmployeeTable(modalitesLocationTable);
//		modalitesLocationScrollPane.setViewportView(modalitesLocationTable);
		
	}
}

