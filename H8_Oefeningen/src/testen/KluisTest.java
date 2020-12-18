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
	
	@BeforeEach
	void before() {
		
		k = new Kluis("Ab1*");
	}
	
	@Test
	void maakKluis_geldigdeCode_maaktKluis() {
		
		Assertions.assertEquals("Ab1*", k.getCode());  
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
	 

}
