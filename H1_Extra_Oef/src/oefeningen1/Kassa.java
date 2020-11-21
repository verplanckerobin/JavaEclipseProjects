package oefeningen1;

public class Kassa {

	public static void main(String[] args) {
		
		int ontvangenBedrag = 100, teBetalen = 45, terug;
		
		terug = ontvangenBedrag - teBetalen;
		
		System.out.printf("Te betalen = %d%nOntvangen bedrag = %d%nTerug = %d", teBetalen, ontvangenBedrag, terug);

	}

}
