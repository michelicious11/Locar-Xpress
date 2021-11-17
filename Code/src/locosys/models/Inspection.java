package locosys.models;

import java.time.LocalDateTime;
import locosys.vehicules.Vehicules;

public class Inspection {
	private ContratLocation contrat; 
	private Vehicules vehicule; 
	private LocalDateTime dateInspection; 
	private double montantAccident;
	private Employe employe;
 
	public Inspection(ContratLocation contrat, double montantAccident, LocalDateTime dateInspection, Employe employe) {
		this.contrat = contrat;
		this.vehicule = contrat.getVehicule(); 
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

	public Vehicules getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicules vehicule) {
		this.vehicule = vehicule;
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
}
