package cui;

import java.util.Scanner;

public class Extra_21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int nr;
		
		System.out.print("Geef een btw-nummer van de vorm ABC.PQR.XYZ zonder de puntjes: ");
		nr = input.nextInt();
		
		if(isGeldig(nr))
			System.out.printf("%d is een geldig btw-nummer", nr);
		
		else
			System.out.printf("%d is een ongeldig btw-nummer", nr);
		
		input.close();

	}

	private static boolean isGeldig(int nr) {
		int eersteZevenCijfers, laatsteTweeCijfers, rest, som;
		
		laatsteTweeCijfers = nr % 100;
		eersteZevenCijfers = nr / 100;
		rest = eersteZevenCijfers % 97;
		som = rest + laatsteTweeCijfers;
		
		if(som == 97)
			return true;
		else;
			return false;
	}

}
