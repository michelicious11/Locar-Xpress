package locosys.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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
	
	private static String [] users = new String[99]; 
	private static String url = "jdbc:sqlite:locosys.db";

	
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
	
	
    public static void ajouterContratLocation(ContratLocation c) {
    	
		String query = "INSERT INTO Contrat(contratID, client, vehicule,"
				+ "dateHeureDepart, dateHeureRetour,"
				+ "assurances, usureJournalier, paiementCredit) "
				+ "VALUES ('" + c.getContratID() + " , " + c.getClient() + " , " + c.getVehicule() + " , " 
							+ c.getDateHeureDepart() + " , " + c.getDateHeureRetour() + " , "
							+ c.getAssurances() + " , " + c.getIsUsureJournalier() + " , "
							+ c.getIsPaiementCredit() + "')"; 

		try(Connection conn = DriverManager.getConnection(url)) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);

		}catch(Exception e){
			e.printStackTrace();
		}
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

	public boolean getAssurances() {
		return assurances;
	}

	public void setAssurances(boolean assurances) {
		this.assurances = assurances;
	}

	public boolean getIsUsureJournalier() {
		return usureJournalier;
	}

	public void setUsureJournalier(boolean usureJournalier) {
		this.usureJournalier = usureJournalier;
	}

	public boolean getIsPaiementCredit() {
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
