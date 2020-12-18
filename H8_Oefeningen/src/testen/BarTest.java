package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Bar;

class BarTest {

	private Bar b;
	@BeforeEach
	public void before() {
		b = new Bar();
	}
	
	@Test
	public void magAlcoholDrinken_teJong_retourneertFalse() {
		//ARRANGE
		//Bar b = new Bar();
		int leeftijd = 10;
		//ACT
		boolean resultaat = b.magAlcoholDrinken(leeftijd);
		//ASSERT
		Assertions.assertFalse(resultaat);
	}

	@Test
	public void magAlcoholDrinken_oudGenoeg_retourneertTrue() {
		//Bar b = new Bar();
		int leeftijd = 22;
		boolean resultaat = b.magAlcoholDrinken(leeftijd);
		Assertions.assertTrue(resultaat);
	}

	@Test
	public void magAlcoholDrinken_grensGeval16_retourneertTrue() {
		//Bar b = new Bar();
		int leeftijd = 16;
		boolean resultaat = b.magAlcoholDrinken(leeftijd);
		Assertions.assertTrue(resultaat);
	}

}
