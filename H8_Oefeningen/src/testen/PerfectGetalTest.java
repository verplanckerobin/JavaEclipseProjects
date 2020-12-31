package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import domein.PerfectGetal;

class PerfectGetalTest {

	@ParameterizedTest
	@ValueSource(ints = {-1, -5, -20, -100})
	void isPerfect_negatiefGetal_exception(int getal) {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> PerfectGetal.isPerfect(getal));
		
	}
	
	@ParameterizedTest
	@ValueSource(ints = {6, 28})
	void isPerfect_getalIsPerfect_returnTrue(int getal) {
		
		Assertions.assertTrue(PerfectGetal.isPerfect(getal));
	
	}
	
	@ParameterizedTest
	@ValueSource(ints = {10, 20, 30})
	void isPerfect_getalIsNietPerfect_returnFalse(int getal) {
		
		Assertions.assertFalse(PerfectGetal.isPerfect(getal));
	
	}

}
