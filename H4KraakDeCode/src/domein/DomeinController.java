package domein;

import java.util.List;
import java.util.*;

public class DomeinController {

	private KopOfMuntSpel spel;

	public void maakSpel(int moeilijkheidsgraad) {
		spel = new KopOfMuntSpel(moeilijkheidsgraad);
	}

	public int geefScore(String geradenCode) {
		return spel.geefScore(geradenCode);
	}

	public boolean isGeraden(String geradenCode) {
		return spel.isGeraden(geradenCode);
	}

	public List<String> geefSpelInfo() {
		
		List<String> geefSpelInfo = new ArrayList<>();
		
		geefSpelInfo.add(String.format("%d", spel.getMoeilijkheidsgraad()));
		geefSpelInfo.add(spel.getCode());
		
		return geefSpelInfo;
		
	}
}
