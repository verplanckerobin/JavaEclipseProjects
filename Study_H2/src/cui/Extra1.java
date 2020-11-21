package cui;

import java.util.Scanner;

public class Extra1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int getal_1, getal_2, getal_3, som, gemiddelde, rest;
		int grootste = 0;
		
		System.out.print("Geef eerste getal: ");
		getal_1 = input.nextInt();
		grootste = getal_1;
		
		System.out.print("Geef tweede getal: ");
		getal_2 = input.nextInt();
		if (getal_2 > getal_1)
			grootste = getal_2;
		
		System.out.print("Geef derde getal: ");
		getal_3 = input.nextInt();
		if (getal_3 > getal_2)
			grootste = getal_3;
		
		som = getal_1 + getal_2 + getal_3;
		
		gemiddelde = (getal_1 + getal_2 + getal_3) / 3;
		
		rest = (getal_1 + getal_2 + getal_3) % 3;
		
		System.out.printf("Van de ingevoerde getallen %d, %d en %d %nis de som %d%n"
				+ "het gemiddelde %d%nen de rest %d%n"
				+ "en het grootste getal %d", getal_1, getal_2, getal_3, som, gemiddelde, rest, grootste);
		
		input.close();

	}

}