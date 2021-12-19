package locosys.models; 

public class Modalites {

	private static double prixClasseEconomique = 61.0;
	private static double prixClasseMoyenne = 72.0;
	private static double prixClasseConfort = 83.0;
	private static double prixClasseLuxe = 114.0;
	private static double prixClasseUtilitaire = 99.0;
	private static double fraisUsureForfait1Argent = 0.21;
	private static int fraisUsureForfait1Km = 500;
	private static double fraisUsureForfait2Argent = 18.45;
	private static double fraisUsureForfait2Km = Double.POSITIVE_INFINITY;
	private static double fraisEssence = 1.41;
	private static double fraisAssurance = 21.40;
	private static double taxesProvinciales =  0.0975;
	private static double taxesFederales	= 0.05;
	private static double cautionEnEspeces	= 350.0;

	public static void setFraisUsureForfait2Km(double fraisUsureForfait2Km) {
		Modalites.fraisUsureForfait2Km = fraisUsureForfait2Km;
	}
	public static double getPrixClasseEconomique() {
		return prixClasseEconomique;
	}
	public static void setPrixClasseEconomique(double prixClasseEconomique) {
		Modalites.prixClasseEconomique = prixClasseEconomique;
	}
	public static double getPrixClasseMoyenne() {
		return prixClasseMoyenne;
	}
	public static void setPrixClasseMoyenne(double prixClasseMoyenne) {
		Modalites.prixClasseMoyenne = prixClasseMoyenne;
	}
	public static double getPrixClasseConfort() {
		return prixClasseConfort;
	}
	public static void setPrixClasseConfort(double prixClasseConfort) {
		Modalites.prixClasseConfort = prixClasseConfort;
	}
	public static double getPrixClasseLuxe() {
		return prixClasseLuxe;
	}
	public static void setPrixClasseLuxe(double prixClasseLuxe) {
		Modalites.prixClasseLuxe = prixClasseLuxe;
	}
	public static double getPrixClasseUtilitaire() {
		return prixClasseUtilitaire;
	}
	public static void setPrixClasseUtilitaire(double prixClasseUtilitaire) {
		Modalites.prixClasseUtilitaire = prixClasseUtilitaire;
	}
	public static double getFraisUsureForfait1Argent() {
		return fraisUsureForfait1Argent;
	}
	public static void setFraisUsureForfait1Argent(double fraisUsureForfait1Argent) {
		Modalites.fraisUsureForfait1Argent = fraisUsureForfait1Argent;
	}
	public static int getFraisUsureForfait1Km() {
		return fraisUsureForfait1Km;
	}
	public static void setFraisUsureForfait1Km(int fraisUsureForfait1Km) {
		Modalites.fraisUsureForfait1Km = fraisUsureForfait1Km;
	}
	public static double getFraisUsureForfait2Argent() {
		return fraisUsureForfait2Argent;
	}
	public static void setFraisUsureForfait2Argent(double fraisUsureForfait2Argent) {
		Modalites.fraisUsureForfait2Argent = fraisUsureForfait2Argent;
	}
	public static double  getFraisUsureForfait2Km() {
		return fraisUsureForfait2Km;
	}
	public static void setFraisUsureForfait2Km(int fraisUsureForfait2Km) {
		Modalites.fraisUsureForfait2Km = fraisUsureForfait2Km;
	}
	public static double getFraisEssence() {
		return fraisEssence;
	}
	public static void setFraisEssence(double fraisEssence) {
		Modalites.fraisEssence = fraisEssence;
	}
	public static double getFraisAssurance() {
		return fraisAssurance;
	}
	public static void setFraisAssurance(double fraisAssurance) {
		Modalites.fraisAssurance = fraisAssurance;
	}
	public static double getTaxesProvinciales() {
		return taxesProvinciales;
	}
	public static void setTaxesProvinciales(double taxesProvinciales) {
		Modalites.taxesProvinciales = taxesProvinciales;
	}
	public static double getTaxesFederales() {
		return taxesFederales;
	}
	public static void setTaxesFederales(double taxesFederales) {
		Modalites.taxesFederales = taxesFederales;
	}
	public static double getCautionEnEspeces() {
		return cautionEnEspeces;
	}
	public static void setCautionEnEspeces(double cautionEnEspeces) {
		Modalites.cautionEnEspeces = cautionEnEspeces;
	}
}
