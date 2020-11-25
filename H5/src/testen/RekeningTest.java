package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Rekening;

public class RekeningTest 
{

    private Rekening rek;

    @BeforeEach
    public void before() 
    {
    }

    @Test
    public void maakRekening_defaultWaarden_maaktObject() 
    {
        rek = new Rekening(); //default-constructor -> auto aanwezig als er geen andere zijn!
        Assertions.assertEquals("onbekend",rek.getHouder());
        Assertions.assertEquals(123456789, rek.getRekeningnummer());
        Assertions.assertEquals(0.0, rek.getSaldo(), 0.01);
    }

    @Test
    public void maakRekening_metRekeningNummer_maaktObject() 
    {
        rek = new Rekening(4545678912345L);
        Assertions.assertEquals(4545678912345L, rek.getRekeningnummer());
        Assertions.assertEquals(0.0, rek.getSaldo(), 0.01);
        Assertions.assertEquals("onbekend",rek.getHouder());
    }

    @Test
    public void maakRekening_metRekeningNummerHouder_maaktObject() 
    {
        rek = new Rekening(2323456789123L,"Sofie");
        Assertions.assertEquals(2323456789123L, rek.getRekeningnummer());
        Assertions.assertEquals(0.0, rek.getSaldo(),0.01);
        Assertions.assertEquals("Sofie", rek.getHouder());
    }

    @Test
    public void setHouder_waardeAn_wijzigtAttribuut() 
    {
        rek = new Rekening();
        rek.setHouder("An");
        Assertions.assertEquals("An", rek.getHouder());
    }
    
    @Test
    public void stortOp_waarde100_wijzigtAttribuut() 
    {
        rek = new Rekening();
        rek.stortOp(100);
        Assertions.assertEquals(100, rek.getSaldo(),0.01);
    }
    @Test
    public void stortOp_waarde100_geeftTrueTerug() 
    {
        rek = new Rekening();
        Assertions.assertTrue(rek.stortOp(100));
    }
    
    @Test
    public void stortOp_waardeMin100_geeftFalseTerug() 
    {
        rek = new Rekening();
        Assertions.assertFalse(rek.stortOp(-100));
    }
    @Test
    public void stortOp_grenswaarde0_geeftFalseTerug() 
    {
        rek = new Rekening();
        Assertions.assertFalse(rek.stortOp(0));
    }
    
    @Test
    public void haalAf_waarde50_wijzigtAttribuut() 
    {
        rek = new Rekening();
        rek.stortOp(100);
        rek.haalAf(50);
        Assertions.assertEquals(50, rek.getSaldo(),0.01);
    }
    
    @Test
    public void haalAf_waarde50_geeftTrueTerug() 
    {
        rek = new Rekening();
        rek.stortOp(100);
        Assertions.assertTrue(rek.haalAf(50));
    }
    
    @Test
    public void haalAf_waarde150OnvoldoendeSaldo_geeftFalseTerug() 
    {
        rek = new Rekening();
        rek.stortOp(100);
        Assertions.assertFalse(rek.haalAf(150));
    }
    
    @Test
    public void haalAf_volledigSaldo_geeftTrueTerug() 
    {
        rek = new Rekening();
        rek.stortOp(50);
        Assertions.assertTrue(rek.haalAf(50));
    }
    
    @Test
    public void haalAf_volledigSaldo_saldoKomtOpNul() 
    {
        rek = new Rekening();
        rek.stortOp(50);
        rek.haalAf(50);
        Assertions.assertEquals(0, rek.getSaldo(),0.01);
    }

    @Test
    public void haalAf_waarde0_geeftFalseTerug() 
    {
        rek = new Rekening();
        Assertions.assertFalse(rek.haalAf(0));
    }


}