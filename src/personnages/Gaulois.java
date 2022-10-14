package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";	
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom() + ".");
		romain.recevoirCoup(force*effetPotion/3);	
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion=forcePotion;
		parler(" Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée.");
	}
	
//	public String toString() { 
//		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]"; 
//	} 
//	public static void main(String[] args) {
//	
////		//TODO créer un main permettant de tester la classe Gaulois 
////		Gaulois asterix = new Gaulois ("Astérix",8);
////		asterix.boirePotion(5);

//	} 	
}

