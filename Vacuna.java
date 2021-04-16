public class Vacuna {
	private String nom;
	private float efectivitat;
	private int durada;
	
	Vacuna(){
		this.nom = "";
		this.efectivitat = 0;
		this.durada = 0;
	}
	
	Vacuna(String nom,float e,int d){
		this.nom=nom;
		this.efectivitat=e;
		this.durada=d;
	}
	
	Vacuna(Vacuna v){
		this.nom = v.nom;
		this.efectivitat = v.efectivitat;
		this.durada = v.durada;
	}
	
	public String toString() {
		String str = "";
		str+= "Nom: " + this.nom + "\n"
				+ "Efectivitat: " + this.efectivitat + "\n"
				+ "Durada: " + this.durada;
		return str;		
	}
	
	public boolean equals(Vacuna v) {
		boolean igual = false;
		if(this.nom.equals(v.nom)&&
				this.efectivitat==v.efectivitat&&
				this.durada==v.durada) {
			igual = true;
			
		}
		return igual;
	}
	protected String getNom() {
		return nom;
	}

	protected void setNom(String nom) {
		this.nom = nom;
	}

	protected float getEfectivitat() {
		return efectivitat;
	}

	protected void setEfectivitat(float efectivitat) {
		this.efectivitat = efectivitat;
	}

	protected int getDurada() {
		return durada;
	}

	protected void setDurada(int durada) {
		this.durada = durada;
	}
         
         public Static void main(String args[]){
          Vacuna v = new Vacuna();
        } 

}
