package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domein.DomeinController;

public class LottoApplicatie {

	public static void main(String[] args) {
		
		Scanner invoer = new Scanner(System.in);
		
		System.out.println("Registreer trekking");
		System.out.print("Geef naam van de trekking: ");
		String naam = invoer.next(); //inlezen stopt vanaf spatie of enter
		
		List<Integer> nummers = new ArrayList<>();
		
		for (int teller=1; teller<=6; teller++) {
			System.out.printf("Geef getal %d: ", teller);
			nummers.add(invoer.nextInt());
		}
		
		DomeinController dc = new DomeinController();
		
		dc.registreerTrekking(naam, nummers);
		
		System.out.println("De trekking is geregistreerd.");

	}

}