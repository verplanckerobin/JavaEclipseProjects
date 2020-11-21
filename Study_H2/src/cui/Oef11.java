package cui;

public class Oef11 {

	public static void main(String[] args) {
		
		long teller = 0, leeuwen_eind;
		double groei = 1.15, leeuwen_start = 50;
		
		do {
			
			leeuwen_eind = Math.round(leeuwen_start * groei);
			leeuwen_start = leeuwen_eind;
			teller++;
			
		} while (leeuwen_eind < 1000);
		
		System.out.printf("Het duurt %d jaren tot er meer dan 1000 leeuwen zijn", teller);
		
	}

}
