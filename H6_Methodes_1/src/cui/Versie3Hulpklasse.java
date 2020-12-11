package cui;

import java.util.Scanner;

public class Versie3Hulpklasse
{
	// hulpmethode -> public
		public static int geefGetalVerschillendVan(int verschilGetal)
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
