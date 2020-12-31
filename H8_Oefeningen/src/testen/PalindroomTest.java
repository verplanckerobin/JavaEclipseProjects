package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Palindroom;

class PalindroomTest {
	
	@ParameterizedTest
	@ValueSource(strings = {"lepel", "12321", "raar raar", "hah hah hah"})
	void isPalindroom_geldigePalidroom_returnTrue(String tekst) {
		
		Assertions.assertTrue(Palindroom.isPalindroom(tekst));
		
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"niet", "geldig", "46783219", "qwe123*"})
	void isPalindroom_geldigePalidroom_returnFalse(String tekst) {
		
		Assertions.assertFalse(Palindroom.isPalindroom(tekst));
		
	}

	@ParameterizedTest
	@ValueSource(strings = {"a", "1", "*"})
	void isPalindroom_slechtsEenArgument_exception(String tekst) {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> Palindroom.isPalindroom(tekst));
		
	}
	
	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = {"", " ", "   "})
	void isPalindroom_ongeldigeTekst_exception(String tekst) {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> Palindroom.isPalindroom(tekst));
		
	}

}
