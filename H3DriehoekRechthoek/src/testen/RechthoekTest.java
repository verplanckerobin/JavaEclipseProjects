package testen;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import domein.Rechthoek;

public class RechthoekTest {

    private Rechthoek r1, r2;
    
    @Before
    public void before() {
        r1 = new Rechthoek(); 
    }
    
    @Test
    public void maakRechthoek_lengte2Breedte4_maaktRechthoek() {
        r2 = new Rechthoek(2,4);
        Assert.assertEquals(4.0, r2.getBreedte(),0.01);
        Assert.assertEquals(2.0, r2.getLengte(),0.01);
    }

    @Test
    public void maakRechthoek_lengteMin2Breedte4_maaktRechthoekDefaultLengte() {
        r2 = new Rechthoek(-2,4);
        Assert.assertEquals(4.0, r2.getBreedte(),0.01);
        Assert.assertEquals(1.0, r2.getLengte(),0.01);
    }

    @Test
    public void maakRechthoek_lengte2BreedteMin4_maaktRechthoekDefaultBreedte() {
        r2 = new Rechthoek(2,-4);
        Assert.assertEquals(1.0, r2.getBreedte(),0.01);
        Assert.assertEquals(2.0, r2.getLengte(),0.01);
    }
    
    @Test
    public void berekenOppervlakte_lengte2Breedte4_oppIs8(){
        r2 = new Rechthoek(2, 4);
        Assert.assertEquals(8.0, r2.berekenOppervlakte(),0.01);
    }
    
    @Test
    public void berekenOmtrek_lengte2Breedte4_omtrekIs12(){
        r2 = new Rechthoek(2, 4);
        Assert.assertEquals(12.0, r2.berekenOmtrek(),0.01);
    }
    
    @Test
    public void maakRechthoek_maaktRechthoekDefault() {
        Assert.assertEquals(7.0, r1.getBreedte(),0.01);
        Assert.assertEquals(10.0, r1.getLengte(),0.01);
    }
    
}
