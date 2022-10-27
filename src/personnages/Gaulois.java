package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int nb_trophees;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];
	
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
	
//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";	
//	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom() + ".");
//		romain.recevoirCoup(force*effetPotion/3);	
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees_ramassés[] = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees_ramassés != null && i < trophees_ramassés.length; i++, nb_trophees++) {
			this.trophees[nb_trophees] = trophees_ramassés[i];
		}
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion=forcePotion;
		parler(" Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée.");
	}
	

//	public static void main(String[] args) {
//	
////		//TODO créer un main permettant de tester la classe Gaulois 
////		Gaulois asterix = new Gaulois ("Astérix",8);
////		asterix.boirePotion(5);

//	} 	
}

