package cui;

import java.util.Scanner;

public class H5_25 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int extraGetal;
		int array[] = new int[10];
		
		for(int teller = 0; teller < array.length; teller++) {
			
			System.out.printf("Geef getal %d: ", teller + 1);
			array[teller] = input.nextInt();
		}
		
		System.out.print("Geef nog een extra getal: ");
		extraGetal = input.nextInt();
		
		System.out.printf("%nDeze getallen zijn strikt groter dan %d:%n%15s%10s%n", extraGetal, "Index", "Waarde");
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > extraGetal)
				System.out.printf("%15d%10d%n", i, array[i]);
		}	
		/*
		int index = 0;
		for(int getal: array) {
			if(getal > extraGetal)
				print blabla
			index++; }
		 */
		
		input.close();
	}

}
