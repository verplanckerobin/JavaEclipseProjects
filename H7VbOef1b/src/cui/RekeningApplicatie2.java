package cui;

import domein.SpaarRekening;

public class RekeningApplicatie2
{

	public static void main(String[] args)
    {
        start();
    }
	
    public static void start()
    {
        SpaarRekening.setAangroeiIntrest(1.5);

        SpaarRekening rekeningen[] = new SpaarRekening[3];

        String namen[] = {"jan", "an", "piet"};
        long rekeningnrs[] = {123456789911L, 123123456784L, 123123456986L};


        for (int i = 0; i < rekeningen.length; i++)
        {
            rekeningen[i] = new SpaarRekening(rekeningnrs[i], namen[i]);
        }

        rekeningen[0].stortOp(1000);
        rekeningen[1].stortOp(50);
        rekeningen[2].stortOp(500);

        if (rekeningen[0].stortOp(200))
        {
            System.out.println("Jan heeft 200 euro op zijn rekening gestort!");
        }

        if (rekeningen[1].haalAf(30))
        {
            System.out.println("An heeft 30 euro van haar rekening gehaald!");
        }

        if (rekeningen[2].schrijfBedragOverNaar(50, rekeningen[1]))
        {
            System.out.println("De overschrijving van 50 euro van piet naar an is gelukt!");
        }

        System.out.printf("Piet heeft momenteel %.2f als saldo%n", rekeningen[2].getSaldo());
        System.out.printf("An heeft momenteel %.2f als saldo%n", rekeningen[1].getSaldo());
        System.out.printf("Jan heeft momenteel %.2f als saldo%n", rekeningen[0].getSaldo());
        System.out.printf("De aangroeiintrest bedraagt momenteel: %.2f%n",rekeningen[0].getAangroeiIntrest());
        
        for (SpaarRekening r : rekeningen) {
            System.out.printf("%s%n", r);
        }
        System.out.println();
    }
}
