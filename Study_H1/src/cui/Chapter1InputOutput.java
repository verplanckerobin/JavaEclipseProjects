package cui;

import java.util.Scanner;

public class Chapter1InputOutput {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //creeer een object van Scanner; voor invoer vanaf toetsenbord
		
		int number_1, number_2, sum;
		
		System.out.print("Enter first integer: "); //prompt
		number_1 = input.nextInt(); // leest eerste getal van de gebruiker
		
		System.out.print("Enter second integer: ");
		number_2 = input.nextInt();
		
		sum = number_1 + number_2; //optellen
		
		System.out.printf("Sum is %d%n", sum); //weergeven
		
		input.close();
	}

}
