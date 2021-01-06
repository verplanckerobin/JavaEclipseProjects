package domein;

public class Voorwerp {
	
	private final String naam;
	private double gewicht;
	private int niveau;
	
	public Voorwerp(String naam, double gewicht, int niveau) {
		controleerNaam(naam);
		this.naam = naam;
		setGewicht(gewicht);
		setNiveau(niveau);
	}
	

	public Voorwerp(String naam, double gewicht) {
		this(naam, gewicht, 1);
	}

	public String getNaam() {
		return naam;
	}
	
	public double getGewicht() {
		return gewicht;
	}
	
	public void setGewicht(double gewicht) {
		if(gewicht >= 0 && gewicht < 1000)
			this.gewicht = gewicht;
		else
			throw new IllegalArgumentException("Gewicht mag neit negatief of groter dan 1000 zijn");
	}
	
	public int getNiveau() {
		return niveau;
	}
	
	public void setNiveau(int niveau) {
		if(niveau >= 1 && niveau <= 10)
			this.niveau = niveau;
		else
			throw new IllegalArgumentException("Niveau mag niet kleiner dan 1 of groter dan 10 zijn");
	}
	
	private void controleerNaam(String naam) {
		if(naam == null || naam.isBlank())
			throw new IllegalArgumentException("Naam mag niet leeg zijn");
	}
	
	@Override
	public String toString() {
		return String.format("Voorwerp %s met gewicht %.3f kg uit niveau %d", naam, gewicht, niveau);
	}

}
