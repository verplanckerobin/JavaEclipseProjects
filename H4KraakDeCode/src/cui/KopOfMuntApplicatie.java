package cui;

import java.util.Scanner;

import domein.DomeinController;

public class KopOfMuntApplicatie {

	public static void main(String[] args) {
		
		DomeinController dc = new DomeinController();
		Scanner input = new Scanner(System.in);
		int moeilijkheidsgraad;
		
		do {
			System.out.print("Geef de moeilijkheidsgraad (1 = gemakkelijk, 2 = normaal): ");
			moeilijkheidsgraad = input.nextInt();
		} while (moeilijkheidsgraad != 1 && moeilijkheidsgraad != 2);
		
		dc.maakSpel(moeilijkheidsgraad);
		
		System.out.print("Geef je keuze in (K = Kop, M = Munt): ");
		String geradenCode = input.next();
		
		while(!dc.isGeraden(geradenCode)) {
			
			System.out.printf("Je geraden code %s levert een score van %d op.%n", geradenCode, dc.geefScore(geradenCode));
			
			System.out.print("Geef je keuze in (K = Kop, M = Munt): ");
			geradenCode = input.next();
		}
		
		System.out.println("Je hebt de code gekraakt!");
		
		for (String s: dc.geefSpelInfo())
			System.out.println(s);
		input.close();
		
	}

}
