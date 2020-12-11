package domein;

public class RekeningOperaties { //zie UML = Static methode in andere klasse dus we gebruiken naam van klasse om deze aan te roepen
	
	public static void stortOpEenRekening(int index, double bedrag, Rekening[] rekeningen) {
		
		if(index >= 0 && index < rekeningen.length)
			rekeningen[index].stortOp(bedrag);
	}
}
