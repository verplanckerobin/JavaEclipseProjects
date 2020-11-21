package domein;

public class Auto {
	
	private String kleur;
	private String merk;
	private String nrplaat;
	private int snelheid;
	
	public Auto() {
		this("grijs", "onbekend");
	}
	
	public Auto(String kleur) {
		this(kleur, "onbekend");
	}
	
	public Auto(String kleur, String merk) {
		setKleur(kleur);
		setMerk(merk);
		setNrplaat("onbekend");
	}
	
	public void versnel(int extraSnelheidErbij) {
		if (snelheid + extraSnelheidErbij < 220)
			snelheid += extraSnelheidErbij;
		else
			snelheid = 220;
	}
	
	public String getKleur() {
		return kleur;
	}
	
	public void setKleur(String kleur) {
		this.kleur = kleur;
	}
	
	public String getMerk() {
		return merk;
	}
	
	private void setMerk(String merk) {
		this.merk = merk;
	}
	
	public String getNrplaat() {
		return nrplaat;
	}
	
	public void setNrplaat(String nrplaat) {
		this.nrplaat = nrplaat;
	}
	
	public int getSnelheid() {
		return snelheid;
	}
			
}
