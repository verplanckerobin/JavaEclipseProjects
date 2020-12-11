package domein;

import java.security.SecureRandom;

public class KauwgomAutomaat extends Automaat {

	private static final String[] KLEUREN = { "blauwe", "gele", "groene", "rode", "witte", "roze", "paarse"};

	public KauwgomAutomaat(int aantalItems) {
		super(aantalItems);
	}

	public String bepaalKleur() {
		SecureRandom sr = new SecureRandom();
		return KLEUREN[sr.nextInt(7)]; //[0-6]
		
	}
}
