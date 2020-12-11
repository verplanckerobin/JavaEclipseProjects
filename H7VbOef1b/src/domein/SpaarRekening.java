package domein;

public class SpaarRekening extends Rekening {
	
	private static double aangroeiIntrest;
	
	

	public static double getAangroeiIntrest() {
		return aangroeiIntrest;
	}

	public static void setAangroeiIntrest(double aangroeiIntrest) {
		if(aangroeiIntrest < 0)
			throw new IllegalArgumentException("Aangroei intrest mag niet negatief zijn");
		SpaarRekening.aangroeiIntrest = aangroeiIntrest;
	}
	
	

}
