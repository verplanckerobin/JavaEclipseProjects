package oefeningen1;

import java.util.Scanner;

public class Oefening_6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int getal, duizendtallen, hondertallen, tientallen, eenheden;
		
		System.out.print("Geef een getal (>=999 en <=9999) in: ");
		getal = input.nextInt();
		
		duizendtallen = getal / 1000;
		hondertallen = (getal - (duizendtallen * 1000)) / 100;
		tientallen = (getal - (duizendtallen * 1000) - (hondertallen *100)) / 10;
		eenheden = (getal - (duizendtallen * 1000) - (hondertallen * 100) - (tientallen * 10)) / 1;
				
		System.out.printf("%d duizendtallen %n%d hondertallen %n%d tientallen %n%d eenheden", duizendtallen, hondertallen, tientallen, eenheden);
		
		input.close();

	}

}
