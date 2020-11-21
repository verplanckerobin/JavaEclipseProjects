package oefeningen1;

import java.util.Scanner;

public class Oefening_9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int getal, verm_1, verm_2, verm_3, verm_4, verm_5;
		
		System.out.print("Geef een positief getal in: ");
		getal = input.nextInt();
		
		verm_1 = getal * 1;
		
		verm_2 = getal * 10;
		
		verm_3 = getal * 100;
		
		verm_4 = getal * 1000;
		
		verm_5 = getal * 10000;
		
		System.out.printf("%10d%10d%10d%10d%10d %n", 1, 10, 100, 1000, 10000);
		System.out.printf("%10d%10d%10d%10d%10d", verm_1, verm_2, verm_3, verm_4, verm_5);
		
		input.close();

	}

}
