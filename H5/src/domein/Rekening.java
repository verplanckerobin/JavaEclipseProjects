package domein;

public class Rekening {
	
	private long rekeningnummer;
	private double saldo;
	private String houder;
	
	public Rekening() {
		this(123456789);
	}
	
	public Rekening(long rekeningnummer) {
		this(rekeningnummer, "onbekend");
	}

	public Rekening(long rekeningnummer, String houder) {
		this.setRekeningnummer(rekeningnummer);
		this.setHouder(houder);
	}
	
	private void setRekeningnummer(long rekeningnummer) {
		this.rekeningnummer = rekeningnummer;
	}

	public void setHouder(String houder) {
		this.houder = houder;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getHouder() {
		return houder;
	}
	
	public long getRekeningnummer() {
		return rekeningnummer;
	}
	
	public boolean stortOp(double bedrag) {
		if(bedrag > 0) {
			saldo += bedrag;
			return true; 
		}
		return false;
	}
	
	public boolean haalAf(double bedrag) {
		if(bedrag > 0 && bedrag <= saldo) {
			saldo -= bedrag;
			return true;
		}
		return false;
	}

}
