package locosys.models;

import java.time.LocalDateTime;
import java.util.Date;

import locosys.vehicules.Vehicules; 

public class ContratLocation {
	private int contratID; 
	private int clientID; 
	private int vehiculeID;
	private Date dateHeureDepart;
	private Date dateHeureRetour;
	private boolean assurances, usureJournalier, paiementCredit;
	private int duree;
	private double montantBase; 

	
	public ContratLocation(int contratID, int clientID, int vehiculeID, 
							Date dateHeureDepart, Date dateHeureRetour,
							boolean assurances, boolean usureJournalier, boolean paiementCredit) {
		this.contratID = contratID;
		this.clientID = clientID; 
		this.vehiculeID = vehiculeID; 
		this.dateHeureDepart = dateHeureDepart; 
		this.dateHeureRetour = dateHeureRetour; 
		this.assurances = assurances;
		this.usureJournalier = usureJournalier;
		this.paiementCredit = paiementCredit; 		
	}
	

	public int getContratID() {
		return contratID;
	}

	public void setContratID(int contratID) {
		this.contratID = contratID;
	}

	public int getClientID() {
		return clientID;
	}

	public void setClient(int clientID) {
		this.clientID = clientID;
	}

	public int getVehiculeID() {
		return vehiculeID;
	}

	public void setVehiculeID(int vehiculeID) {
		this.vehiculeID = vehiculeID;
	}

	public Date getDateHeureDepart() {
		return dateHeureDepart;
	}

	public void setDateHeureDepart(Date dateHeureDepart) {
		this.dateHeureDepart = dateHeureDepart;
	}

	public Date getDateHeureRetour() {
		return dateHeureRetour;
	}

	public void setDateHeureRetour(Date dateHeureRetour) {
		this.dateHeureRetour = dateHeureRetour;
	}

	public boolean isAssurances() {
		return assurances;
	}

	public void setAssurances(boolean assurances) {
		this.assurances = assurances;
	}

	public boolean isUsureJournalier() {
		return usureJournalier;
	}

	public void setUsureJournalier(boolean usureJournalier) {
		this.usureJournalier = usureJournalier;
	}

	public boolean isPaiementCredit() {
		return paiementCredit;
	}

	public void setPaiementCredit(boolean paiementCredit) {
		this.paiementCredit = paiementCredit;
	}
	
	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public double getMontantBase() {
		return montantBase;
	}

	public void setMontantBase(double montantBase) {
		this.montantBase = montantBase;
	}

}
