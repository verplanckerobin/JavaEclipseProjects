package domein;

public class Rechthoek {
	private double lengte;
	private double breedte;
	
	public Rechthoek(double lengte, double breedte) {
		setLengte(lengte);
		setBreedte(breedte);
	}
	
	public double geefOmtrek() {
		//throw new UnsupportedOperationException();
		return 2*(lengte+breedte);
	}
	
	public double geefOppervlakte() {
		//throw new UnsupportedOperationException();
		return lengte * breedte;
	}
	
	public void schaal(int percentage) {
		//throw new UnsupportedOperationException();
		if (percentage < 1 || percentage > 200) {
			throw new IllegalArgumentException("Percentage buiten het bereik [1;200]");
		}
		
		setLengte((lengte * percentage) / 100);
		setBreedte((breedte * percentage) / 100);
	}
	
	private void setLengte(double lengte) {
		if (lengte <= 0) {
			throw new IllegalArgumentException("Lengte moet groter zijn dan 0.");
		}
		this.lengte = lengte;
	}
	
	private void setBreedte(double breedte) {
		if (breedte <= 0) {
			throw new IllegalArgumentException("Breedte moet groter zijn dan 0.");
		}
		this.breedte = breedte;
	}

	public double getLengte() {
		return lengte;
	}

	public double getBreedte() {
		return breedte;
	}

}
