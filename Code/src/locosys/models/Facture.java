package locosys.models;

import java.time.LocalDateTime;
import java.util.Date;

public class Facture {
	private Inspection inspection;
	private ContratLocation contrat; 
	private int clientID;
	Date dateHeureDepart;
	private Date dateHeureRetour;
	private boolean isUsureJournalier, isPaiementCredit;
	private double montantBase; 
	private int duree; 
	private final double tauxAssurances = 21.40; 
	private final double tauxUsureJournalier = 18.45;
	private final double tauxUsure500km = 0.21;
	private final double fraisRetard = 0.1; 
	private final double fraisTaxes = 0.15;
	private final double fraisEssence = 1.41; 
	
	public Facture(Inspection inspection) {
		this.inspection = inspection;
		this.contrat = inspection.getContrat(); 
		this.clientID = inspection.getContrat().getClientID();
		this.dateHeureDepart = inspection.getContrat().getDateHeureDepart(); 
		this.dateHeureRetour = inspection.getContrat().getDateHeureRetour();
		this.isUsureJournalier = inspection.getContrat().isUsureJournalier();
		this.isPaiementCredit = inspection.getContrat().isPaiementCredit();
		this.duree = inspection.getContrat().getDuree(); 
		this.montantBase = inspection.getContrat().getMontantBase(); 	
	}
	

	public void calculateDureeContrat() {
		this.duree = 1; 
	}
	
	public double calculateAssurances(){
		return 1;
	}

	public double calculateUsure(){
		return 1;
	}
	
	public double calculateRetard(){
		return 1;
	}
	
	public double calculateEssence(){
		return 1;
	}
	
	public double calculateTaxes(){
		return 1;
	}
}
