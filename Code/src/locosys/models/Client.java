package locosys.models;

import java.sql.Date;
import java.time.LocalDateTime;

public class Client {
	private int clientID, typePermis; 
	private String prenom, nom, telephone, adresse;
	private Date dateNaissance;

	
	public Client(int clientID, String prenom, String nom, Date dateNaissance, String telephone,
					String adresse, int permis) {
		this.typePermis = permis;
		this.prenom = prenom; 
		this.nom = nom; 
		this.telephone = telephone;
		this.adresse = adresse;
		this.dateNaissance = dateNaissance;
	}
	
	/*
	 * Setters and getters
	 * */
	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public int getTypePermis() {
		return typePermis;
	}

	public void setTypePermis(int typePermis) {
		this.typePermis = typePermis;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}



}
