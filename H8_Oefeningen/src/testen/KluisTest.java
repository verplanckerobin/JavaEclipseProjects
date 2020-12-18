package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Kluis;

class KluisTest {

	private Kluis k;
	private static final String GELDIGE_CODE = "Ab1*";
	
	@BeforeEach
	void before() {
		
		k = new Kluis(GELDIGE_CODE);
	}
	
	@Test
	void maakKluis_geldigdeCode_maaktKluis() {
		
		Assertions.assertEquals(GELDIGE_CODE, k.getCode());  
	}
	
	@ParameterizedTest
	@ValueSource(strings = {" est","t st","te t","tes ","    "})
	void maakKluis_codeMetSpaties_exception(String code) {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Kluis(code));
	}
	
	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = {"A1","ABCDEF"})
	void maakKluis_codeVerkeerdeLengte_exception(String code) {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Kluis(code));
	}
	
	@Test
	void valideerCode_juisteCode_returnTrue () {
		
		String code = GELDIGE_CODE;
		
		boolean correct = k.valideerCode(code);
		
		Assertions.assertTrue(correct);
	} 
	
	@Test
	void valideerCode_fouteCode_returnFalse () {
		
		String code = "ABCD";
		
		boolean correct = k.valideerCode(code);
		
		Assertions.assertFalse(correct);
	}

}
