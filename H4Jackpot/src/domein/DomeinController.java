package domein;

import java.util.List;

public class DomeinController {

	private Jackpot jackpot;

	public void startNieuweJackpot() {
		jackpot = new Jackpot();
	}

	public List<Integer> geefGetallenWielen() {
		return jackpot.geefGetallenWielen();
	}

	public int geefScore() {
		return jackpot.berekenScore();
	}

	public void speel() {
		jackpot.draaiWielen();
	}
}
