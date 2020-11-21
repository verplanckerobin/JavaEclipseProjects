package cui;

import java.util.Scanner;

public class Oef_1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int getal;
		
		System.out.print("Geef een getal in: ");
		getal = input.nextInt();
		
		if (getal <= 10)
			System.out.print("koud\n");
		else 
			if (getal >= 20)
				System.out.print("warm\n");
			else
				System.out.print("goed\n");
		
		
		if (getal >= 0) 
			if (getal % 2 == 0) 
				System.out.print("positief en even");
			else 
				System.out.print("positief en oneven"); 
			
		else 
			if (getal % 2 == 0) 
				System.out.print("negatief en even"); 
			else 
				System.out.print("negatief en oneven"); 
		
		input.close();
	}

}
