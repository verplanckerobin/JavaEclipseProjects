package cui;

import java.util.Scanner;

import domein.Rekening;
import domein.RekeningOperaties;

public class H6_27 {

	public static void main(String[] args) {
		
		Rekening[] rekeningen = new Rekening[3];
		rekeningen[0] = new Rekening(123123456712L, "Sam");
		rekeningen[1] = new Rekening(123456789012L, "Arno");
		rekeningen[2] = new Rekening(101010101010L, "Stef");
		
		Scanner input = new Scanner(System.in);
		H6_27 ob = new H6_27(); //object nodig omdat we met non-static methodes werken
		int antw;
		
		do {
			//stortOpRekening aanroepen
			ob.stortOpRekeningen(rekeningen);
			System.out.print("Wil je nog storten op een rekening (ja=1): ");
			antw = input.nextInt();
		} while (antw == 1);
		
		System.out.println("Beginsituatie");
		//toonRekeningen aanroepen
		ob.toonRekeningen(rekeningen);
		
		rekeningen[0].haalAf(299);
		rekeningen[1].stortOp(50);
		rekeningen[2].schrijfBedragOverNaar(20, rekeningen[0]);
		System.out.println("Eindsituatie");
		
		//toonRekeningen aanroepen
		ob.toonRekeningen(rekeningen);
		input.close();
	}
	
	//stortOpRekeningen
	private void stortOpRekeningen(Rekening[] rekeningen) {
		
		Scanner input = new Scanner(System.in);
		int nr;
		double bedrag;
		
		do {
			System.out.printf("Geef nummer van de rekening [1 - %d]: ", rekeningen.length);
			nr = input.nextInt();
		} while (nr < 1 || nr > rekeningen.length);
		
		System.out.print("Geef bedrag: ");
		bedrag = input.nextDouble();
		
		RekeningOperaties.stortOpEenRekening(nr-1, bedrag, rekeningen); //let op de -1, nu werken we met de ECHTE indexen 0 1 2 ipv 1 2 3
	}
	
	//toonRekeningen
	private void toonRekeningen(Rekening[] rekeningen) {
		
		for(Rekening rekening: rekeningen)
			toon1Rekening(rekening);
	}
	
	//toon1Rekening
	private void toon1Rekening(Rekening rekening) {
		
		System.out.printf(rekening.toString());
	}
	
}
