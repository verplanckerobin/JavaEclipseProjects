package cui;

import java.util.Scanner;

public class Oef_2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int getal;
		
		System.out.print("Geef een getal in: ");
		getal = input.nextInt();
		
		System.out.println(getal <= 10 ? "koud" : getal >= 20 ? "warm" : "goed");
		
		System.out.printf("%s en %s%n", getal >= 0 ? "Positief" : "Negatief", getal % 2 == 0? "even" : "oneven");
		
		input.close();
	}

}
