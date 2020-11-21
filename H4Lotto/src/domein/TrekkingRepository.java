package domein;

import java.util.*;

public class TrekkingRepository {

	private List<Trekking> trekkingen;

	public TrekkingRepository() {
		trekkingen = new ArrayList<>();
		List<Integer> cijfers = new ArrayList<>(); //we maken een trekking aan om de winst te kunnen vergelijken
		cijfers.add(1);
		cijfers.add(2);
		cijfers.add(3);
		cijfers.add(4);
		cijfers.add(5);
		cijfers.add(6);
		trekkingen.add(new Trekking("trekking1", cijfers));
	}

	public void voegToe(Trekking trekking) {
		trekkingen.add(trekking);
	}

	public Trekking geefTrekking(String naam) { //voorbeeld om 2 stukken tekst met elkaar te vergelijken
		for (Trekking trekking: trekkingen) {
			if (trekking.getNaam().equals(naam)) //als het gelijk is krijg je True anders False
				return trekking;
		}
		//als er geen object teruggevonden wordt moet ik toch iets teruggeven van Type Trekking
		return null;
	}
}
