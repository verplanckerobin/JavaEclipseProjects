package oefeningen1;

import java.util.Scanner;

public class Oefening_10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int getal_1, getal_2, getal_3, som, gemiddelde, rest;
		
		System.out.print("Geef eerste getal: ");
		getal_1 = input.nextInt();
		
		System.out.print("Geef tweede getal: ");
		getal_2 = input.nextInt();
		
		System.out.print("Geef derde getal: ");
		getal_3 = input.nextInt();
		
		som = getal_1 + getal_2 + getal_3;
		
		gemiddelde = (getal_1 + getal_2 + getal_3) / 3;
		
		rest = (getal_1 + getal_2 + getal_3) % 3;
		
		System.out.printf("Van de ingevoerde getallen %d, %d en %d %nis de som %d%n"
				+ "het gemiddelde %d%nen de rest %d", getal_1, getal_2, getal_3, som, gemiddelde, rest);
		
		input.close();

	}

}
