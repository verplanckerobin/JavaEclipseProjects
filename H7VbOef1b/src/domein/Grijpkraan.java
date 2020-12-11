package domein;

import java.security.SecureRandom;

public class Grijpkraan extends Automaat {

	public Grijpkraan(int aantalItems) {
		super(aantalItems);
	}

	public boolean draaiHendel() {
		
		SecureRandom sr = new SecureRandom();
		boolean gewonnen = sr.nextBoolean();

		if (gewonnen) {
			return super.draaiHendel();
			
		} else {
			setAantalMunten(getAantalMunten() + 1);
			setMuntInGleuf(false);
			return false;
		}
	}
}
