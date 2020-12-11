package domein;

public class Kapitaal
{
    private double beginBedrag, intrest;

    public Kapitaal(double beginBedrag, double intrest)
    {
        setBeginBedrag(beginBedrag);
        setIntrest(intrest);
    }

    public double getBeginBedrag()
    {
        return beginBedrag;
    }

    public final void setBeginBedrag(double beginBedrag)
    {
        if (beginBedrag < 0)
            throw new IllegalArgumentException
                ("Fout beginbedrag: moet minstens 0 zijn");
        this.beginBedrag = beginBedrag;
    }

    public double getIntrest()
    {
        return intrest;
    }

    public final void setIntrest(double intrest)
    {
        if (!(intrest >= 0 && intrest <= 100))
            throw new IllegalArgumentException
                ("Foute intrest: moet tussen 0 en 100 liggen (grenzen inbegrepen)");
        this.intrest = intrest;
    }
    
    public double berekenKapitaalNaNJaar(int n)
    {
        //basis case -> 0 jaar dan beginbedrag
    	if(n == 0)
    		return this.beginBedrag;
    	//rec betrekking: Formule: K(n) = 1.025 * K(n-1) gegeven in opgave
    	else
    		return (1 + intrest/100)* berekenKapitaalNaNJaar(n - 1);
    	 
    }
}
