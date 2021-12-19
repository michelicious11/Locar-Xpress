package locosys.models;

import java.time.LocalDateTime;
import locosys.vehicules.Vehicules;

public class Inspection {
	private ContratLocation contrat; 
	private int vehiculeID; 
	private LocalDateTime dateInspection; 
	private double essenceLitres, montantAccident;

	private Employe employe;
 
	public Inspection(ContratLocation contrat, double montantAccident, LocalDateTime dateInspection, Employe employe) {
		this.contrat = contrat;
		this.vehiculeID = contrat.getVehiculeID(); 
		this.montantAccident = montantAccident;
		this.dateInspection = dateInspection; 
		this.contrat = contrat; 
		this.employe = employe;
	}

	public ContratLocation getContrat() {
		return contrat;
	}

	public void setContrat(ContratLocation contrat) {
		this.contrat = contrat;
	}

	public int getVehicule() {
		return vehiculeID;
	}

	public void setVehicule(int vehiculeID) {
		this.vehiculeID = vehiculeID;
	}

	public LocalDateTime getDateInspection() {
		return dateInspection;
	}

	public void setDateInspection(LocalDateTime dateInspection) {
		this.dateInspection = dateInspection;
	}

	public double getMontantAccident() {
		return montantAccident;
	}

	public void setMontantAccident(double montantAccident) {
		this.montantAccident = montantAccident;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmployeId(Employe employe) {
		this.employe = employe;
	}
	public double getEssenceLitres() {
		return essenceLitres;
	}

	public void setEssenceLitres(double essenceLitres) {
		this.essenceLitres = essenceLitres;
	}
}
