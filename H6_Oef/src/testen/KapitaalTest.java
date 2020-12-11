package testen;



import domein.Kapitaal;


import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KapitaalTest
{
    private Kapitaal k1, k2;
    
    @BeforeEach
    public void before()
    {
        k1 = new Kapitaal(1000, 1.22);
        k2 = new Kapitaal(2000, 2.05);
    }
    
    @Test 
    public void maakKapitaal_beginBedragMin2000_intrest1Punt47_geeftException()
    {
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {new Kapitaal(-2000, 1.47);});
    }
    
    @Test 
    public void maakKapitaal_beginBedrag1500_intrestMin2_geeftException()
    {
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {new Kapitaal(1500, -2);});

    }
    
    @Test
    public void getBeginBedrag_retourneert1000()
    {
        Assertions.assertEquals(1000.0, k1.getBeginBedrag(), 0.01);
    }
    
    @Test
    public void getIntrest_retourneert1Punt22()
    {
        Assertions.assertEquals(1.22, k1.getIntrest(), 0.01);
    }
    
    @Test 
    public void setBeginBedrag_waardeMin1234Punt56_geeftException()
    {
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {k2.setBeginBedrag(-1234.56);});
        
    }
    
    @Test 
    public void setIntrest_waarde200_geeftException()
    {
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {k2.setIntrest(200);});
        
    }
    
    @Test
    public void berekenKapitaalNaNJaar_waarde10_retourneert1128Punt92()
    {
        Assertions.assertEquals(1128.92, k1.berekenKapitaalNaNJaar(10), 0.01);
    }
    
    @Test
    public void berekenKapitaalNaNJaar_waarde25_retourneert1354Punt12()
    {
        Assertions.assertEquals(1354.12, k1.berekenKapitaalNaNJaar(25), 0.01);
    }
    
}