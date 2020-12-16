package domein;

import java.util.List;

import persistentie.RekeningMapper;

public class RekeningRepository {
	
	private final RekeningMapper rm;
	private final List<Rekening> rekeningen;
	
	public RekeningRepository() {
		
		//BELANGRIJK! H7VB2 1:14:00
		rm = new RekeningMapper(); //eens dit verwijst naar object van klasse, kan attribuut final worden
		rekeningen = rm.geefRekeningen();
		//null-point exceptie = attribuut niet geinitialiseerd met object
	}
	
	public List<Rekening> geefGewijzigdeRekeningen() {
		for(Rekening r: rekeningen) {
			
			if(r instanceof SpaarRekening) {
				double bedrag = r.getSaldo() * SpaarRekening.getAangroeiIntrest() / 100;
				r.stortOp(bedrag);
			} else if(r instanceof ZichtRekening) {
				((ZichtRekening) r).setMaxKredietOnderNul(((ZichtRekening) r).getMaxKredietOnderNul() - 10);
			}
			
		}
		
		return rekeningen;
	}

}
