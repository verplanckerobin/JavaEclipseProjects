package oefeningen1;

import java.util.Scanner;

public class Oefening_8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int datum, aantal_dagen, aantal_maanden, dagen_resterend;
		
		System.out.print("Geef een datum in <ddmmjjjj>: ");
		datum = input.nextInt();
		
		aantal_dagen = (datum / 1000000);
		
		aantal_maanden = (datum - (aantal_dagen * 1000000)) / 10000;
		
		dagen_resterend = (30 - aantal_dagen) + ((12 - aantal_maanden) * 30);
		
		System.out.printf("Het duurt nog %d dagen voor het terug nieuwjaar is!", dagen_resterend);
		
		input.close();

	}

}
