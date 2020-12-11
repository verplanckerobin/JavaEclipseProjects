package cui;

import java.util.Scanner;

public class SomBerekenen
{

	public static void main(String[] args)
	{
		Scanner invoer = new Scanner(System.in);
		int n;
		
		System.out.print("Geef een geheel getal (>= 1): ");
		n = invoer.nextInt();
		System.out.printf("De som van de eerste %d getallen = %d.", n, berekenSom(n));
	}
/*
	private static int berekenSom(int n)
	{
		//berekenSom(6) = 1 + 2 + 3 + 4 + 5 + 6
		int som = 0;
		for(int i = 1 ; i <= n ; i++)
			som += i;
		return som;
	}*/
	
	//recursief
	private static int berekenSom(int n)
	{
		// basis case(s) -> hiermee begin je altijd
		if (n == 1)
			return 1;
		else // n > 1; berekenSom(n) = berekenSom(n-1) + n 
			return berekenSom(n-1) + n;
	}
}
