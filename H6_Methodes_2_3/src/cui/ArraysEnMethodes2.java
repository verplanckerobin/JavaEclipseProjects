package cui;

import java.util.Scanner;

public class ArraysEnMethodes2
{
	public static void main(String[] args)
	{
		if (args.length != 2)
		 {
			System.out.printf("Opgelet: er ontbreken argumenten!");
			return;
		 }
	// "6"
		int aantal = Integer.parseInt(args[0]);// double d = Double.parseDouble(...)
		// 6
		int[] temperaturen = new int[aantal];
		
		vulArray(temperaturen);
		
		toonArray(temperaturen);
		
		int[] tempn = vulArray(Integer.parseInt(args[1]));
		
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
		for (int temp:temperaturen)
			System.out.printf("%02d : %2d%n",tijdstip++,temp);
		
	}
	
	private static int[] vulArray(int aantal)
	{
	   Scanner input = new Scanner (System.in);
	   int[] temperaturen = new int[aantal];
	   for (int i = 0; i < temperaturen.length; i++)
	    {
	       System.out.printf("Geef getal %d: ",i + 1);
	       temperaturen[i] = input.nextInt();
	    }
	   return temperaturen;
	}
}





