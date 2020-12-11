package cui;

import java.security.SecureRandom;
import java.util.Scanner;

public class Extra_23 {

	public static void main(String[] args) {
		
		Extra_23 ob = new Extra_23();
		
		int n = ob.leesInteger();
		int random = ob.geefRandomGetal(n);
		System.out.printf("Het random bepaalde getal tussen 0 en %d is %d%n", n, random);
		boolean isPriem = ob.isPriem(random);
		ob.drukRes(isPriem);

	}

	private int leesInteger() {
		
		Scanner input = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("Geef een strikt positief geheel getal: ");
			n = input.nextInt();
		} while (n <= 0);
		
		input.close();
		return n;
		
	}
	
	private int geefRandomGetal(int n) {
		
		SecureRandom sr = new SecureRandom();
		return sr.nextInt(n + 1);
		
	}
	
	private boolean isPriem(int getal) {
		
		int deler = 2;
		while(deler <= Math.sqrt(getal)) {
			
			if(getal % deler == 0)
				return false;
			deler++;
		}
		return true;
	}
	
	private void drukRes(boolean janee) {
		
		if(janee)
			System.out.printf("Dit getal is een priemgetal");
		else
			System.out.printf("Dit getal is geen priemgetal");
		
	}

}
