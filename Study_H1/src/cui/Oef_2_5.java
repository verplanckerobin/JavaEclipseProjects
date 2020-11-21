package cui;

import java.util.Scanner;

public class Oef_2_5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int maandsalaris, jaarsalaris, vakantiegeld;
		
		System.out.print("Geef maandsalaris in euro: ");
		maandsalaris = input.nextInt();
		
		jaarsalaris = maandsalaris * 12;
		
		vakantiegeld = (jaarsalaris * 8) / 100;
		
		System.out.printf("jaarsalaris = %d € %nvakantiegeld = %d € ", jaarsalaris, vakantiegeld);
		
		input.close();

	}

}
