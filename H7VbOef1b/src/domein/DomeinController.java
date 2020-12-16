package domein;

import java.util.List;

public class DomeinController {
	
	private final RekeningRepository rr; //navigeerbare asso

	public DomeinController() {
		rr = new RekeningRepository();
	}
	
	public String geefRekeningen() {
		
		String output = "";
		List<Rekening> rekeningen = rr.geefGewijzigdeRekeningen();
		
		for(Rekening rek: rekeningen) {
			output += String.format("%s%n", rek); //impliciet wordt toString aangeroepen
		}
		
		return output;
	}
	
}
