package cui;

import domein.Rekening;

public class H5_29 {

	public static void main(String[] args) {
		
		double gem, som = 0;
		String result = "";
		
		double[] bedragen = {100, 777.77, 287.15, -350, 399.99, 123.45, 987.65, -68.18, 413.26};
		Rekening[] rekeningen = new Rekening[bedragen.length]; //null-referenties in de array
		//maw nog GEEN rekening-objecten want nog geen constructor gebruikt
		
		for(int i = 0; i < rekeningen.length; i++) {
			String houder = String.format("%c", 'A' + i); //chars omzetten naar String dus telkens A B C ...
			rekeningen[i] = new Rekening(i, houder); 
			rekeningen[i].stortOp(bedragen[i]);
		}
		
		for(Rekening rekening: rekeningen) {
			result += String.format("Rekening %d van %s bevat %.2f%n", 
					rekening.getRekeningnummer(), rekening.getHouder(), rekening.getSaldo());
			
			som += rekening.getSaldo();
		}
		
		gem = som / rekeningen.length;
		
		result += String.format("%nHet gem van deze %d rekeningen bedraagt %.2f euro%n", rekeningen.length, gem);
		
		System.out.printf(result); //omdat we %n gebruiken is het belangrijk dat we printen met printf
	}

}
