package oefeningen1;

import java.util.Scanner;

public class Oefening_7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int hoogte, breedte, oppervlakte_rol = 50000, oppervlakte_nodig, aantal_rollen;
		
		System.out.print("Geef de hoogte van de muur in cm in: ");
		hoogte = input.nextInt();
		
		System.out.print("Geef de breedte van de muur in cm in: ");
		breedte = input.nextInt();
		
		oppervlakte_nodig = hoogte * breedte;
		
		aantal_rollen = ((oppervlakte_nodig + oppervlakte_rol - 1) / oppervlakte_rol);
		
		System.out.printf("Het aantal benodigde rollen = %d", aantal_rollen);
		
		input.close();

	}

}
