package cui;

import java.util.Scanner;

public class Oef9_B {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number, smaller = 0, larger = 0;
		
		System.out.print("Geef een getal (0 om te stoppen): ");
		number = input.nextInt();
		smaller = number;
		larger = number;
		
		while (number != 0) {
			
			if (number > larger) //let op volgorde! ik had eerst de print gedaan en dan de if condities
				larger = number;
			
			if (number < smaller)
				smaller = number;
			
			System.out.print("Geef een getal (0 om te stoppen): ");
			number = input.nextInt();

		}
		
		if (larger == 0)
			System.out.println("Er werden geen geldige getallen ingevoerd!");
		
		else
			System.out.printf("Het grootste van alle ingevoerde getallen is %d.%nHet kleinste is %d.%n", larger, smaller);
		
		input.close();
		
	}

}
