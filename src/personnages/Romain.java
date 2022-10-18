package personnages;

public class Romain  { 
	private String nom; 
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) { 
		this.nom = nom; 
		this.force = force; 
		assert(force>0);
	} 
	
	public String getNom() { 
		return nom; 
	} 
	
	public void parler(String texte) { 
		System.out.println(prendreParole() + "� " + texte + "�"); 
	} 
	
	private String prendreParole() { 
		return "Le romain " + nom + " : "; 
	} 
	
	public void recevoirCoup(int forceCoup) { 
		force -= forceCoup; 
		if (force > 0) { 
			parler("A�e"); 
		} else { 
			parler("J'abandonne..."); 
		} 
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", -6);
	}
} 
