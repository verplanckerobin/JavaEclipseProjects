package cui;

import java.util.Scanner;

public class Oef8_A {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sum = 0, numbers;
		
		for (int choice = 1; choice <= 5; choice++) {
			
			System.out.printf("Geef getal %d: ", choice);
			numbers = input.nextInt();
			sum = sum + numbers;
			
		}
		
		System.out.printf("De som van de getallen = %d%n", sum);
		
		input.close();

	}

}
