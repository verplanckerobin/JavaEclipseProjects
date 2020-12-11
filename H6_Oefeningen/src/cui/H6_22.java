package cui;

import java.util.Scanner;

public class H6_22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String schaal = "Celsius";
		System.out.printf("Geef de temperatuur in graden %s (9999 om te stoppen): ", schaal);
		
		int temp = input.nextInt();
		
		while(temp != 9999) {

			String resultaat = geefTemperatuurStatus(temp); //er staat niets voor de methode dus deze zal in dezelfde klasse zitten, geen object ervoor dus van dezelfde soort static
			System.out.printf("%d graden %s voelt aan als %s%n", temp, schaal, resultaat);
			System.out.printf("Geef de temperatuur in graden %s (9999 om te stoppen): ", schaal);
			temp = input.nextInt();
		}
		
		input.close();
	}

	private static String geefTemperatuurStatus(int temp) {
		
		if(temp < 10)
			return "koud";
		if(temp <= 20)
			return "lauw";
		
		return "warm";
		
	}
	
}
