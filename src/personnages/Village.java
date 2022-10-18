package personnages;

public class Village {
	private String nom; 
	private Chef chef; 
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) { 
		this.nom = nom; 
		villageois = new Gaulois[nbVillageoisMaximum];	
	 } 

	public void setChef(Chef chef) { 
		this.chef = chef; 
	 }
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant(int n) {
		return villageois[n];
	}
	
	public void afficherVillageois () {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires gaulois:");
		for (int i = 0; i < nbVillageois; i++) {
			Gaulois gaulois = trouverHabitant(i);
			System.out.println("- " + gaulois.getNom());
		}
	}
	
	public static void main(String[] args) {
		Village villageDesIrreductibles =new Village("Village Des Irréductibles", 30);
//		Gaulois gaulois = villageDesIrreductibles.trouverHabitant(30);
		Chef abraracourcix = new Chef("Abraracourcix",6,villageDesIrreductibles);
		villageDesIrreductibles.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		villageDesIrreductibles.ajouterHabitant(asterix);
//		Gaulois gaulois = villageDesIrreductibles.trouverHabitant(1);
//		System.out.println(gaulois);
		Gaulois obelix = new Gaulois("Obélix", 25);
		villageDesIrreductibles.ajouterHabitant(obelix);
		villageDesIrreductibles.afficherVillageois();
	}
}
