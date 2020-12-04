package domein;

public class Rekening { //extends Object -> ook toString()-methode
	
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
	//sofie.schrijfBedragOverNaar(30, an);
	public boolean schrijfBedragOverNaar(double bedrag, Rekening naarRek) { //zie UML
		
		//sofie = this -> praten met rek sofie
		//an = naarRek -> praten met rek an
		boolean gelukt = this.haalAf(bedrag);
		if(gelukt) {
			naarRek.stortOp(bedrag);
			return true;
		}
		return false;
	}
	
	//toString -> zorgt voor een Stringrepresentatie vh object, returned Object in stringformaat
	//String.format(...);
	//System.out.println(rek1.toString()); //expliciet
	//System.out.println(rek1); //impliciete aanroep
	@Override
	public String toString() { //zie UML
		
		String res = String.format("Deze rekening heeft als houder %s, als rekeningNr %d en als saldo %.1f%n",
				houder, rekeningnummer, saldo);
		return res;
	}
	

}
