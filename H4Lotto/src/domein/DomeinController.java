package domein;

import java.util.List;
import java.util.*;

public class DomeinController {

	private TrekkingRepository trekkingRepo;

	private Trekking geselecteerdeTrekking;

	public DomeinController() {
		trekkingRepo = new TrekkingRepository();
	}

	public void registreerTrekking(String naam, List<Integer> nummers) {
		Trekking tk = new Trekking(naam, nummers);
		trekkingRepo.voegToe(tk);
	}

	public void selecteerTrekking(String naam) {
		geselecteerdeTrekking = trekkingRepo.geefTrekking(naam);
	}

	public int geefWinst(List<Integer> nummers) {
		return geselecteerdeTrekking.geefWinst(nummers);
	}
}
