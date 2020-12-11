package cui;

import java.util.Scanner;

public class ArraysEnMethodes
{

	public static void main(String[] args)
	{
		final int AANTAL = 6;
		int[] temperaturen = new int[AANTAL];
		
		vulArray(temperaturen);
		
		toonArray(temperaturen);
		
		int[] tempn = vulArray();
		
		toonArray(tempn);

	}
	
	private static void vulArray(int[] temperaturen)
	{
	   Scanner input = new Scanner (System.in);
	   for (int i = 0; i < temperaturen.length; i++)
	    {
	       System.out.printf("Geef getal %d: ",i + 1);
	       temperaturen[i] = input.nextInt();
	    }
	}
	
	private static void toonArray(int[] temperaturen)
	{
		int tijdstip = 1;
		for (int temp:temperaturen)//int[] temperaturen
			System.out.printf("%02d : %2d%n",tijdstip++,temp);
		
	}
	
	private static int[] vulArray()
	{
	   Scanner input = new Scanner (System.in);
	   
	   int[] temperaturen = new int[6];
	   for (int i = 0; i < temperaturen.length; i++)
	    {
	       System.out.printf("Geef getal %d: ",i + 1);
	       temperaturen[i] = input.nextInt();
	    }
	   return temperaturen;
	}
}






