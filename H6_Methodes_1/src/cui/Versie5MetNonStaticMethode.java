package cui;

import java.util.Scanner;

public class Versie5MetNonStaticMethode
{
	public static void main(String args[]) 
    {
       // Scanner scan = new Scanner(System.in);
        int getal1, getal2;
/*
        do 
        {
            System.out.print("Geef een getal verschillend van 0 in: ");
            getal1 = scan.nextInt();
        } while (getal1 == 0);

        do 
        {
            System.out.print("Geef een getal verschillend van 5 in: ");
            getal2 = scan.nextInt();
        } while (getal2 == 5);
*/
        Versie5MetNonStaticMethode ob = new Versie5MetNonStaticMethode(); //def-constr autom
        
        getal1 = ob.geefGetalVerschillendVan(0);
        getal2 = ob.geefGetalVerschillendVan(5);
        
        System.out.printf("De ingegeven getallen zijn %d en %d%n",
        		getal1, getal2);
    }
	
	// hulpmethode -> private
	private int geefGetalVerschillendVan(int verschilGetal) // objectmethode
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
