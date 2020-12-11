package domein;

public class SpaarRekening
{
	private final long rekeningnummer; // constant attribuut (object-eigenschap)
	private String houder;
	private double saldo;
	
	private static final double RENTE = 3.2; // constante klasse-eigenschap
	private static int aantalRekeningen; // klasse-eigenschap
	
	public SpaarRekening(long rekeningnummer, String houder)
	{
		controleerRekeningnummer(rekeningnummer);
		this.rekeningnummer = rekeningnummer;
		this.setHouder(houder);
		aantalRekeningen++;
	}
	

    private void controleerRekeningnummer(long rekeningnummer)
	{
    	long eerste10 = rekeningnummer / 100;
        int rest = (int) (rekeningnummer % 100);

        if (!(eerste10 % 97 == rest || (eerste10 % 97 == 0 && rest == 97)))
        {
            throw new IllegalArgumentException("Rekeningnummer moet correct zijn");
        }
        
		
	}


	public long getRekeningnummer() 
    {
        return rekeningnummer;
    }
/*
    private void setRekeningnummer(long rekeningnummer) 
    {
        long eerste10 = rekeningnummer / 100;
        int rest = (int) (rekeningnummer % 100);

        if (!(eerste10 % 97 == rest || (eerste10 % 97 == 0 && rest == 97)))
        {
            throw new IllegalArgumentException("Rekeningnummer moet correct zijn");
        }
        this.rekeningnummer = rekeningnummer;
    }
*/
    public String getHouder() 
    {
        return houder;
    }

    public final void setHouder(String houder) 
    {
        this.houder = houder;
    }
    
  //storten
    public boolean stortOp(double bedrag)
    {
        if (bedrag > 0)
        {
            saldo += bedrag;
            return true;
        }
        return false;
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public double bepaalEindSaldo()
    {
    	return saldo + saldo * RENTE/100;
    }


	public static double getRente()
	{
		return RENTE;
	}


	public static int getAantalRekeningen()
	{
		return aantalRekeningen;
	}
    
    
}
