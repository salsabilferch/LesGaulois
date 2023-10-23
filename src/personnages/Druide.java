package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion =1;

	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide" + nom + " et ma potion peut aller d'une force "+effetPotionMin +"a"+ effetPotionMax + ".");
	}


	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}
	private String prendreParole() {
		return "Le druide" + nom + ":";
	}
	
	public void preparePotion() {
		Random rnd = new Random();
		forcePotion = effetPotionMin + rnd.nextInt(effetPotionMax - effetPotionMin);
		if (forcePotion > 7) {
			parler("J'ai préparé une super potion de force" + forcePotion);
		}else {
			parler(" Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force" + forcePotion);
		}
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Druide panoramix = new Druide("Paroramix",5,10);
		panoramix.preparePotion();
		panoramix.booster(asterix);
	}
	public void booster(Gaulois gaulois) {
		if ("Obélix".equals(gaulois.getNom())) {
			parler("Non, Obélix ! ... Tu n'auras pas de potion magique!");
		}else {
			gaulois.boirePotion(forcePotion);
		}
	}


}
