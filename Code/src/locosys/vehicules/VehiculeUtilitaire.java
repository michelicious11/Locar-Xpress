package locosys.vehicules;

public class VehiculeUtilitaire extends Vehicules {
	//valeur dans la base de donnees
	final private int typeVehicule = 5; 
	
	public VehiculeUtilitaire(int vehiculeID, int marque, int couleur) {
		super(vehiculeID, marque, couleur); 
	}
}
