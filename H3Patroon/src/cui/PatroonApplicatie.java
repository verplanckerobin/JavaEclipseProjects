package cui;

import domein.Patroon;

public class PatroonApplicatie {

	public static void main(String[] args) {
		
		for(char letter = 'A'; letter <= 'D'; letter++) {
			
			Patroon patroon = new Patroon(letter, '*');
			System.out.printf("%s%n", patroon.teken());
			
		}

	}

}
