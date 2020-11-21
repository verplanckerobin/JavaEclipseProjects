package domein;

import java.util.List;
import java.util.*;

public class Trekking {

	private String naam;
	private List<Integer> nummers;

	public Trekking(String naam, List<Integer> nummers) {
		setNaam(naam);
		setNummers(nummers);
	}

	public String getNaam() {
		return this.naam;
	}

	public void setNaam(String value) {
		this.naam = value;
	}

	public List<Integer> getNummers() {
		return this.nummers;
	}

	public void setNummers(List<Integer> value) {
		this.nummers = value;
	}

	public int geefWinst(List<Integer> nummers) {
		int aantalJuist = 0;
		for (int nummer : nummers) {
			if (this.nummers.contains(nummer)) // door this. te schrijven weet hij dat hij het attribuut nummers moet gebruiken
				aantalJuist++;
		}
		int winst = 0;
		switch (aantalJuist) {
		case 0, 1, 2:
			winst = 0;
			break;
		case 3, 4:
			winst = 5;
			break;
		case 5:
			winst = 10;
			break;
		case 6:
			winst = 50;
			break;
		}

		return winst;
	}

}
