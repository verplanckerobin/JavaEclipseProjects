package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Rechthoek;

class RechthoekTest {

	@Test
	void maakRechthoek_lengteOkBreedteOk_maakRechthoek() {
		//Arrange
		double lengte = 5.5;
		double breedte = 3.3;
		
		//Act
		Rechthoek r = new Rechthoek(lengte, breedte);
		
		//Assert
		Assertions.assertEquals(lengte, r.getLengte(), 0.01);
		Assertions.assertEquals(breedte, r.getBreedte(), 0.01);
	}
	
	@Test
	void maakRechthoek_lengteOkBreedteNok_exception() {
		
		double lengte = 5.5;
		double breedte = -3.3;
		
		//Act & Assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Rechthoek(lengte, breedte));
	}
	
	@Test
	void maakRechthoek_lengteNokBreedteOk_exception() {
		
		double lengte = -5.5;
		double breedte = 3.3;
		
		//Act & Assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Rechthoek(lengte, breedte));
	}
	
	@Test
	void maakRechthoek_lengteGrenswaardeBreedteOk_exception() {
		
		double lengte = 0;
		double breedte = 3.3;
		
		//Act & Assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Rechthoek(lengte, breedte));
	}
	
	@Test
	void maakRechthoek_lengteOkBreedteGrenswaarde_exception() {
		
		double lengte = 5.5;
		double breedte = 0;
		
		//Act & Assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Rechthoek(lengte, breedte));
	}
	
	@Test
	void geefOmtrek_returnOmtrek() {
		
		Rechthoek r = new Rechthoek(5.5, 3.3);
		
		double omtrek = r.geefOmtrek();
		
		Assertions.assertEquals(17.6, omtrek);
	}
	
	@Test
	void geefOppervlakte_returnOppervlakte() {
		
		Rechthoek r = new Rechthoek(5.5, 3.3);
		
		double oppervlakte = r.geefOppervlakte();
		
		Assertions.assertEquals(18.15, oppervlakte);
	}
	
	/*@Test
	void schaal_percentageKleinerDan1_exception() {
		
		Rechthoek r = new Rechthoek(5.5, 3.3);
		int percentage = -5;
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> r.schaal(percentage));
	} */
	
	/*@Test
	void schaal_percentageGroterDan200_exception() {
		
		Rechthoek r = new Rechthoek(5.5, 3.3);
		int percentage = 210;
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> r.schaal(percentage));
	} */
	
	//deze vervangt bovenstaande teksten die in commentaar staan
	@ParameterizedTest
	@ValueSource(ints = {-5, -1, 201, 210})
	void schaal_percentageBuitenInterval_exception(int percentage) {
		
		Rechthoek r = new Rechthoek(5.5, 3.3);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> r.schaal(percentage));
	}
	
	@Test
	void schaal_percentage150_vergrotenRechthoek() {
		
		Rechthoek r = new Rechthoek(5.5, 3.3);
		int percentage = 150;
		
		r.schaal(percentage);
		
		Assertions.assertEquals(8.25, r.getLengte(), 0.01);
		Assertions.assertEquals(4.95, r.getBreedte(), 0.01);
	}
	
	@Test
	void schaal_percentage50_verkleinenRechthoek() {
		
		Rechthoek r = new Rechthoek(5.5, 3.3);
		int percentage = 50;
		
		r.schaal(percentage);
		
		Assertions.assertEquals(2.75, r.getLengte(), 0.01);
		Assertions.assertEquals(1.65, r.getBreedte(), 0.01);
	}
	
	@Test
	void schaal_percentage100_gelijkBlijvenRechthoek() {
		
		Rechthoek r = new Rechthoek(5.5, 3.3);
		int percentage = 100;
		
		r.schaal(percentage);
		
		Assertions.assertEquals(5.5, r.getLengte(), 0.01);
		Assertions.assertEquals(3.3, r.getBreedte(), 0.01);
	}
	
	@Test
	void schaal_percentageGrenswaarde1_verkleinenRechthoek() {
		
		Rechthoek r = new Rechthoek(5.5, 3.3);
		int percentage = 1;
		
		r.schaal(percentage);
		
		Assertions.assertEquals(0.055, r.getLengte(), 0.001);
		Assertions.assertEquals(0.033, r.getBreedte(), 0.001);
	}
	
	@Test
	void schaal_percentageGrenswaarde200_vergrotenRechthoek() {
		
		Rechthoek r = new Rechthoek(5.5, 3.3);
		int percentage = 200;
		
		r.schaal(percentage);
		
		Assertions.assertEquals(11.0, r.getLengte(), 0.01);
		Assertions.assertEquals(6.6, r.getBreedte(), 0.01);
	}
}
