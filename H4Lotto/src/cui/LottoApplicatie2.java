package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domein.DomeinController;

public class LottoApplicatie2 {

	public static void main(String[] args) {
		
		DomeinController dc = new DomeinController();
		Scanner invoer = new Scanner(System.in);
		
		System.out.println("Controleer nummers");
		System.out.print("Geef naam van de trekking: ");
		String naam = invoer.next(); //zie applicatie 1
		
		dc.selecteerTrekking(naam);
		
		List<Integer> nummers = new ArrayList<>();
		
		for (int teller=1; teller<=6; teller++) {
			System.out.printf("Geef getal %d: ", teller);
			nummers.add(invoer.nextInt()); //zie applicatie 1
		}
		
		System.out.printf("%nDe winst is %d", dc.geefWinst(nummers));
		
	}

}
