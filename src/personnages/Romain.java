package personnages;

public class Romain {
	private String nom;
	private int force;
	
	private Equipement[] equipements;
	private int nbEquipement;
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[2];
		this.nbEquipement = 0;
		assert this.force > 0 :("La force positive");
	}

	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() +  "<<" + texte + ">>");
	}
		
	private String prendreParole() {
		return "Le romain" + nom + ":";
	}

	public void recevoirCoup(int forceCoup) {
		//precondition
		assert force > 0;
		int forcedebut = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie !");
		}else {
			parler("J'abandonne ...");
		}
		//postecondition la force a diminué
		assert force<forcedebut;
	}
	
	public void sEquiper(Equipement equipement) {
		String soldat = "Le soldat "+ nom;
		switch(nbEquipement) {
		case 2:
			System.out.println(soldat +" est dejas bien protege !");
			break;
		case 1:
			if(equipements[0]==equipement) {
				System.out.println(soldat+" posséde dejas un "+equipement+" .");
			}else {
				System.out.println(soldat +" s'equipe avec un "+equipement+" !");
				equipements[1]=equipement;
				nbEquipement++;
			}
			break;
		default:
			equipements[0]=equipement;
			nbEquipement++;
			System.out.println(soldat +" s'equipe avec un "+equipement+" .");
			break;
		}
	}

	 public static void main(String[] args) {
		 Romain minus = new Romain ("Minus",6);
		 System.out.println(minus.prendreParole());
		 minus.parler("Bonjour");
		 minus.recevoirCoup(1);
		 
		 minus.sEquiper(Equipement.CASQUE);
		 minus.sEquiper(Equipement.CASQUE);
		 minus.sEquiper(Equipement.BOUCLIER);
		 minus.sEquiper(Equipement.CASQUE);
		 
		 System.out.println("-"+Equipement.CASQUE);
		 System.out.println("-"+Equipement.BOUCLIER);
	 }
}
	 
