package domein;

public class Wapen extends Voorwerp {
	
	private int kracht;
	private boolean gebruikt;
	
	public Wapen(String naam, double gewicht, int niveau, int kracht, boolean gebruikt) {
		super(naam, gewicht, niveau);
		controleerNiveau(niveau);
		setKracht(kracht);
		setGebruikt(gebruikt);
	}

	public int getKracht() {
		return kracht;
	}

	public boolean isGebruikt() {
		return gebruikt;
	}

	public void setKracht(int kracht) {
		if(kracht >= 0)
			this.kracht = kracht;
		else
			throw new IllegalArgumentException("Kracht mag niet negatief zijn");
	}

	public void setGebruikt(boolean gebruikt) {
		this.gebruikt = gebruikt;
	}
	
	private void controleerNiveau(int niveau) {
		if(niveau >= 5)
			throw new IllegalArgumentException("Wapens zijn enkel beschikbaar van niveau 1 tem 5");
	}
	
	@Override
	public String toString() {
		return String.format("Wapen %s met gewicht %.3f kg uit niveau %d en met kracht %d %s gebruikt.", 
				super.getNaam(), super.getGewicht(), super.getNiveau(), kracht, gebruikt == true ? "al" : "nog niet");
	}
	
}
