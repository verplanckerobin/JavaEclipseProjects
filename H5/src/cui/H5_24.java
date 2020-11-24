package cui;

import java.util.Scanner;

public class H5_24 {

	public static void main(String args[]) {
		
        String result = "";
        
        double [] omzetten = new double [12]; //index 0-11

        Scanner input = new Scanner(System.in);
        
        double som = 0;
        
        
        for (int i = 0; i < omzetten.length; i++) {
        	
        	System.out.printf("Geef de uitgaven in voor maand %d : ", i+1);
            omzetten[i] = input.nextDouble();
            som += omzetten[i];
        }
        
        double gem = som / omzetten.length;
        
    	for (int index = 0; index < omzetten.length; index++) {
    		if (omzetten[index] > gem)
    			result += (index + 1) + " ";
        }
        
        if (!result.equals("")) {
            System.out.printf("In de volgende maanden werd een omzet behaald groter dan het gemiddelde: %s%n", result);
            
        } else {
        	System.out.printf("Geen maanden gevonden die meer omzet hebben dan het gemiddelde!%n");
        }
        
        input.close();
    }
}