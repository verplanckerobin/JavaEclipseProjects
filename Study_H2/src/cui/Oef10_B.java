package cui;

import java.util.Scanner;

public class Oef10_B {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number_1, number_2;
		
		do {
			
			System.out.print("Geef het eerste getal in: ");
			number_1 = input.nextInt();
			
		} while (number_1 % 12 == 0 || number_1 == 1000);
		
		do {
			
			System.out.print("Geef het tweede getal in, groter dan het vorige: ");
			number_2 = input.nextInt();
			
		} while (number_2 <= number_1);
		
		System.out.printf("Getal 1 is %d en getal 2 is %d%n", number_1, number_2);
		
		input.close();

	}

}
