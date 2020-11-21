package cui;

import java.util.Scanner;

import domein.Auto;

public class AutoApplicatie {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int aantal_autos = 0, aantal_grijze = 0, keuze;
		
		System.out.print("Registratie auto\n"
				+ " (1) Auto (alles standaard)\n (2) Auto met gekozen kleur\n"
				+ "Wens je nog een auto te registreren? ");
		keuze = input.nextInt();

		while(keuze == 1 || keuze == 2) {
			
			if (keuze == 1) {
				Auto a = new Auto();
				aantal_autos++;
				aantal_grijze++;
		
			} else {
				System.out.print("Geef een kleur: ");
				String gekozen_kleur = input.next();
				Auto a = new Auto(gekozen_kleur);
				aantal_autos++;
			}
			
			System.out.print("Registratie auto\n"
					+ " (1) Auto (alles standaard)\n (2) Auto met gekozen kleur\n"
					+ "Wens je nog een auto te registreren? ");
			keuze = input.nextInt();
		
		}
		
		System.out.printf("Aantal geregistreerde auto's: %d%nAantal grijze auto's: %d%n", aantal_autos, aantal_grijze);
		input.close();
	}

}
