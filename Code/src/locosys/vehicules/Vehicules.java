package locosys.vehicules;

public class Vehicules {
	int vehiculeID, marque, couleur;

	public Vehicules(int vehiculeID, int marque, int couleur) { 
		this.vehiculeID = vehiculeID; 
		this.marque = marque;
		this.couleur = couleur;
	}
	
	
	
	
	
	/*
	 * Setters and getters
	 * */
	public int getVehiculeID() {
		return vehiculeID;
	}

	public void setVehiculeID(int vehiculeID) {
		this.vehiculeID = vehiculeID;
	}

	public int getMarque() {
		return marque;
	}

	public void setMarque(int marque) {
		this.marque = marque;
	}

	public int getCouleur() {
		return couleur;
	}

	public void setCouleur(int couleur) {
		this.couleur = couleur;
	}

}
