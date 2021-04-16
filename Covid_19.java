public class Covid_19 extends Vacuna{
	
	private String efectesSecundaris;
	
	public Covid_19() {
		this.efectesSecundaris = "";
		
	}
	
	public Covid_19(String nom, float efectivitat, int durada,String efectesSecundaris) {
		super.nom  = nom;
		super.efectivitat = efectivitat;
		super.durada = durada;
		this.efectesSecundaris = efectesSecundaris;	
	}
	
	public Covid_19(Covid_19 cv) {
		super.nom = cv.nom;
		super.efectivitat = cv.efectivitat;
		super.durada = cv.durada;
		this.efectesSecundaris = cv.efectesSecundaris;
		
	}

	protected String getEfectesSecundaris() {
		return efectesSecundaris;
	}

	protected void setEfectesSecundaris(String efectesSecundaris) {
		this.efectesSecundaris = efectesSecundaris;
	}
	