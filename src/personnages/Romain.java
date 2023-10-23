package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
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
	 public static void main(String[] args) {
		 Romain minus = new Romain ("Minus",6);
		 System.out.println(minus.prendreParole());
		 minus.parler("Bonjour");
		 minus.recevoirCoup(1);
	 }
}
	 
