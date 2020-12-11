package cui;

import domein.Grijpkraan;
import domein.KauwgomAutomaat;

public class AutomaatApplicatie {

	public static void main(String[] args) {
		
		KauwgomAutomaat ka = new KauwgomAutomaat(200);
		final int aantalPogingen = 10;
		
		System.out.printf("%d keer aan de hendel draaien van een kauwgomautomaat met %d kauwgomballen:%n",
				aantalPogingen, ka.getAantalItems());
		
		for(int teller = 1; teller <= aantalPogingen; teller++) {
			
			ka.betaal();
			System.out.printf("Poging %d: %s%n", teller, ka.draaiHendel()? String.format("%s kauwgombal", ka.bepaalKleur()):
					"Poging mislukt");
			ka.neemItem();
		}
		
		Grijpkraan g = new Grijpkraan(20);
		
		System.out.printf("%d keer aan de hendel draaien van een grijpkraan met %d prijzen:%n",
				aantalPogingen, g.getAantalItems());
		
		for(int teller = 1; teller <= aantalPogingen; teller++) {
			
			g.betaal();
			System.out.printf("Poging %d: %s%n", teller, String.format("%sprijs gewonnen", g.draaiHendel()? "": "geen "));
			g.neemItem();
		}
		
		//zonder te betalen
		System.out.print("Zonder te betalen...");
		System.out.println(ka.draaiHendel()? "toch gelukt!": "mislukt!");
		System.out.println();
		
		//munt teruggenomen
		System.out.print("Munt teruggenomen");
		ka.betaal();
		ka.neemMuntTerug();
		System.out.println(ka.draaiHendel()? "toch gelukt!": " mislukt!");
		System.out.println();
		
		//item vergeten uit te nemen!
		System.out.println("Twee pogingen, maar vergeten item er uit te nemen na de eerste...");
		ka.betaal();
		System.out.printf("Poging 1: %s%n", ka.draaiHendel()? "kauwgombal in bak": "geen kauwgombal in bak");
		ka.betaal();
		System.out.printf("Poging 2: %s%n%n", ka.draaiHendel()? "tweede kauwgombal in bak": "eerste kauwgombal zit er nog in");

	}

}
