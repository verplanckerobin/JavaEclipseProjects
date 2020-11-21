package domein;

public class Fiets {

	private String kleur;
	private String merk;
	private int aantalVersnellingen;
	private boolean herenfiets;
	private double snelheid;

	public String getKleur() {
		return this.kleur;
	}

	public void setAantalVersnellingen(int aantalVersnellingen) {
		this.aantalVersnellingen = aantalVersnellingen;
	}

	public void versnel(double versnelTot) {
		throw new UnsupportedOperationException();
	}

	public Fiets(String kleur) {
		throw new UnsupportedOperationException();
	}
}
