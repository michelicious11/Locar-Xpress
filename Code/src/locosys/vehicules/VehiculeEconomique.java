package locosys.vehicules;

public class VehiculeEconomique extends Vehicules {
	//valeur dans la base de donnees
	final private int typeVehicule = 1; 
	
	public VehiculeEconomique(int vehiculeID, int marque, int couleur) {
		super(vehiculeID, marque, couleur); 
	}
}
