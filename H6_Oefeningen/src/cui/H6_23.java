package cui;

import java.util.Scanner;

public class H6_23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int oGrens, bGrens;
		
		String res = "";
		
		do {
			
			System.out.print("Geef het eerste getal: ");
			oGrens = input.nextInt();
			System.out.printf("Geef het tweede getal (>%d): ", oGrens);
			bGrens = input.nextInt();
			
		} while (oGrens >= bGrens);
		
		H6_23 ob = new H6_23();
		//[oGrens,bGrens]
		for(int x = oGrens; x <= bGrens; x++) {
			
			if(ob.isPerfect(x))
				res += String.format("%d ", x);
		}
		
		if(res.isEmpty())
			System.out.println("Er zijn geen perfecte getallen in dit interval!");
		else
			System.out.printf("De perfecte getallen tussen %d en %d zijn: %s%n", oGrens, bGrens, res);
		
		input.close();
	}
	

	public boolean isPerfect(int x) {
		
		int som = berekenSomVanDelers(x);
		if (x == som)
			return true;
		
		return false;
	}

	public int berekenSomVanDelers(int x) {
		int som = 0;
		for(int i = 1; i <= x/2; i++)
			if(x % i == 0)
				som += i;
		
		return som;
	}

}
