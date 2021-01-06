package domein;

public class Sleutel extends Voorwerp {
	
	private int deur;
	private static int aantalInOmloop;
	
	public Sleutel(String naam, double gewicht, int niveau, int deur) {
		super(naam, gewicht, niveau);
		setDeur(deur);
		aantalInOmloop++;
	}

	public int getDeur() {
		return deur;
	}

	public void setDeur(int deur) {
		if(deur >= 0)
			this.deur = deur;
		else
			throw new IllegalArgumentException("Deur mag geen negatieve waarde hebben");
	}

	public static int getAantalInOmloop() {
		return aantalInOmloop;
	}
	
	public boolean pastOp(int deur) {
		if(deur == this.deur)
			return true;
					
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("Sleutel %s met gewicht %.3f kg uit niveau %d past op deur %d.%n"
				+ "Er zijn %d sleutel(s) in omloop.", super.getNaam(), super.getGewicht(), super.getNiveau(), deur, aantalInOmloop);
	}

}
