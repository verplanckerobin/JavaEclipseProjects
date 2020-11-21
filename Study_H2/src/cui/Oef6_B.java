package cui;

import java.util.Scanner;

public class Oef6_B {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int choice = 1, even = 0, devide_3 = 0, numbers;
		
		while (choice <= 5) {
			
			System.out.printf("Geef getal %d in: ", choice);
			numbers = input.nextInt();
			
			if (numbers % 2 == 0)
				even++;
			
			if (numbers % 3 == 0)
				devide_3++;
			
			choice++;

		}
		
		System.out.printf("Je gaf %d even getal%s en %d getal%s deelbaar door 3 in.", even, even <= 1? "" : "len", devide_3, devide_3 <= 1? "" : "len");
		
		input.close();

	}

}
