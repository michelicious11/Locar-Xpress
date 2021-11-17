package locosys.singletons;

public class CatalogueVehicules {

	   //create an object of SingleObject
	   private static CatalogueVehicules instance = new CatalogueVehicules();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private CatalogueVehicules(){}

	   //Get the only object available
	   public static CatalogueVehicules getInstance(){
	      return instance;
	   }
}
