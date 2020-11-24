package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class H5_21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float answer = 0;
		
		List<Float> bedragen = new ArrayList<>();
		
		while (answer != -1) {
			
			System.out.print("Geef een positief bedrag, stop met -1: ");
			answer = input.nextFloat();
			
			if (answer >= 0)
				bedragen.add(answer);
			
		}
		
		if (bedragen.size() != 0) {
			System.out.print("De lijst met bedragen:");
			for (float element: bedragen)
				System.out.printf("%8.2f", element);
		} else
			System.out.print("De lijst is leeg!");
	
		input.close();
	}

}
