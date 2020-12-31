package domein;

public class PerfectGetal {
	
	public static boolean isPerfect(int getal) {
		
		if(getal < 0)
			throw new IllegalArgumentException("Getal mag niet negatief zijn");
		
		else if(getal == somVanDelers(getal))
			return true;
		
		return false;
		
	}
	
	private static int somVanDelers(int x) {
		
		int som = 0;
		
		for(int i = 1; i < x; i++)
			if(x % i == 0)
				som += i;
		
		return som;
	}

}
