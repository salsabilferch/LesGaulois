package personnages;

public class Gaulois {
	private String nom;
	private int force;
	public int effetPotion =1;


	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
    
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}
	
	private String prendreParole() {
		return "Le gaulois" + nom + ":";
	}
	
	 public static void main(String[] args) {
	      Gaulois asterix = new Gaulois("Asterix", 8 );
	      Romain minus = new Romain ("Minus",6);
	      System.out.println("Le nom de l'objet : "+ asterix.getNom());
	      System.out.println(asterix.prendreParole());
	      asterix.parler("Bonjour");
	      asterix.frapper(minus);
	      System.out.println(asterix.toString());
	      asterix.boirePotion(8);
	 }
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion +"]";
	}

	
	public void frapper(Romain romain) {
		System.out.println(nom + "envoi un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force / 3 * effetPotion);
		
	}
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est" + forcePotion + "fois décuplée ");
	}

 
}		

  

