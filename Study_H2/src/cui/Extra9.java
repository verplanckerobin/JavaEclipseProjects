package cui;

import java.util.Scanner;

public class Extra9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number, teller = 0;
		
		do {
			
			System.out.print("Geef een strikt positief geheel getal in: ");
			number = input.nextInt();
		}
		while(number <= 0);
		
		while(number != 1) {
			
			if(number % 2 == 0) 
				number = number / 2;
	
			else 
				number = (number * 3) + 1;
			
			teller++;

		}
		
		System.out.printf("Het getal wijzigt %d keer", teller);
		input.close();

	}

}
