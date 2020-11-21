package cui;

import java.util.Scanner;

public class Extra4 {

	public static void main(String[] args) {
		
		 @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		 
		 int afstand, tijd = 0, teller, uren, minuten;
		 
		 do {
			 
			 System.out.print("Geef een afstand in kilometer (strikt positief geheel getal): ");
			 afstand = input.nextInt();
		 }
		 while(afstand <= 0);
		 
		 for(teller = 40; teller <= 140; teller += 10) {
			 tijd = (afstand * 60) / teller;
			 uren = tijd / 60;
			 minuten = tijd % 60;
			 System.out.printf("%3d km%9d km/u%7d u %d min%n", afstand, teller, uren, minuten);
		 }
		 
		 input.close();
	}

}
