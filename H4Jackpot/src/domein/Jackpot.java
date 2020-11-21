package domein;

import java.util.List;
import java.util.ArrayList;

public class Jackpot {

	private List<Wiel> wielen;

	public Jackpot() {
		wielen = new ArrayList<>();
		for (int i = 0; i < 3; i++)
			wielen.add(new Wiel());
	}

	public List<Integer> geefGetallenWielen() {
		//alle objecten uit de verzameling wielen overlopen, getal opvragen voor elk object & getal in verzameling stoppen
		
		List<Integer> getallenOpWielen = new ArrayList<>();
		for(Wiel w: wielen) { //enhanced for
			getallenOpWielen.add(w.getGetal());	
		}
		
		return getallenOpWielen;
	}

	public void draaiWielen() {
		//enhanced for gebruiken, voor elk object in Wielen, gaan we methode draai oproepen per object
		for(Wiel w: wielen) 
			w.draai();
	}

	public int berekenScore() {
		int getal1 = wielen.get(0).getGetal();
		int getal2 = wielen.get(1).getGetal();
		int getal3 = wielen.get(2).getGetal();
		
		if(getal1 == getal2 && getal1 == getal3) { //alle drie de getallen gelijk aan elkaar
			if(getal1 == 9)
				return 50;
			else
				return 10;
		} else {
			if (getal1 == getal2 || getal1 == getal3 || getal2 == getal3)
				return 5;
			else
				return 0;
		}
	}
}
