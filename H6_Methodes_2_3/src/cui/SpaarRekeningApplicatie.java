package cui;

import domein.SpaarRekening;

public class SpaarRekeningApplicatie
{

	public static void main(String[] args)
	{
		System.out.println("Aantal rekeningen = " + SpaarRekening.getAantalRekeningen());//0
		SpaarRekening[] rekeningen = new SpaarRekening[3];
	    rekeningen[0] = new SpaarRekening(123123456712L, "Sam");
	    rekeningen[1] = new SpaarRekening(123456789012L, "Arno");
	    rekeningen[2] = new SpaarRekening(101010101010L, "Stef");
	    rekeningen[0].stortOp(200);
	    System.out.printf("Eindsaldo = %.1f%n",rekeningen[0].bepaalEindSaldo());
		System.out.println("Aantal rekeningen = " + SpaarRekening.getAantalRekeningen());

		

	}

}
