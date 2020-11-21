package domein;

import java.security.SecureRandom;

public class Wiel {

	private int getal;

	public Wiel() {
	}

	private void setGetal(int getal) {
		this.getal = getal;
	}

	public int getGetal() {
		return this.getal;
	}

	public void draai() {
		//genereer getal in interval 0-9 en ken toe aan attribuut getal
		SecureRandom sr = new SecureRandom();
		setGetal(sr.nextInt(10));
		
	}
	
}
