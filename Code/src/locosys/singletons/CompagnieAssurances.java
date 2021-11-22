package locosys.singletons;

public class CompagnieAssurances {
	   //create an object of SingleObject
	   private static CompagnieAssurances instance = new CompagnieAssurances();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private CompagnieAssurances(){}

	   //Get the only object available
	   public static CompagnieAssurances getInstance(){
	      return instance;
	   }
}
