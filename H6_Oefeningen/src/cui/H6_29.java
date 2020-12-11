package cui;

import java.security.SecureRandom;
import java.util.Scanner;

public class H6_29 {

	public static void main(String[] args) {
		
		H6_29 ob = new H6_29();
		
		int ingevoerd[] = new int[5];
		int random[] = new int[5];
		
		ob.voerGetallenIn(ingevoerd);
		ob.bepaalRandomGetallen(random);
		ob.toonArray("Door jou gekozen getallen", ingevoerd);
		ob.toonArray("Door het systeem gekozen getallen", random);
		ob.bepaalZelfde(ingevoerd, random);
		
	}

	private void voerGetallenIn(int[] ingevoerd) {
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < ingevoerd.length; i++) {
			System.out.printf("Geef getal %d: ", i+1);
			ingevoerd[i] = input.nextInt();
			
			if(ingevoerd[i] > 10) {
				System.out.print("Getal mag niet groter zijn dan 10!\n");
				i--; //om te vermijden dat hij naar volgend getal gaat
			}
			else if(ingevoerd[i] < 0) {
				System.out.print("Getal mag niet kleiner zijn dan 0!\n");
				i--;
			}
			else if(zitAlInArray(ingevoerd, i)) {
				System.out.print("Dit getal heb je al gekozen! Probeer opnieuw!");
				i--;
			}
				
		}
		input.close();
		
	}
	
	private boolean zitAlInArray(int[] array, int index) {
		
		for(int i = 0; i < index; i++) {
			if(array[i] == array[index])
				return true;
		}
		return false;
	}

	private void bepaalRandomGetallen(int[] random) {
		
		SecureRandom sr = new SecureRandom();
		
		for(int i = 0; i < random.length; i++) {
			random[i] = sr.nextInt(11);
			if(zitAlInArray(random, i))
				i--;
		}
		
	}
	
	private void toonArray(String boodschap, int[] array) {
		
		System.out.println(boodschap);
		for(int element: array)
			System.out.printf("%3d", element);
		System.out.println();
		
	}
	
	private void bepaalZelfde(int[] ingevoerd, int[] random) {
		
		String output = "";
		for(int getal1: ingevoerd) 
			for(int getal2: random) 
				if(getal1 == getal2)
					output += getal1 + " ";
		
		if(output.isEmpty())
			System.out.println("In de ingevoerde array zitten geen getallen die ook in de random array voorkomen");
		
		else
			System.out.println("De getallen die in beide arrays voorkomen zijn: " + output);
		
	}
	
}