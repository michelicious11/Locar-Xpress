package locosys.models;

import java.time.LocalDateTime;
import locosys.vehicules.Vehicules; 

public class ContratLocation {
	private int contratID; 
	private Client client; 
	private Vehicules vehicule;
	private LocalDateTime dateHeureDepart, dateHeureRetour;
	private boolean assurances, usureJournalier, paiementCredit;
	private int duree;
	private double montantBase; 

	
	public ContratLocation(int contratID, Client client, Vehicules vehicule, 
							LocalDateTime dateHeureDepart, LocalDateTime dateHeureRetour,
							boolean assurances, boolean usureJournalier, boolean paiementCredit) {
		this.contratID = contratID;
		this.client = client; 
		this.vehicule = vehicule; 
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client clientID) {
		this.client = client;
	}

	public Vehicules getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicules vehiculeID) {
		this.vehicule = vehicule;
	}

	public LocalDateTime getDateHeureDepart() {
		return dateHeureDepart;
	}

	public void setDateHeureDepart(LocalDateTime dateHeureDepart) {
		this.dateHeureDepart = dateHeureDepart;
	}

	public LocalDateTime getDateHeureRetour() {
		return dateHeureRetour;
	}

	public void setDateHeureRetour(LocalDateTime dateHeureRetour) {
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
