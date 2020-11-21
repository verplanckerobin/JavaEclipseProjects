package cui;

import java.util.Scanner;

public class Extra2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.print("Geef een getal in: ");
		number = input.nextInt();
		
		if (number > 0) {
			int substraction = number - 10;
			System.out.printf("Het ingegeven getal was strikt positief en werd verminderd met 10.%n"
					+ "Het heeft nu een waarde %d%n", substraction);
		}
		
		else if (number < 0) {
			int addition = number + 10;
			System.out.printf("Het ingegeven getal was negatief en werd vermeerderd met 10.%n"
					+ "Het heeft nu een waarde %d%n", addition);
		}
		
		else if (number == 0) {
			int zero = number + 1;
			System.out.printf("Het ingegeven getal was nul en werd vermeerderd met 1.%n"
					+ "Het heeft nu een waarde %d%n", zero);
		}
		
		input.close();

	}

}
