package locosys.models;

import java.time.LocalDateTime;

public class Employe {
	private int employeID; 
	private String prenom, nom, telephone, adresse;

	public Employe(int employeID, String prenom, String nom, String telephone, String adresse) {
		this.employeID = employeID;
		this.prenom = prenom;
		this.nom = nom; 
		this.telephone = telephone;
		this.adresse = adresse; 
	}
}
