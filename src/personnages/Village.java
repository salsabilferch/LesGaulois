package personnages;

public class Village {
	private String nom;
	private Chef chef;
	
	public Village(String nom) {
		this.nom = nom;
	}
	public void setchef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	private Village[] villageois ;
	private int nbvillageois = 0;
	public Village(int nbVillageoisMaximum) {
		villageois = new Village[nbVillageoisMaximum];
	}
	public void ajouter

}
