package cui;

import java.util.Scanner;

public class Oef6_A {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int choice = 1, sum = 0, numbers;
		
		while (choice <= 5) {
			
			System.out.printf("Geef getal %d: ", choice);
			numbers = input.nextInt();
			sum = sum + numbers;
			choice++;
			
		}
		
		System.out.printf("De som van de getallen = %d%n", sum);
		
		input.close();

	}

}
