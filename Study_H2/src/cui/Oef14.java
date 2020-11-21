package cui;

import java.util.Scanner;

public class Oef14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number, teller = 0, sum = 0;
		double average = 0;
		
		System.out.print("Geef een geheel getal in (-1 om te stoppen): ");
		number = input.nextInt();
		
		while (number != -1) {
			
			sum += number;
			teller++; 
			
			if (teller == 10)
				break;
			
			System.out.print("Geef een geheel getal in (-1 om te stoppen): ");
			number = input.nextInt();
			
		}

		if (teller == 0)
			System.out.println("Er werden geen getallen ingegeven.");
		
		else {
			average = (double) sum / teller;
			System.out.printf("Het gemiddelde van de ingevoerde getallen is %.2f%n", average);
		}
		
		input.close();
	}

}

//hoe ik het eerst gedaan het met while teller <= 10 en met teller-1 voor gemiddelde was ook correct! en break als number == -1
//heeft ze in de les gemaakt als wijze van extra oefening 
