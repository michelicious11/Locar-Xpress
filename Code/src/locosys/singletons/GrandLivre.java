package locosys.singletons;

public class GrandLivre {
	   //create an object of SingleObject
	   private static GrandLivre instance = new GrandLivre();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private GrandLivre(){}

	   //Get the only object available
	   public static GrandLivre getInstance(){
	      return instance;
	   }
}
