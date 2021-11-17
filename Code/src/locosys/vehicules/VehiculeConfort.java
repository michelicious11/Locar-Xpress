package locosys.vehicules;

public class VehiculeConfort extends Vehicules {
	//valeur dans la base de donnees
	final private int typeVehicule = 3; 
	
	public VehiculeConfort(int vehiculeID, int marque, int couleur) {
		super(vehiculeID, marque, couleur); 
	}
}
