package locosys.models;

import java.time.LocalDateTime;

public class Employe {
	private int employeID; 
	private String prenom, nom, telephone, courriel;

	public Employe(int employeID, String prenom, String nom, String telephone, String adresse) {
		this.employeID = employeID;
		this.prenom = prenom;
		this.nom = nom; 
		this.telephone = telephone;
		this.courriel = adresse; 
	}
	
	
	public String toString()
	{
		return this.employeID + " " + this.prenom + " " + this.nom;
	}

	public int getEmployeID() {
		return employeID;
	}

	public void setEmployeID(int employeID) {
		this.employeID = employeID;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCourriel() {
		return courriel;
	}

	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}
	
	
}
