package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Extra_21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int choice, aantalVragen = 3;
		String eigenschap, output = "";
		
		
		List<String> posEig = new ArrayList<>();
		List<String> negEig = new ArrayList<>();
		
		for(int teller = 1; teller <= aantalVragen; teller++) {
			do {
				
				System.out.println("Is het een positieve (=1) of negatieve (=2) eigenschap?");
				choice = input.nextInt();
				
			} while (!(choice == 1 || choice == 2));
			
			if(choice == 1) {
				System.out.println("Omschrijf deze eigenschap:");
				eigenschap = input.next();
				posEig.add(eigenschap);
			} else {
				System.out.println("Omschrijf deze eigenschap:");
				eigenschap = input.next();
				negEig.add(eigenschap);
			}
			
		}
		
		if(posEig.isEmpty()) {
			output += String.format("Geen positieve eigenschappen");
		} else {
			output += String.format("Positieve eigenschappen: ");
			for(String pos: posEig) 
				output += String.format("%s%s", pos);
		}
		
		if(negEig.isEmpty()) {
			output += String.format("%nGeen negatieve eigenschappen");
		} else {
			output += String.format("%nNegatieve eigenschappen: ");
			for(String neg: negEig) 
				output += String.format("%s ", neg);
		}
		
		System.out.print(output);
		input.close();
	}

}