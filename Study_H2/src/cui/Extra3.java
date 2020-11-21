package cui;

import java.util.Scanner;

public class Extra3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int postcode;
		String stad = "";
		
		do {
			System.out.print("Geef een postcode (4 cijfers): ");
			postcode = input.nextInt();
			
		} while (postcode > 9999 || postcode < 1000);
		
		switch (postcode) {
		case 9300: stad = "Aalst"; break;
		case 2000: stad = "Antwerpen"; break;
		case 1000: stad = "Brussel"; break;
		case 9200: stad = "Dendermonde"; break;
		case 9000: stad = "Gent"; break;
		case 8500: stad = "Kortrijk"; break;
		case 9700: stad = "Oudenaarde"; break;
		case 2300: stad = "Turnhout"; break;
		default: break;
		}
		
		if (postcode != 0)
			System.out.printf("Postnummer %d komt overeen met de stad %s%n", postcode, stad);
		
		else
			System.out.printf("Postnummer %d bestaat niet of komt overeen met een stad die niet in de tabel is opgenomen", postcode);

		input.close();
		
	}

}
