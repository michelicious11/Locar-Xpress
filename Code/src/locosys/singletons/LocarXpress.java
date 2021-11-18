package locosys.singletons;

public class LocarXpress {
	   //create an object of SingleObject
	   private static LocarXpress instance = new LocarXpress();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private LocarXpress(){}

	   //Get the only object available
	   public static LocarXpress getInstance(){
	      return instance;
	   }
}
