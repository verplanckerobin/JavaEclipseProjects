package cui;

import java.util.Scanner;

import domein.*;

public class Applicatie {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int antwoord, aantalVormen = 0;

		System.out.println("Rechthoeken en driehoeken\n-------------------------");

		do {
			System.out.print("Wil je graag nog een vorm ingeven (1 = rechthoek, 2 = een driehoek, 0 = nee)? ");
			antwoord = input.nextInt();
		} while (antwoord != 2 && antwoord != 1 && antwoord != 0);

		int aantalRechthoekigeDriehoeken = 0, aantalRechthoekenOppervlakte = 0;
		
		while (antwoord != 0) {
			
			if(antwoord == 2) {
				
				System.out.print("Geef de lengte van zijde A: ");
				int zijdeA = input.nextInt();
				
				System.out.print("Geef de lengte van zijde B: ");
				int zijdeB = input.nextInt();
				
				System.out.print("Geef de lengte van zijde C: ");
				int zijdeC = input.nextInt();
				
				Driehoek driehoek = new Driehoek(zijdeA, zijdeB, zijdeC);
				aantalVormen++;
				
				if (driehoek.isRechthoekigeDriehoek())
					aantalRechthoekigeDriehoeken++;
			}
			
			else {
				
				System.out.print("Geef de lengte van de rechthoek: ");
				double lengte = input.nextDouble();
				
				System.out.print("Geef de breedte van de rechthoek: ");
				double breedte = input.nextDouble();
				
				Rechthoek rechthoek = new Rechthoek(lengte, breedte);
				aantalVormen++;
				
				if (rechthoek.berekenOppervlakte() > 50)
					aantalRechthoekenOppervlakte++;
				
			}
			
			do {
				System.out.print("Wil je graag nog een vorm ingeven (1 = rechthoek, 2 = een driehoek, 0 = nee)? ");
				antwoord = input.nextInt();
			} while (antwoord != 2 && antwoord != 1 && antwoord != 0);
			
		}
		System.out.println("Overzicht vormen:");
		System.out.printf("Totaal aantal vormen %d%n", aantalVormen);
		System.out.printf("Aantal rechthoeken met opp > 50: %d%n", aantalRechthoekenOppervlakte);
		System.out.printf("Aantal rechthoekige driehoeken: %d%n", aantalRechthoekigeDriehoeken);
		
		input.close();
	}

}
