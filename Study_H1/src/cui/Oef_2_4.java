package cui;

import java.util.Scanner;

public class Oef_2_4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number_1, number_2, number_3, multiply;
		
		System.out.print("Geef eerste getal: ");
		number_1 = input.nextInt();
		
		System.out.print("Geef tweede getal: ");
		number_2 = input.nextInt();
		
		System.out.print("Geef derde getal: ");
		number_3 = input.nextInt();
		
		multiply = number_1 * number_2 * number_3;
		
		System.out.printf("De vermenigvuldiging van %d, %d en %d is %d%n", number_1, number_2, number_3, multiply);
		
		input.close();
		
	}

}
