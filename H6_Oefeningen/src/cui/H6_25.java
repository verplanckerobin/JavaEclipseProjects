package cui;

import java.util.Scanner;

public class H6_25 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String resultaat = "C";
		int schaal;
		
		System.out.print("Geef de temperatuur (9999 om te stoppen): ");
		int temp = input.nextInt();
		
		while(temp != 9999) {
			
			System.out.print("Geef de schaal: Celcius of Fahrenheit (C=1 of F=2): "); //'' voor char
			schaal = input.nextInt();
			
			resultaat = geefTemperatuurStatus(temp, schaal == 1? 'C': 'F');
			
			System.out.printf("%d graden %s voelt aan als %s%n", temp, schaal == 1? "Celcius": "Fahrenheit", resultaat);
			
			System.out.print("Geef de temperatuur (9999 om te stoppen): ");
			temp = input.nextInt();
		}
		
		input.close();
	}

	private static String geefTemperatuurStatus(int temp, char cOfF) {
		
		if(cOfF == 'F') //'' voor char
			temp = (temp - 32) * 5 / 9;
		
		return H6_25.geefTemperatuurStatus(temp);
	}

	private static String geefTemperatuurStatus(int temp) { //temp = Celcius
		
		if(temp < 10)
			return "koud";
		if(temp <= 20)
			return "lauw";
		
		return "warm";
		
	}
	
}
