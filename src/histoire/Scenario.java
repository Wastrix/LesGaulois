package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	Gaulois asterix = new Gaulois("Astérix", 8);
//	Romain minus =	new Romain ("Minus", 6)	;
//	
//	asterix.parler("Bonjour à tous");
//	minus.parler("UN GAU... UN GAUGAU...");
//	asterix.frapper(minus);
//	asterix.frapper(minus);
//	asterix.frapper(minus);
		
	Druide panoramix = new Druide("Panoramix",5,10);
	Gaulois obelix = new Gaulois("Obélix",20);
	Gaulois asterix = new Gaulois("Astérix", 8);
	Romain minus =	new Romain ("Minus", 25)	;
	panoramix.parler("Je vais aller préparer une petite potion...");
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
