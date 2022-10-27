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
	
	private void ajouterEquipement(Equipement equipement) {
		equipements[nbEquipement]=equipement;
		nbEquipement++;
		System.out.println("Le soldat " + nom + " s'�quipe avec un " + equipement.toString() + ".");
	}
	
	public void sEquiper(Equipement equipement ) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est d�ja bien prot�g� !");
			break;
		case 1:
			if (equipements[0]==equipement) {
				System.out.println("Le soldat " + nom + " poss�de d�j� un " + equipement.toString() + " !");
			}
			else {
				ajouterEquipement(equipement);
			}
			break;
		default:
			ajouterEquipement(equipement);
			break;
		}
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", -6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);

		
	}
} 
