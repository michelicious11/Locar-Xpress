package locosys.singletons;

public class RepertoireEmployes {
	   //create an object of SingleObject
	   private static RepertoireEmployes instance = new RepertoireEmployes();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private RepertoireEmployes(){}

	   //Get the only object available
	   public static RepertoireEmployes getInstance(){
	      return instance;
	   }
}
