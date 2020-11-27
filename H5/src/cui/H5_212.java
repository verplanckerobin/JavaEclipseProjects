package cui;

import java.util.Scanner;

import domein.Rekening;

public class H5_212 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int lengteRij;
		Rekening[][] rekeningen = new Rekening[3][]; //3 rijen, aantal kolommen ligt nog niet vast
		
		for(int rij = 0; rij < rekeningen.length; rij++) {
			
			System.out.printf("Geef aantal kolommen in voor rij %d: ", rij+1);
			lengteRij = input.nextInt();
			rekeningen[rij] = new Rekening[lengteRij]; //opbouwen van array, enkel nog maar referenties! Nog geen objecten
			
			for(int kolom = 0; kolom < rekeningen[rij].length; kolom++) {
				
				rekeningen[rij][kolom] = new Rekening(); //nu worden objecten gemaakt
				rekeningen[rij][kolom].stortOp((kolom + 1) * 10 + rij); //formule voor de bedragen, afleiden uit opgave
			}
		}
		
		for(Rekening[] rij: rekeningen) {
			for(Rekening r: rij) 
				System.out.printf("%.2f   ", r.getSaldo());
			
			System.out.println();
		}
		
		input.close();
	}

}
