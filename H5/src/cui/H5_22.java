package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class H5_22 {

	public static void main(String[] args) {
		
		List<Integer> cijfers = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		int getal;
		
		do {
			
			System.out.print("Geef een getal van 8 cijfers: ");
			getal = input.nextInt();
			
		} while (!(getal >= 10000000 && getal <= 99999999));
		
		for (int deler = 10000000; deler >= 1; deler /= 10 ) {
			
			int nummer = getal / deler;
			
			if (!cijfers.contains(nummer))
				cijfers.add(nummer);
			
			getal = getal % deler;
		}
		
		System.out.println("Alle verschillende cijfers in dit getal (in volgorde van voorkomen) zijn:");
		for (int element: cijfers)
			System.out.printf(" %1d", element);
			
		input.close();
	}

}