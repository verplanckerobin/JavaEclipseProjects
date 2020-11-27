package cui;

import java.util.Scanner;

public class H5_211 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double gem;
		double table[][] = new double[3][2];
		double teller = 0, som = 0;
		
		for(int rij = 0; rij < table.length; rij++) {
			for(int kolom = 0; kolom < table[rij].length; kolom++) {
				
				System.out.printf("Geef getal of rij %d en kolom %d: ", rij+1, kolom+1);
				table[rij][kolom] = input.nextDouble();
				som += table[rij][kolom];
				teller++;
			}
		}
		
		gem = som / teller;
		
		String uitvoer = String.format("gemiddelde is %.1f", gem);
		System.out.print(uitvoer);
		
		input.close();
	}
}