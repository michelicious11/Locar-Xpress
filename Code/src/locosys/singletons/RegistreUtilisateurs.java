package locosys.singletons;

public class RegistreUtilisateurs {
	   //create an object of SingleObject
	   private static RegistreUtilisateurs instance = new RegistreUtilisateurs();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private RegistreUtilisateurs(){}

	   //Get the only object available
	   public static RegistreUtilisateurs getInstance(){
	      return instance;
	   }
}
