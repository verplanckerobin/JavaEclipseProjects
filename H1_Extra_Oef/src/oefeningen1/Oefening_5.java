package oefeningen1;

import java.util.Scanner;

public class Oefening_5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int lengte, breedte, omtrek, oppervlakte;
		
		System.out.print("Geef de lengte van de rechthoek in: ");
		lengte = input.nextInt();
		
		System.out.print("Geef de breedte van de rechthoek in: ");
		breedte = input.nextInt();
		
		omtrek = (2 * lengte) + (2 * breedte);
		oppervlakte = lengte * breedte;
		
		System.out.printf("De omtrek = %d%nDe oppervlakte = %d", omtrek, oppervlakte);
		
		input.close();

	}

}
