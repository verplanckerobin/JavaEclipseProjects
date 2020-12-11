package cui;

import java.util.Scanner;

public class Versie4Hulpklasse
{
	// hulpmethode -> public
		public int geefGetalVerschillendVan(int verschilGetal) // objectmethode
		{
			Scanner scan = new Scanner(System.in);
			int getal;
			do 
	        {
	            System.out.printf("Geef een getal verschillend van %d in: ",verschilGetal);
	            getal = scan.nextInt();
	        } while (getal == verschilGetal);
			
			return getal;
		}
}
