package cui;

import java.util.Scanner;

public class Oef10_A {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number;
		
		do {
			
			System.out.print("Geef een strikt negatief oneven getal in: ");
			number = input.nextInt();
			
		} while (number >= 0 || number % 2 == 0);
		
		System.out.printf("Het ingegeven getal was %d%n", number);
		
		input.close();

	}

}
