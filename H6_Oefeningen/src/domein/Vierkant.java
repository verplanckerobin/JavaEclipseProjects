package domein;

public class Vierkant {

	public static String maakVierkant(int z) {
		
		
		return maakVierkant(z, '*');
	}

	public static String maakVierkant(int z, char karakter) {
		
		String res = "";
		for(int rij = 1; rij <= z; rij++) { //aantal lijnen
			for(int kolom = 1; kolom <= z; kolom++) 
				res += karakter + " ";
			res += "\n";
		}
		
		return res;
	}

}
