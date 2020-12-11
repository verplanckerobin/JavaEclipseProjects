package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.MijnGetal;

class MijnGetalTest
{
	private MijnGetal getal;

    @BeforeEach
    public void before()
    {
       getal = new MijnGetal(3);
    }

    @Test
    public void maakMijnGetal_getal3_wordtIngesteld()
    {
        Assertions.assertEquals(3, getal.getGetal());
    }
  /*
    @Test
    public void setGetal_waardeMin2_steltGetalOp1In()
    {
    	getal.setGetal(-2);
    	Assertions.assertEquals(1, getal.getGetal());

    }*/

    @Test
    public void setGetal_waardeMin2_geeftException()
    {
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {getal.setGetal(-2);});

    }

}
