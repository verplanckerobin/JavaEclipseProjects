package cui;

import java.util.Scanner;

public class H6_211 {

	public static void main(String[] args) {
		
		int a[] = {4, 8, 2, 3, 3, 17, 7, 99, 3, 12};
		int getal;
		Scanner input = new Scanner(System.in);
		System.out.print("Geef een geheel getal in : ");
		getal = input.nextInt();
		
		String output = "\n\nDe waarden van de array :\n";
		for(int element: a)
			output += String.format("%5d", element);
		
		
		//roep hier de methode verwijder aan:
		verwijder(getal, a);
		
		
		output += "\n\nDe waarden van de gewijzigde array :\n";
		for(int element: a)
			output += String.format("%5d", element);
		
		
		System.out.println(output);
		
		input.close();

	}

	private static void verwijder(int getal, int[] a) {
		
		int lengte = a.length;
		for(int i = 0; i < lengte; i++) { //geen enhanced want we gaan de array wijzigen
			
			if(getal == a[i]) { //verschuiven
				
				for(int k = i; k < a.length - 1; k++) //de -1 om te counteren voor de k+1 op de volgende lijn
					a[k]= a[k+1]; //overschijf met cijfer op volgende positie
				//0 plaatsen op de laatste positie:
				a[a.length - 1] = 0;
				i--; //om de i++ tegen te werken
				lengte--; //want als er een 0 bijgekomen is wordt onze array kleiner = vroeger stoppen van for-lus
			} 
			
		}
		
	}

}
