/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locosys.views;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;


public class FormulaireDepart extends JFrame {

	/**
	 * Creates new form NewJFrame
	 */
	public FormulaireDepart() {
		initComponents();
	}

	private JFrame formulaireDepart;

	public JFrame getFormulaireDepart() {
		new FormulaireDepart().setVisible(true);
		return formulaireDepart;
	}

	//create an object of SingleObject
	private static FormulaireDepart instance = new FormulaireDepart();

	//Get the only object available
	public static FormulaireDepart getInstance(){
		return instance;
	}
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		assurancesButtGr = new javax.swing.ButtonGroup();
		typeVoitureButtGr = new javax.swing.ButtonGroup();
		buttonGroup1 = new javax.swing.ButtonGroup();
		buttonGroup2 = new javax.swing.ButtonGroup();
		
		jPanel = new javax.swing.JPanel();
		jPanel.setBackground(SystemColor.activeCaption);
		
		jLabel1 = new javax.swing.JLabel();
		jLabel1.setBounds(10, 34, 258, 39);
		telLbl = new javax.swing.JLabel();
		telLbl.setBounds(10, 108, 78, 34);
		prenomLbl = new javax.swing.JLabel();
		prenomLbl.setBounds(10, 153, 78, 34);
		telephoneField = new javax.swing.JTextField();
		telephoneField.setBounds(184, 110, 155, 34);
		nomField = new javax.swing.JTextField();
		nomField.setBounds(184, 206, 155, 34);
		nomLbl = new javax.swing.JLabel();
		nomLbl.setBounds(10, 206, 78, 34);
		assurancesNonRadio = new javax.swing.JRadioButton();
		assurancesNonRadio.setBackground(SystemColor.activeCaption);
		assurancesNonRadio.setBounds(247, 535, 65, 34);
		paiementLbl = new javax.swing.JLabel();
		paiementLbl.setBounds(8, 452, 129, 34);
		assurancesOuiRadio = new javax.swing.JRadioButton();
		assurancesOuiRadio.setBackground(SystemColor.activeCaption);
		assurancesOuiRadio.setBounds(180, 535, 65, 34);
		typeVehiculeLbl = new javax.swing.JLabel();
		typeVehiculeLbl.setBounds(10, 251, 129, 34);
		DateDepartLbl = new javax.swing.JLabel();
		DateDepartLbl.setBounds(10, 355, 129, 34);
		dateRetourLbl = new javax.swing.JLabel();
		dateRetourLbl.setBounds(8, 400, 129, 34);
		dateDepartDateChooser = new com.toedter.calendar.JDateChooser();
		dateDepartDateChooser.setBounds(180, 356, 157, 33);
		dateRetourDateChooser = new com.toedter.calendar.JDateChooser();
		dateRetourDateChooser.setBounds(180, 400, 157, 33);
		annulerBtn = new javax.swing.JButton();
		annulerBtn.setBounds(349, 606, 110, 36);
		enregistreBtn = new javax.swing.JButton();
		enregistreBtn.setBounds(208, 606, 129, 36);
		prenomField = new javax.swing.JTextField();
		prenomField.setBounds(184, 154, 155, 34);
		assuranceLbl = new javax.swing.JLabel();
		assuranceLbl.setBounds(8, 525, 129, 34);
		paiementEspecesRadio = new javax.swing.JRadioButton();
		paiementEspecesRadio.setBackground(SystemColor.activeCaption);
		paiementEspecesRadio.setBounds(182, 462, 81, 39);
		paiementCreditRadio = new javax.swing.JRadioButton();
		paiementCreditRadio.setBackground(SystemColor.activeCaption);
		paiementCreditRadio.setBounds(265, 462, 72, 39);
		paiementDebitRadio = new javax.swing.JRadioButton();
		paiementDebitRadio.setBackground(SystemColor.activeCaption);
		paiementDebitRadio.setBounds(336, 462, 72, 39);
		permisLbl = new javax.swing.JLabel();
		permisLbl.setBounds(10, 303, 129, 34);
		type2Radio = new javax.swing.JRadioButton();
		type2Radio.setBackground(SystemColor.activeCaption);
		type2Radio.setBounds(241, 292, 47, 39);
		type12Radio = new javax.swing.JRadioButton();
		type12Radio.setBackground(SystemColor.activeCaption);
		type12Radio.setBounds(290, 292, 72, 39);
		type1Radio = new javax.swing.JRadioButton();
		type1Radio.setBackground(SystemColor.activeCaption);
		type1Radio.setBounds(184, 292, 55, 39);

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 627, 766);
		setLocationRelativeTo(null);
		setBackground(new Color(1, 50, 67));
		setResizable(false);

		jPanel.setPreferredSize(new java.awt.Dimension(596, 655));

		jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 30)); // NOI18N
		jLabel1.setText("Formulaire Depart");

		telLbl.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
		telLbl.setText("Tel.");

		prenomLbl.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
		prenomLbl.setText("Prenom");

		telephoneField.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
		telephoneField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		telephoneField.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		nomField.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
		nomField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		nomField.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField3ActionPerformed(evt);
			}
		});

		nomLbl.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
		nomLbl.setText("Nom");

		assurancesButtGr.add(assurancesNonRadio);
		assurancesNonRadio.setText("Non");
		assurancesNonRadio.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton1ActionPerformed(evt);
			}
		});

		paiementLbl.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
		paiementLbl.setText("Paiement ");

		assurancesButtGr.add(assurancesOuiRadio);
		assurancesOuiRadio.setText("Oui");
		assurancesOuiRadio.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton2ActionPerformed(evt);
			}
		});

		typeVehiculeLbl.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
		typeVehiculeLbl.setText("Type vehicule");

		DateDepartLbl.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
		DateDepartLbl.setText("Date depart");

		dateRetourLbl.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
		dateRetourLbl.setText("Date retour");

		dateDepartDateChooser.setBackground(new java.awt.Color(245, 245, 245));
		dateDepartDateChooser.setPreferredSize(new java.awt.Dimension(97, 48));

		dateRetourDateChooser.setBackground(new java.awt.Color(245, 245, 245));
		dateRetourDateChooser.setPreferredSize(new java.awt.Dimension(97, 48));

		annulerBtn.setBackground(new java.awt.Color(153, 153, 153));
		annulerBtn.setFont(new Font("Dialog", Font.PLAIN, 18)); // NOI18N
		annulerBtn.setForeground(SystemColor.activeCaptionText);
		annulerBtn.setText("Annuler");
		annulerBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		enregistreBtn.setBackground(SystemColor.activeCaptionBorder);
		enregistreBtn.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
		enregistreBtn.setForeground(new Color(0, 0, 0));
		enregistreBtn.setText("Enregistrer");
		enregistreBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		prenomField.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
		prenomField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		prenomField.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField4ActionPerformed(evt);
			}
		});

		assuranceLbl.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
		assuranceLbl.setText("Assurances");

		buttonGroup1.add(paiementEspecesRadio);
		paiementEspecesRadio.setText("Especes");
		paiementEspecesRadio.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton8ActionPerformed(evt);
			}
		});

		buttonGroup1.add(paiementCreditRadio);
		paiementCreditRadio.setText("Credit");
		paiementCreditRadio.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton9ActionPerformed(evt);
			}
		});

		buttonGroup1.add(paiementDebitRadio);
		paiementDebitRadio.setText("Debit");
		paiementDebitRadio.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton10ActionPerformed(evt);
			}
		});

		permisLbl.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
		permisLbl.setText("Permis");

		buttonGroup2.add(type2Radio);
		type2Radio.setText("2");

		buttonGroup2.add(type12Radio);
		type12Radio.setText("1 & 2");

		buttonGroup2.add(type1Radio);
		type1Radio.setText("1");
		
		JComboBox typeVehiculeComboBox = new JComboBox();
		typeVehiculeComboBox.setBounds(184, 251, 155, 34);
		typeVehiculeComboBox.addItem("Economique");
		typeVehiculeComboBox.addItem("Moyenne");
		typeVehiculeComboBox.addItem("Confort");
		typeVehiculeComboBox.addItem("Luxe");
		typeVehiculeComboBox.addItem("Utilitaire");
		
		jPanel.setLayout(null);
		jPanel.add(jLabel1);
		jPanel.add(telLbl);
		jPanel.add(telephoneField);
		jPanel.add(prenomField);
		jPanel.add(nomLbl);
		jPanel.add(prenomLbl);
		jPanel.add(nomField);
		jPanel.add(typeVehiculeLbl);
		jPanel.add(typeVehiculeComboBox);
		jPanel.add(type1Radio);
		jPanel.add(type2Radio);
		jPanel.add(type12Radio);
		jPanel.add(dateDepartDateChooser);
		jPanel.add(dateRetourDateChooser);
		jPanel.add(paiementEspecesRadio);
		jPanel.add(paiementCreditRadio);
		jPanel.add(paiementDebitRadio);
		jPanel.add(permisLbl);
		jPanel.add(DateDepartLbl);
		jPanel.add(dateRetourLbl);
		jPanel.add(paiementLbl);
		jPanel.add(enregistreBtn);
		jPanel.add(annulerBtn);
		jPanel.add(assuranceLbl);
		jPanel.add(assurancesOuiRadio);
		jPanel.add(assurancesNonRadio);
		
		rechercherBtn = new JButton("Rechercher");
		rechercherBtn.setBounds(349, 108, 110, 39);
		jPanel.add(rechercherBtn);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel, GroupLayout.PREFERRED_SIZE, 489, GroupLayout.PREFERRED_SIZE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel, GroupLayout.PREFERRED_SIZE, 673, GroupLayout.PREFERRED_SIZE)
		);
		getContentPane().setLayout(groupLayout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jRadioButton2ActionPerformed

	private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jRadioButton1ActionPerformed

	private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jTextField3ActionPerformed

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jTextField1ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jButton2ActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jButton1ActionPerformed

	private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jTextField4ActionPerformed

	private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jRadioButton8ActionPerformed

	private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jRadioButton9ActionPerformed

	private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jRadioButton10ActionPerformed


	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.ButtonGroup assurancesButtGr;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.ButtonGroup buttonGroup2;
	private javax.swing.JButton enregistreBtn;
	private javax.swing.JButton annulerBtn;
	private com.toedter.calendar.JDateChooser dateDepartDateChooser;
	private com.toedter.calendar.JDateChooser dateRetourDateChooser;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel assuranceLbl;
	private javax.swing.JLabel permisLbl;
	private javax.swing.JLabel telLbl;
	private javax.swing.JLabel prenomLbl;
	private javax.swing.JLabel nomLbl;
	private javax.swing.JLabel paiementLbl;
	private javax.swing.JLabel typeVehiculeLbl;
	private javax.swing.JLabel DateDepartLbl;
	private javax.swing.JLabel dateRetourLbl;
	private javax.swing.JPanel jPanel;
	private javax.swing.JRadioButton assurancesNonRadio;
	private javax.swing.JRadioButton paiementDebitRadio;
	private javax.swing.JRadioButton type2Radio;
	private javax.swing.JRadioButton type12Radio;
	private javax.swing.JRadioButton type1Radio;
	private javax.swing.JRadioButton assurancesOuiRadio;
	private javax.swing.JRadioButton paiementEspecesRadio;
	private javax.swing.JRadioButton paiementCreditRadio;
	private javax.swing.JTextField telephoneField;
	private javax.swing.JTextField nomField;
	private javax.swing.JTextField prenomField;
	private javax.swing.ButtonGroup typeVoitureButtGr;
	private JButton rechercherBtn;
}
