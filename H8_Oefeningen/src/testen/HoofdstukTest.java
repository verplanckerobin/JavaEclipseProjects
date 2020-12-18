package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Hoofdstuk;

class HoofdstukTest {
	
	private Hoofdstuk h;
	
	@BeforeEach
	void before() {
		
		h = new Hoofdstuk();
	}

	@Test
	void maakHoofdstuk_default_maakObject() {
		
		//Hoofdstuk h = new Hoofdstuk();
		
		Assertions.assertEquals("onbekend", h.getTitel());
	}
	
	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = {"    ","a","B","5","*"})
	void setTitel_ongeldigeWaarde_exception(String titel) {
		
		//Hoofdstuk h = new Hoofdstuk();
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> h.setTitel(titel));
		
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Dit is een titel","HA","aH12"})
	void setTitel_geldigeWaardenVanMinstens2Karakters_titelWordtToegekend(String titel) {
		
		//Hoofdstuk h = new Hoofdstuk();
		
		h.setTitel(titel);
		
		Assertions.assertEquals(titel, h.getTitel());
		
	}

}
