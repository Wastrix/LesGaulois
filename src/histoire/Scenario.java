package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	Gaulois asterix = new Gaulois("Ast�rix", 8);
//	Romain minus =	new Romain ("Minus", 6)	;
//	
//	asterix.parler("Bonjour � tous");
//	minus.parler("UN GAU... UN GAUGAU...");
//	asterix.frapper(minus);
//	asterix.frapper(minus);
//	asterix.frapper(minus);
		
	Druide panoramix = new Druide("Panoramix",5,10);
	Gaulois obelix = new Gaulois("Ob�lix",20);
	Gaulois asterix = new Gaulois("Ast�rix", 8);
	Romain minus =	new Romain ("Minus", 25)	;
	panoramix.parler("Je vais aller pr�parer une petite potion...");
	panoramix.preparerPotion();
	panoramix.booster(obelix);
	panoramix.booster(asterix);
	asterix.parler("Bonjour");
	minus.parler("UN GAU... UN GAUGAU...");
	asterix.frapper(minus);
	asterix.frapper(minus);
	asterix.frapper(minus);	
	
	}

}
