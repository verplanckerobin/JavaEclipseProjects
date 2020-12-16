package domein;

public class ZichtRekening extends Rekening {
	
	private double maxKredietOnderNul;

	public ZichtRekening(long rekeningNr, String houder, double maxKredietOnderNul) {
		super(rekeningNr, houder);
		setMaxKredietOnderNul(maxKredietOnderNul);
	}
	
	@Override
	public boolean haalAf(double bedrag) {
		if(getSaldo() - bedrag >= maxKredietOnderNul)
			return super.haalAf(bedrag);;
		
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("%s. Max krediet onder nul = %.2f", super.toString(), maxKredietOnderNul);
	}

	public double getMaxKredietOnderNul() {
		return maxKredietOnderNul;
	}

	public final void setMaxKredietOnderNul(double maxKredietOnderNul) {
		if(maxKredietOnderNul > 0 || maxKredietOnderNul > getSaldo())
			throw new IllegalArgumentException("Je krediet onder 0 moet een negatieve waarde zijn en kleiner of gelijk aan het huidige saldo");
		
		this.maxKredietOnderNul = maxKredietOnderNul;
	}

}
