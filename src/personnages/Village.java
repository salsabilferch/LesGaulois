package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageoisMaximum;
	private Gaulois [] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	public void setchef(Chef chef ) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois gaulois) {
		if(nbVillageois < nbVillageoisMaximum) {
			villageois [nbVillageois] = gaulois;
			nbVillageois ++;
		}
		
	}
	public 	Gaulois trouverHabitant(int numVillageois) {
		if(numVillageois >=0 && numVillageois-1 < nbVillageois) {
			return villageois [nbVillageois];
		}
		else {
			System.out.println("ERREUR");
			return null;
		}
	}
	public void afficherVillageois() {
		System.out.println("Dans village du chef "+chef.getNom() +" vivent les legendaires gaulois : ");
		for(int i=0 ; i<nbVillageois ; i++) {
			System.out.println("-"+ villageois[i].getNom());
		}
		
	}
	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles",30);
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		village.setchef(abraracourcix);
		
		Gaulois asterix = new Gaulois("Asterix",8);
		village.ajouterHabitant(asterix);
		
		Gaulois gaulois = village.trouverHabitant(1);
		System.out.println(gaulois);
		
		Gaulois obelix = new Gaulois("Obelix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();

	}

}
