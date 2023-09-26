package personnages;

public class Gaulois {
	private String nom;
	private int force;


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
	
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ",effetPotion=" + effetpo]";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + "envoi un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("asterix", 8 );
        System.out.println("Le nom de l'objet : "+ asterix.getNom());
    }
}		

  

