package cui;

import java.util.Scanner;

import domein.Vierkant;

public class H6_26 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Geef de zijde van het vierkant in : ");
		int z = input.nextInt();
		input.nextLine(); //nodig om buffer volledig leeg te maken want er staat nog een enter in
		
		System.out.print("Geef het karakter in : ");
		String kar = input.nextLine(); //"j" -> 'j' (char op positie 0)
		
		String res;
		
		if (kar.length() == 0) {
			res = Vierkant.maakVierkant(z);
			
		} else {
			res = Vierkant.maakVierkant(z, kar.charAt(0)); //van de string nemen we de char op index 0 dus vb 'j'
			
		}
		
		System.out.println(res);
		input.close();
	}

}
