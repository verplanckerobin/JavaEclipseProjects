package cui;

import java.util.Scanner;

public class Oef9_A {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number, sum = 0, counter = 0;
		double average = 0;
		
		System.out.print("Geef een getal (-1 om te stoppen): ");
		number = input.nextInt();

		while (number != -1) {
			
			if (number < 0 & number != -1) {
				sum += number;
				counter++;
			}
			
			System.out.print("Geef een getal (-1 om te stoppen): ");
			number = input.nextInt();
				
		}

		if (sum >= 0)
			System.out.print("Er werden geen negatieve getallen ingevoerd!");
		
		else {
			average = (double) sum / counter;
			System.out.printf("Het gemiddelde van alle negatieve getallen is %.3f%n", average);
		}
		input.close();
	}

}
